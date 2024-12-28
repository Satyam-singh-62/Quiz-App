
FROM openjdk:23-jdk

WORKDIR /app

COPY target/c-Quiz-0.0.1-SNAPSHOT.jar c-quiz.jar

EXPOSE 9092

ENTRYPOINT ["java","-jar","c-quiz.jar"]