# Kanban Flow

Kanban Flow is a full-stack project management application designed to help teams organize, track, and manage their work using Agile methodologies. It features a Spring Boot backend, a MariaDB database, and a web-based frontend.

## 🚀 Features

* **Project Management**: Create, update, and track multiple projects.

* **User Stories**: Define and manage user stories with details and status tracking (Backlog, In Scope, In Progress, Done).

* **Task Management**: Track individual tasks within the workspace.

* **Kanban Board**: A visual representation of work stages for efficient workflow management.

* **Integrated Documentation**: Built-in documentation system powered by MkDocs.

* **Calendar Sync**: Manage project timelines and schedules with integrated calendar support.

## 🛠️ Technology Stack

* **Backend**: Java, Spring Boot, Spring Data JPA.

* **Database**: MariaDB.

* **Frontend**: HTML5, CSS3 (Bootswatch Darkly), JavaScript (jQuery, Bootstrap 5).

* **Containerization**: Docker and Docker Compose.

* **Build Tool**: Maven.

## 📂 Project Structure

```text
[cite_start]├── app/                # Frontend web application files [cite: 440]
[cite_start]├── docs/               # Documentation source (MkDocs) [cite: 441]
├── src/
│   └── main/
[cite_start]│       ├── java/       # Spring Boot backend source code [cite: 573]
[cite_start]│       └── resources/  # Application configuration (properties) [cite: 449]
[cite_start]├── compose.yaml        # Docker Compose configuration [cite: 435]
├── Jenkinsfile         # CI/CD pipeline configuration
└── pom.xml             # Maven dependencies (referenced in readme.md)

```

## ⚙️ Installation & Setup

### Prerequisites

* Docker and Docker Compose
* Java 17+ (for local development)
* Maven (for local development)

### Running with Docker (Recommended)

The easiest way to get the entire stack running is using the provided `compose.bash` script:

```bash
chmod +x compose.bash
./compose.bash

```

This script will build and start the following services :

* **Database**: MariaDB (Port 3306)
* **phpMyAdmin**: Database management (Port 3380)
* **API**: Spring Boot Backend (Port 8888)
* **App**: Frontend Web UI (Port 8000)
* **Docs**: MkDocs Documentation (Port 8880)

### Local Development

To run the backend locally, ensure you have a MariaDB instance running and configure the environment variables in your IDE or via command line:

* `DB_HOST`: localhost
* `DB_PORT`: 3306
* `DB_NAME`: kanbanflow
* `DB_USER`: kanbanflow
* `DB_PASS`: kanbanflow

You can run the application using Maven:

```bash
mvn spring-boot:run

```

## 🔌 API Endpoints

The backend provides several RESTful endpoints:

* `GET /project`: List all projects.

* `PUT /project`: Create a new project.

* `GET /story`: List all user stories.

* `GET /calendar`: Fetch calendar data.

* `GET /health`: System health check.

## 🤝 Contributing

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes.
4. Push to the branch.
5. Open a Pull Request.

---

*Made with ❤ by [Software Shinobi*](https://softwareshinobi.online)
