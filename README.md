#swagger

* Tutorial: https://www.tutorialspoint.com/spring_boot/spring_boot_enabling_swagger2.htm


# Init

Start Server: http://localhost:8080/v2/api-docs

Command Line:
After “BUILD SUCCESS”, you can find the JAR file under the target directory.

For Gradle, you can use the command as shown here −

- gradle clean build

After “BUILD SUCCESSFUL”, you can find the JAR file under the build/libs directory.

Now, run the JAR file by using the command shown here −

 - java –jar <JARFILE>

Now, the application will start on the Tomcat port 8080 as shown −

Started Application on Tomcat Port 8080
Now, hit the URL in your web browser and see the Swagger API functionalities.

http://localhost:8080/swagger-ui.html