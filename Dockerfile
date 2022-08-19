FROM java:11

EXPOSE 9001

ADD target/user_service.jar user_service.jar

ENTRYPOINT ["java","-jar","user_service.jar"]


