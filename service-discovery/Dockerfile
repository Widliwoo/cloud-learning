FROM openjdk:20-jdk-buster
COPY target/service-discovery*.jar /var/app/service-discovery.jar
WORKDIR /var/app

ENTRYPOINT ["java", "-jar", "service-discovery.jar"]