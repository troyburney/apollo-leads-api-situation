FROM maven:3.9.6-eclipse-temurin-21-jammy AS mavenBuild

WORKDIR /

COPY . .

RUN mvn install -DskipTests

FROM eclipse-temurin:21-jre-alpine

COPY --from=mavenBuild /target/kanban-flow-dashboard-1.0.jar /kanban-flow-dashboard.jar

COPY --from=mavenBuild /src/main/resources/application.properties /application.properties

CMD ["java", "-jar", "/kanban-flow-dashboard.jar"] 
