FROM adoptopenjdk/openjdk11:jdk-11.0.8_10-alpine
RUN apk --no-cache add curl
WORKDIR .
COPY build/libs/swadeshness-project0.2.0-SNAPSHOT.jar .
CMD ["java", "-jar", "swadeshness-project-0.0.1-SNAPSHOT.jar"]
HEALTHCHECK CMD curl -sSk http://localhost:8080/actuator/health || exit 1
