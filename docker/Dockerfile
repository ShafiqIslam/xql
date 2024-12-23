FROM maven:3.9.9-eclipse-temurin-21

COPY ./docker/antlr-4.13.2-complete.jar /usr/local/lib/antlr.jar

ENV CLASSPATH=.:/usr/local/lib/antlr.jar:${CLASSPATH}

COPY ./docker/.bashrc /root/.bashrc

RUN apt-get update && apt-get install -y libxrender1 libxtst6 libxi6 && apt-get clean all

ENV DISPLAY=:0