
$(document).ready(function () {

    toastr.info(
            'Project Story Board',
            'viewing story board for: "' + projectName() + '".',
            {timeOut: 5000});

    visualizeProjectUserStories();

    setInterval(visualizeProjectUserStories, 1000 * 10);

});

function visualizeProjectUserStories() {

    console.debug("enter > visualizeProjectUserStories");

    $('#pageTitleBanner').html(projectName());

    visualizeProjectBacklogUserStories();

    visualizeProjectTodoUserStories();

    visualizeProjectInprogressUserStories();

    visualizeProjectDoneUserStories();

}

function ffilter(storyList) {

    var html = '';

    for (var index = 0; index < storyList.length; index++) {

        console.debug("storyList[i].id > ", storyList[index].id);

        console.debug("storyList[i].intention > ", storyList[index].intention);

        console.debug("storyList[i].project > ", storyList[index].project);

        console.debug("projectID / ", projectID());

        console.debug("projectName / ", projectName());

        //

console.log("the ID " + index);

console.log("the value " + storyList[index]);

        var selectedProjectID = parseInt(projectID());

        var currentProjectID = parseInt(storyList[index].project.id);

        console.log("selectedProjectID / ", selectedProjectID);

        console.log("currentProjectID / ", currentProjectID);

        //

        if (selectedProjectID === currentProjectID) {

            console.log("is a match");

        } else {

            console.log("is NOT a match");

            continue;

        }

        html += '<div class="card card-light card-outline">';
        html += ' <div class="card-header">';
        html += ' <h5 class="card-title">';
        html += storyList[index].name;
        html += ' </h5>';
        html += ' <div class="card-tools">';

        html += '<a onclick="setEditStoryID(' + storyList[index].id + ')" href="/story/update.html" class="btn btn-tool btn-link">#';
        html += storyList[index].id;
        html += '</a>';
        html += ' <a onclick="setEditStoryID(' + storyList[index].id + ')" href="/story/update.html" class="btn btn-tool">';
        html += ' <i class="fas fa-pen"></i>';
        html += ' </a>';
        html += ' </div>';
        html += ' </div>';

        html += ' <div class="card-body">';
        html += ' <p>';
        html += storyList[index].description;
        html += ' </p>';
        html += ' </div>';

        html += ' </div>';

    }

    return html;

}
function visualizeProjectBacklogUserStories() {

    console.debug("enter > visualizeProjectBacklogUserStories");

    $.ajax({

        type: "GET",

        url: apiURLBase + "/story/status/backlog",

        contentType: "text/plain",

        crossDomain: true,

        success: function (storyList, status, jqXHR) {

            const html = ffilter(storyList);

            console.log("html", html);

            $('#backlog-body').html(html);

        },

        error: function (jqXHR, status) {

            console.log("Something Went wrong", jqXHR);

        }

    });

}

function visualizeProjectTodoUserStories() {

    console.debug("enter > visualizeProjectInScopeUserStories");

    $.ajax({

        type: "GET",

        url: apiURLBase + "/story/status/inscope",

        contentType: "text/plain",

        crossDomain: true,

        success: function (storyList, status, jqXHR) {

            const html = ffilter(storyList);

            console.log("html", html);

            $('#todo-body').html(html);

        },

        error: function (jqXHR, status) {

            console.log("Something Went wrong");

            console.log(jqXHR);

        }

    });

}

function visualizeProjectInprogressUserStories() {

    console.debug("enter > visualizeProjectInprogressUserStories");

    $.ajax({

        type: "GET",

        url: apiURLBase + "/story/status/inprogress",

        contentType: "text/plain",

        crossDomain: true,

        success: function (storyList, status, jqXHR) {

            const html = ffilter(storyList);

            console.log("html", html);
            
            $('#inprogress-body').html(html);

        },

        error: function (jqXHR, status) {

            console.log("Something Went wrong");

            console.log(jqXHR);

        }

    });

}

function visualizeProjectDoneUserStories() {

    console.debug("enter > visualizeProjectDoneUserStories");

    $.ajax({

        type: "GET",

        url: apiURLBase + "/story/status/done",

        contentType: "text/plain",

        crossDomain: true,

        success: function (storyList, status, jqXHR) {

            const html = ffilter(storyList);

            console.log("html", html);

            $('#done-body').html(html);

        },

        error: function (jqXHR, status) {

            console.log("Something Went wrong");

            console.log(jqXHR);

        }

    });

}
