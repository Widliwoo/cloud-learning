FROM openjdk:20-jdk-buster
COPY target/greeting-service-*.jar /var/app/greeting-service.jar
WORKDIR /var/app

ENTRYPOINT ["java", "-jar", "greeting-service.jar"]