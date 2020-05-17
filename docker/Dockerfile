FROM adoptopenjdk/openjdk11-openj9:jre-11.0.7_10_openj9-0.20.0-alpine
WORKDIR /app
COPY app.jar .
ENTRYPOINT java -jar app.jar -g 'daemon off;'