FROM java:8
VOLUME /tmp
ADD trainer.jar qacinemas.jar
RUN bash -c 'touch /qacinemas.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/qacinemas.jar"]