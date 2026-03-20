FROM maven:3.9.12-eclipse-temurin-21-alpine AS Builder
WORKDIR /opt/project
COPY ./pom.xml .
RUN ["mvn", "dependency:go-offline"]
COPY ./src ./src
RUN ["mvn", "package", "-DskipTests"]

FROM eclipse-temurin:21-alpine AS Executor
WORKDIR /opt/app
COPY --from=Builder /opt/project/target/*.jar ./app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

