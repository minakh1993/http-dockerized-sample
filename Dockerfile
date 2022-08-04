FROM openjdk:17

WORKDIR /app

RUN chmod 777 /app

ARG ENV_PORT

ENV SAMPLE_APP_PORT=$ENV_PORT

ADD /target/http-dockerized-sample-*.jar /app/http-dockerized-sample.jar

CMD ["java", "-jar", "http-dockerized-sample.jar"]