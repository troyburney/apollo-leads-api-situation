#!/bin/bash

# Configuration
API_URL="http://localhost:8888/project"

echo "🔍 Pulling all projects from the pipeline..."

# Simple GET request to fetch the list
curl -X GET "$API_URL" \
     -H "Accept: application/json"

echo -e "\n\n✅ Data retrieved. Review the output to ensure your 'projectList' isn't empty."
