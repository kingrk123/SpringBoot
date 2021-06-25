 #From <image>
 FROM openjdk:8
 #Temp Run location
 VOLUME /tmp
 #Provide port information
 EXPOSE 8080
 #jar Location to mapping name
 ADD target/SpringBootwithDocker-1.0.jar SpringBootwithDocker-1.0.jar
 #jar Execution command
 ENTRYPOINT ["java", "-jar", "/SpringBootwithDocker-1.0.jar"]