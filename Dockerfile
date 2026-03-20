FROM maven:3.9.12-eclipse-temurin-21-alpine AS builder
WORKDIR /opt/project
COPY ./pom.xml .
RUN ["mvn", "dependency:go-offline"]
COPY ./src ./src
RUN ["mvn", "package", "-DskipTests"]

FROM eclipse-temurin:21-alpine AS executor
WORKDIR /opt/app
COPY --from=builder /opt/project/target/*.jar ./app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]