Task:
   Create a RESTful API

	Given this url: /users/1

	Return the following information:

	First Name: Homer
	Last Name: Simpson
	Username: homer
	age: 42

# SpringBoot-MVC-application
Springboot User CRUD application

This is a sample Spring Boot Application that uses 
  1. JDBC
  2. Mysql
  3. JPA
  4. MVC
  5. Gradle
  
To use this application follow the steps listed below
  1. git clone git@github.com:DayleChettiar/UsersCrud.git
  2. go to this directory
  3. add mysql database name and password in application.properties
  4. go to mysql and create a database with name mentioned in application.properties
  5. run commands
       springboot:run;
  
GetAll: curl -i -H "Content-Type: application/json" -X GET http://localhost:8080/users/

Get: curl -i -H "Content-Type: application/json" -X GET http://localhost:8080/user/1

Create: curl -i -H "Content-Type:application/json" -X POST –-data "{\"id\":\"007\",\"firstname\":\"Carlisle\", \"lastname\":\"Wang\",\"userName\":\"cWang\",\"age\":\"25\"}" http://localhost:8080/create

Update: curl -i -H "Content-Type:application/json" -X PUT –-data "{\"id\":\"007\",\"firstname\":\"Carlisle\", \"lastname\":\"Wang\",\"userName\":\"cWang\",\"age\":\"25\"}" http://localhost:8080/users
  
  
 
  
