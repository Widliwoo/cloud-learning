FROM openjdk:20-jdk-buster
COPY target/age-service-*.jar /var/app/age-service.jar
WORKDIR /var/app

ENTRYPOINT ["java", "-jar", "age-service.jar"]