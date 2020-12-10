FROM openjdk:8-jre-alpine
COPY ./target/${JAR_FILE} /apps/app.jar

CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/app.war"]