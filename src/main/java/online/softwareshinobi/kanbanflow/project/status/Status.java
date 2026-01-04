package online.softwareshinobi.kanbanflow.project.status;

public enum Status {
    backlog,
    /**
     * Maps to 'In Scope' in the UI
     */
    inscope,
    /**
     * Maps to 'In Progress' in the UI
     */
    inprogress,
    /**
     * Maps to 'Done' in the UI
     */
    done;
}
