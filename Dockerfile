FROM eclipse-temurin:17
COPY target/myjavaapps.jar myjavaapps.jar
CMD [ "java","-jar","myjavaapps.jar" ]