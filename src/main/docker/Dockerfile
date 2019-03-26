FROM openjdk:8-jdk-alpine

ADD /var/lib/jenkins/workspace/Docker-pipeline/target/*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
