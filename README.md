
![image-151](https://github.com/thegeekplanets/springboot-log4j/assets/155982233/6932ddd7-81ec-48c9-8429-45d6c3255181)


This spring boot application implements the Log4J version 2 along with the Sample Rest service and swagger UI to trigger the rest services.

Features:
1. Using Log4J Version 2 and Spring Boot Version 3
2. Swagger UI Integration
3. Sample Rest Service with Swagger UI Annotations
4. Log4J configuration for console logs
5. Lo4J Configuration for creating a new log file based on date/time.

Future Work:
1. Configure Log4J for database table logging. i.e JDBCAppender 
2. Tryout AsyncAppender 

Steps to run the application
1. clone the repository
2. mvn clean install -Dmaven.test.skip=true
3. Run as Java Application ( SpringbootLog4jApplication )
4. Check the console

Study Material:
1. https://stackify.com/log4j2-java/
