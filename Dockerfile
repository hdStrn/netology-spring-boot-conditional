FROM openjdk:17-jdk-alpine
EXPOSE 8081
ADD build/libs/netology-spring-boot-conditional-0.0.1-SNAPSHOT.jar prodapp.jar
ENTRYPOINT ["java","-jar","/prodapp.jar"]
