$(document).ready(function () {
    toastr.info(
        'Project Story Board',
        'Viewing story board for: "' + projectName() + '".',
        {timeOut: 5000}
    );

    visualizeProjectUserStories();

    // Refresh every 10 seconds
    setInterval(visualizeProjectUserStories, 1000 * 10);
});

function visualizeProjectUserStories() {
    console.debug("enter > visualizeProjectUserStories");

    // Update Banner if it exists
    $('#pageTitleBanner').html(projectName());

    visualizeProjectBacklogUserStories();
    visualizeProjectTodoUserStories();
    visualizeProjectInprogressUserStories();
    visualizeProjectDoneUserStories();
}

/**
 * Generates the HTML for the Kanban Cards matching the new Darkly template
 * Preserves the setEditStoryID functionality for the update flow
 */
function ffilter(storyList) {
    var html = '';
    var selectedProjectID = parseInt(projectID());

    for (var index = 0; index < storyList.length; index++) {
        var story = storyList[index];
        var currentProjectID = parseInt(story.project.id);

        // Filter stories to only show those belonging to the active project
        if (selectedProjectID !== currentProjectID) {
            continue;
        }

        // Build the Darkly-styled Kanban Card
        // Added data attribute for future drag-and-drop persistence
        html += '<div class="kanban-card shadow-sm" data-id="' + story.id + '">';
        
        // Header row with Name and the Edit button
        html += '  <div class="d-flex justify-content-between align-items-start mb-2">';
        html += '    <h6 class="mb-0 text-info fw-bold">' + story.name + '</h6>';
        
        // EDIT BUTTON - Preserved setEditStoryID logic
        html += '    <a onclick="setEditStoryID(' + story.id + ')" href="/story/update.html" class="btn btn-link p-0 text-secondary" title="Edit Story">';
        html += '       <i class="fas fa-pen-to-square"></i>';
        html += '    </a>';
        html += '  </div>';

        // Description text
        html += '  <p class="text-light small mb-3 opacity-75">' + (story.description || 'No description.') + '</p>';
        
        // Footer: ID Badge and Intention Tag
        html += '  <div class="d-flex justify-content-between align-items-center mt-2">';
        html += '    <span class="badge bg-primary px-2 py-1">#' + story.id + '</span>';
        
        if(story.intention) {
            html += '    <span class="text-uppercase text-muted fw-bold" style="font-size: 0.65rem; letter-spacing: 0.5px;">';
            html += '      <i class="fas fa-bullseye me-1"></i>' + story.intention;
            html += '    </span>';
        }
        
        html += '  </div>';
        html += '</div>';
    }

    return html;
}

function visualizeProjectBacklogUserStories() {
    $.ajax({
        type: "GET",
        url: apiURLBase + "/story/status/backlog",
        contentType: "text/plain",
        crossDomain: true,
        success: function (storyList) {
            const html = ffilter(storyList);
            $('#backlog').html(html); // Updated ID to match new template
            updateCounts(); // Refresh the badge counts
        }
    });
}

function visualizeProjectTodoUserStories() {
    $.ajax({
        type: "GET",
        url: apiURLBase + "/story/status/inscope",
        contentType: "text/plain",
        crossDomain: true,
        success: function (storyList) {
            const html = ffilter(storyList);
            $('#todo').html(html); // Updated ID to match new template
            updateCounts();
        }
    });
}

function visualizeProjectInprogressUserStories() {
    $.ajax({
        type: "GET",
        url: apiURLBase + "/story/status/inprogress",
        contentType: "text/plain",
        crossDomain: true,
        success: function (storyList) {
            const html = ffilter(storyList);
            $('#inprogress').html(html); // Updated ID to match new template
            updateCounts();
        }
    });
}

function visualizeProjectDoneUserStories() {
    $.ajax({
        type: "GET",
        url: apiURLBase + "/story/status/done",
        contentType: "text/plain",
        crossDomain: true,
        success: function (storyList) {
            const html = ffilter(storyList);
            $('#done').html(html); // Updated ID to match new template
            updateCounts();
        }
    });
}

/**
 * Helper to update the pill badges at the top of columns
 */
function updateCounts() {
    $(".kanban-column").each(function() {
        const count = $(this).find(".kanban-card").length;
        $(this).find(".task-count").text(count);
    });
}
