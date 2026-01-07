$(document).ready(function () {
    paintStoryInProgress();
    setInterval(paintStoryInProgress, 1000 * 8);
});

function paintStoryInProgress() {
    console.debug("enter > paintStoryInProgress");

    $.ajax({
        type: "GET",
        url: apiURLBase + "/story/status/inprogress",
        contentType: "text/plain",
        crossDomain: true,
        success: function (data) {
            injectStoryContentIntoTable(data);
        },
        error: function (jqXHR) {
            console.log("Something Went wrong", jqXHR);
        }
    });
}

function injectStoryContentIntoTable(storyList) {
    var html = '';
    var selectedProjectID = parseInt(projectID());

    for (var index = 0; index < storyList.length; index++) {
        var story = storyList[index];
        var currentProjectID = parseInt(story.project.id);

        // Filter: Only show stories for the currently selected project
        if (selectedProjectID !== currentProjectID) {
            continue;
        }

        html += '<tr>';
        
        // Column 1: ID / Icon
        html += '<td><span class="text-info fw-bold">#' + story.id + '</span></td>';

        // Column 2: Name
        html += '<td class="fw-bold">' + story.name + '</td>';

        // Column 3: Description
        html += '<td class="small text-muted">' + (story.description || "") + '</td>';

        // Column 4: Intention
        html += '<td><span class="badge border border-secondary text-uppercase">' + (story.intention || "N/A") + '</span></td>';

        // Column 5: Progress / Status
        html += '<td>';
        html += '  <div class="progress progress-sm" style="height: 10px;">';
        html += '    <div class="progress-bar bg-success" role="progressbar" style="width: 50%"></div>';
        html += '  </div>';
        html += '  <small class="text-success">' + story.status + '</small>';
        html += '</td>';

        // Column 6: Actions
        html += '<td class="text-end">';
        html += '    <a onclick="setEditStoryID(' + story.id + ')" class="btn btn-outline-info btn-sm" href="update.html">';
        html += '        <i class="fas fa-external-link-alt me-1"></i> Open';
        html += '    </a>';
        html += '</td>';

        html += '</tr>';
    }

    // Target the tbody of the table
    $('#project-list').html(html);
}
