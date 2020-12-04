FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/heroku-deploy-0.0.1-SNAPSHOT-spring-boot.jar heroku-deploy-0.0.1-SNAPSHOT-spring-boot.jar
CMD [“java”,”-Djava.security.egd=file:/dev/./urandom”,”-jar”,”/heroku-deploy-0.0.1-SNAPSHOT-spring-boot.jar”]

