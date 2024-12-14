FROM openjdk:21-jdk-oracle

COPY ./docker/antlr-4.13.2-complete.jar /usr/local/lib/antlr.jar

ENV CLASSPATH=.:/usr/local/lib/antlr.jar:${CLASSPATH}

COPY ./docker/.bashrc /root/.bashrc

RUN microdnf install -y libXrender libXtst libXi && microdnf clean all

ENV DISPLAY=:0