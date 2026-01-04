$(document).ready(function () {

    clearForm();

});

function clearForm() {

    $("#name").val("");

    $("#description").val("");

    $("#intention").val("");

    loadStatusSelection();

    loadAvailableProjects();

}

function loadStatusSelection() {

    console.debug("enter > loadStatusSelection");

    var html = '';

    html += '<option value="backlog">Backlog</option><option value="inscope">In Scope</option><option value="inprogress">In Progress</option><option value="done">Done</option>';

    $('#status').html(html);

}

function loadAvailableProjects() {

    console.debug("enter > loadAvailableProjects");

    $.ajax({

        type: "GET",

        url: apiURLBase + "/project",

        contentType: "text/plain",

        crossDomain: true,

        success: function (projects, status, jqXHR) {

            console.debug("projects / " + projects);

            var html = '';

            for (var i = 0; i < projects.length; i++) {

                html += '<option value="' + projects[i].id + '">' + projects[i].name + '</option>';

            }

            $('#selectProject').html(html);

        },

        error: function (jqXHR, status) {

            console.log("Something Went wrong");

            console.log(jqXHR);

        }

    });

}

function processForm() {

    console.debug("enter > processForm");

    userStoryName = $("#intention").val();

    storyPayload = JSON.stringify({

        project: { 
            id: $("#selectProject").val() 
        },               

        name: $("#intention").val(),

        description: $("#description").val(),

        status: $("#status").val(),

    });

    console.debug("projectPayload / ", storyPayload);

    $.ajax({

        type: "PUT",

        url: apiURLBase + "/story",

        data: storyPayload,

        contentType: "application/json; charset=utf-8",

        crossDomain: true,

        dataType: "text",

        success: function (data, status, jqXHR) {

            clearForm();

            notifySaveSuccess(userStoryName);

        },

        error: function (jqXHR, status) {

            console.log("error during request /", jqXHR);

            notifySaveFailure(userStoryName);

        }

    });

}

function notifySaveSuccess(userStoryName) {

    toastr.success(
            'The story "' + userStoryName + '" was created.',
            'Story Created',
            {timeOut: 5000});

}

function notifySaveFailure(projectPayload) {

    toastr.error(
            'The story "' + userStoryName + '" WAS NOT created.',
            'Story Creation Failure',
            {timeOut: 5000}

    );

}
