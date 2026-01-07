$(document).ready(function () {
    // Initial clear and fetch
    clearIntention();
    fetchIntention();

    // Refresh intention every 8 seconds
    setInterval(fetchIntention, 8000);

    // Auto-focus input when the modal is shown
    $('#setIntentionModal').on('shown.bs.modal', function () {
        $('#newIntention').focus();
    });
});

/**
 * Resets the input field for the new intention
 */
function clearIntention() {
    console.debug("enter > clearIntention");
    $("#newIntention").val("");
}

/**
 * Fetches the current intention from the API and updates the UI
 */
function fetchIntention() {
    console.debug("enter > fetchIntention");

    $.ajax({
        type: "GET",
        url: apiURLBase + "", // Note: Ensure your config.js provides the full endpoint path if needed
        crossDomain: true,
        dataType: "text",
        success: function (response) {
            console.debug("fetchIntention > success");

            // The large display text in the center of the screen
            $("#intention").text(response);

            // The read-only field inside the modal
            $("#currentIntention").val(response);
        },
        error: function (exception) {
            console.error("error fetching intention / ", exception);
        }
    });
}

/**
 * Sends the new intention to the API and refreshes the display
 */
function setIntention() {
    console.debug("enter > setIntention");

    const newIntentionValue = $("#newIntention").val().trim();

    if (!newIntentionValue) {
        console.warn("setIntention > attempt to set empty intention ignored");
        return;
    }

    const payload = JSON.stringify({
        intention: newIntentionValue
    });

    $.ajax({
        type: "POST",
        url: apiURLBase + "",
        data: payload,
        contentType: "application/json; charset=utf-8",
        crossDomain: true,
        dataType: "text",
        success: function (response) {
            console.debug("setIntention > success / " + response);

            // Immediately update the UI
            fetchIntention();

            // Clear the form for the next use
            clearIntention();
        },
        error: function (exception) {
            console.error("error setting intention / ", exception);
        }
    });
}
