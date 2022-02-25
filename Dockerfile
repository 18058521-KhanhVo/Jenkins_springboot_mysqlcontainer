FROM openjdk:11
LABEL maintainer="employee-jdbc"
ADD target/api-0.0.1-SNAPSHOT.jar employee.jar
ENTRYPOINT ["java","-jar","employee.jar"]
export DOCKER_BUILDKIT=0
export COMPOSE_DOCKER_CLI_BUILD=0
