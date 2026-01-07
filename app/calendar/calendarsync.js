$(document).ready(function () {

    setTimeout(getCalendarDetailsFromServer, 1000 * 0);

//    resetServerCalendarDetails();

});

function getCalendarDetailsFromServer() {

	console.debug("enter -> getCalendarDetailsFromServer");

	$.ajax({

		type: "GET",

		url: apiURLBase + "/calendar",

		crossDomain: true,

		dataType: "text",


success: function (calendarData) {
    console.log("Received data:", calendarData);

    // Clear existing events to prevent duplicates
    valorantCalendar.removeAllEvents();

    try {
        // If your server returns a JSON string, parse it.
        // If it's already an object, use it directly.
        var data = (typeof calendarData === "string") ? JSON.parse(calendarData) : calendarData;

        // The server stores the array in a 'content' field as a stringified JSON
        var events = JSON.parse(data.content);

        events.forEach(function(element) {
            valorantCalendar.addEvent({
                title: element.title,
                start: element.start,
                end: element.end,
                backgroundColor: element.backgroundColor,
                allDay: element.allDay
            });
        });
        console.log("Calendar Synced.");
    } catch (e) {
        console.error("Error parsing calendar data:", e);
    }
},
		error: function (exception, status) {

			console.log("error issuing request");

			console.log("status / " + status);

			console.log("exception / " + exception);

		}

	});

}

function saveCalendarChanges() {

// alert("saveCalendarChanges");
	console.debug("enter -> saveCalendarChanges");

//////////////////////////////////////////

    console.log("valorantCalendar",valorantCalendar);    

    valorantCalendarEvents = valorantCalendar.getEvents()

    console.log("valorantCalendarEvents",valorantCalendarEvents);    

//////////////////////////////////////////

    valorantCalendarEventsJSON = JSON.stringify(valorantCalendarEvents);

    console.log("proper json / ",valorantCalendarEventsJSON);    

//////////////////////////////////////////

	payload = JSON.stringify({

        id: 1,

        content: valorantCalendarEventsJSON,

	});

console.log("payload!! / ",payload);

//////////////////////////////////////////

	$.ajax({

		type: "PUT",

		url: apiURLBase + "/calendar",

		data: payload,

		contentType: "application/json; charset=utf-8",

		crossDomain: true,

       dataType: "json", // Expect a JSON response, jQuery will parse it

		success: function (response, status, jqXHR) {

            console.log("response / " + response);

//            alert(response);

		},

		error: function (exception, status) {

			console.log("error issuing request");

			console.log("status / " + status);

			console.log("exception / " + exception);

		}

	});

}

//////////////////////////////////////////

function resetServerCalendarDetails() {

	payload = JSON.stringify({

        intention: "",        

	});

	$.ajax({

		type: "POST",

		url: apiURLBase + "/calendar",

		data: payload,

		contentType: "application/json; charset=utf-8",

		crossDomain: true,

		dataType: "text",

		success: function (response, status, jqXHR) {

            console.log("response / " + response);

            getUniverseIntention();

		},

		error: function (exception, status) {

			console.log("error issuing request");

			console.log("status / " + status);

			console.log("exception / " + exception);

		}

	});

}
