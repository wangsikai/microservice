FROM openjdk:8-jre
LABEL maintainer="jing.jiang@elanking.com"
RUN mkdir -p /opt/uxb/lib \
    && mkdir /opt/conf \
    && mkdir /opt/file \
    && mkdir /opt/uxb/logs \
    && mkdir /opt/jvm

VOLUME ["/opt/file","/opt/uxb/logs","/opt/jvm"]
COPY fs/intelligentCorrection-service-cli.jar /opt/uxb/lib
COPY fs/fonts /usr/share/fonts
COPY fs/accessibility.properties /etc/java-8-openjdk
WORKDIR /opt/uxb/lib
EXPOSE 8888
ENTRYPOINT ["java", "-jar","intelligentCorrection-service-cli.jar"]
