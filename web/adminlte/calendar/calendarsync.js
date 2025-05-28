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
            // calendarData is now an object e.g., {id: 1, content: "[{event1},{event2}]"}
            // calendarData.content is expected to be a JSON string of events.
            console.log("Simplified: Received calendarData object:", calendarData);

            var eventsArray = JSON.parse(calendarData); // Parse the inner JSON string into an array


            console.log("Simplified: Parsed eventsArray:", eventsArray);

            // valorantCalendar.removeAllEvents(); // Consider clearing events if function is called multiple times

var b = JSON.parse(eventsArray.content);

            console.log("Simplified: Parsed b:", b);

console.log("type / " + typeof b); // "string"

 $(b).each(function(index, element) {

                console.log("element / " + index + " / " + element.title);

                valorantCalendar.addEvent({

                    title: element.title,

                    start: element.start,

                    end: element.end,

                    backgroundColor: element.backgroundColor,

                });

            });

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
