#!/bin/bash

# Configuration - Match your application.properties
API_URL="http://localhost:8888/project"

echo "🚀 Sending build-and-scale request to: $API_URL"

# The Payload - Matching your Project.java fields [cite: 106, 107, 108, 110, 111]
curl -X PUT "$API_URL" \
     -H "Content-Type: application/json" \
     -d '{
          "name": "Acquisition Growth Plan",
          "description": "Standardizing the sales process for 10x output",
          "intention": "Dominate the market and provide insane value",
          "calendar": "Q1-2026",
          "client": "Hormozi Enterprises"
         }'

echo -e "\n\n✅ Request dispatched. Check your logs for the 'enter > createProject' output."
