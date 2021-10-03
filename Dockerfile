FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package  -Dmaven.test.skip

FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} miniproject1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/miniproject1-0.0.1-SNAPSHOT.jar"]