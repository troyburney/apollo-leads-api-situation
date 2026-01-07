#!/usr/bin/env python3

import sys

from utility import update_html_section

htmlFilePath = None

if len(sys.argv) > 1:

    htmlFilePath = sys.argv[1]

    print(f"target HTML file path: '{htmlFilePath}'")

else:

    print("No HTML file path provided as a command-line argument.")

    print(f"Usage: ./templater.py <path_to_html_file>")

    sys.exit(1)

def update_section_css_includes():

    markerBegin = "<!-- html / styling / begin -->"

    markerEnd = "<!-- html / styling / end -->"

    templateFilePath = 'templates/css.template'

    update_html_section(htmlFilePath, templateFilePath, markerBegin, markerEnd)

def update_section_js_includes():

    markerBegin = "<!-- html / scripting / begin -->"

    markerEnd = "<!-- html / scripting / end -->"

    templateFilePath = 'templates/javascript.template'

    update_html_section(htmlFilePath, templateFilePath, markerBegin, markerEnd)

def update_section_generation_includes():

    markerBegin = "<!-- generation / scripting / begin -->"

    markerEnd = "<!-- generation / scripting / end -->"

    templateFilePath = 'templates/generation.template'

    update_html_section(htmlFilePath, templateFilePath, markerBegin, markerEnd)

def update_section_menu():

    markerBegin = "<!-- html / menu / begin -->"

    markerEnd = "<!-- html / menu / end -->"

    templateFilePath ='templates/menu.template'

    update_html_section(htmlFilePath, templateFilePath, markerBegin, markerEnd)

def update_section_sidebar():

    markerBegin = "<!-- html / sidebar / begin -->"

    markerEnd = "<!-- html / sidebar / end -->"

    templateFilePath ='templates/sidebar.template'

    update_html_section(htmlFilePath, templateFilePath, markerBegin, markerEnd)

def update_section_footer():

    markerBegin = "<!-- html / footer / begin -->"

    markerEnd = "<!-- html / footer / end -->"

    templateFilePath ='templates/footer.template'

    update_html_section(htmlFilePath, templateFilePath, markerBegin, markerEnd)

def update_section_action_buttons():

    markerBegin = "<!-- html / action buttons / begin -->"

    markerEnd = "<!-- html / action buttons / end -->"

    templateFilePath ='templates/buttons.template'

    update_html_section(htmlFilePath, templateFilePath, markerBegin, markerEnd)

def update_section_body():

    markerBegin = "<!-- html / body / begin -->"

    markerEnd = "<!-- html / body / end -->"

    templateFilePath ='templates/body.template'

    update_html_section(htmlFilePath, templateFilePath, markerBegin, markerEnd)

def update_section_main():

    markerBegin = "<!-- html / main / begin -->"

    markerEnd = "<!-- html / main / end -->"

    templateFilePath ='templates/main.template'

    update_html_section(htmlFilePath, templateFilePath, markerBegin, markerEnd)

###################################################################
##
## driver
##
###################################################################

update_section_css_includes()

update_section_js_includes()

update_section_menu()

update_section_body()

update_section_main()

update_section_footer()

update_section_generation_includes()

update_section_action_buttons()

