FROM openjdk:17

WORKDIR /app

RUN chmod 777 /app

ADD /target/http-dockerized-sample-*.jar /app/http-dockerized-sample.jar

CMD ["java", "-jar", "http-dockerized-sample.jar"]