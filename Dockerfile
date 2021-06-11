FROM openjdk:8-jdk-alpine 
EXPOSE 8080 
COPY D:\2021\TATAMOTORS\assorted-icicle\target\*.jar /assorted-icicle.jar
#ADD RegistrationService.jar 
ENTRYPOINT ["java","-jar","/assorted-icicle.jar"]



