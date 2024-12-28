FROM openjdk:23-jdk

WORKDIR /app

COPY target/

EXPOSE 8080

ENTRYPOINT ["java","-jar","my-app.jar"]