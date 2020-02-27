FROM openjdk:8-jre-alpine
 
VOLUME /tmp

ARG JAR_FILE=target/HelloWorld.jar

ADD HelloWorld.jar HelloWorld.jar

ENTRYPOINT ["java","-jar","/HelloWorld.jar"]

CMD ["java","-jar","/HelloWorld.jar"]
