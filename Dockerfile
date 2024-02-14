FROM gradle:7.6.4-jdk17-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:17-jdk-alpine

RUN mkdir /app
# Install necessary tools
#RUN apt-get update && \
#    apt-get install -y wget xvfb libxi6 libgconf-2-4
# Install necessary tools
RUN apk update && \
    apk add --no-cache wget ca-certificates && \
    apk add --no-cache wget xvfb chromium chromium-chromedriver

RUN chmod +x /usr/bin/chromedriver




COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar

ENTRYPOINT ["java","-jar","/app/spring-boot-application.jar"]