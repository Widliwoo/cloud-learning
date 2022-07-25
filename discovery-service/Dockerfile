FROM openjdk:20-jdk-buster
COPY target/discovery-service-*.jar /var/app/discovery-service.jar
WORKDIR /var/app

ENTRYPOINT ["java", "-jar", "discovery-service.jar"]