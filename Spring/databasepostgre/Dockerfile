FROM eclipse-temurin:21-jdk-alpine
LABEL maintainer="roniantonius"
COPY target/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]