FROM ubuntu:latest
RUN apt-get update

FROM openjdk:8
COPY ./IMT2018073-Calculator/target/IMT2018073-Calculator-latest.jar ./
WORKDIR ./
CMD ["java", "-cp", "IMT2018073-Calculator-latest.jar", "Calculator"]