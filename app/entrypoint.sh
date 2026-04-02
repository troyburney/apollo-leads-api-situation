#!/bin/sh

TEMPLATE_PATH="/usr/share/nginx/html/assets/js/api/server.js.template"

OUTPUT_PATH="/usr/share/nginx/html/assets/js/api/server.js"

##
## Replace the placeholder in the template with the API_URL environment variable
##

envsubst '$API_URL' < "$TEMPLATE_PATH" > "$OUTPUT_PATH"

##
## Execute the main command (start Nginx) that was passed to the entrypoint
##

exec "$@"
