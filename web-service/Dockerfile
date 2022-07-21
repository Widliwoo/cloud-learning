FROM openjdk:20-jdk-buster
COPY target/web-service-*.jar /var/app/web-service.jar
WORKDIR /var/app

ENTRYPOINT ["java", "-jar", "web-service.jar"]