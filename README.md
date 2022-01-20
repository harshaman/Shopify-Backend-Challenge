# Shopify-Backend-Challenge
Shopify Backend Challenge for Backend Developer Internship - Summer 2022

# Built With
Java 11
Spring Boot
Apache Maven
PostgreSQL 14

# Installation
1. Ensure Java 11 and Maven is installed.
2. Download the project and import it in an IDE (Spring Tool Suite or IntelliJ).
3. Setup Database by importing sqlfile.sql. This will create the requried Database and Schemas required for running the application.
4. Import the JSON file containing postman collection of the REST APIs.
5. Ensure the sql connection string defined in the application.properties is correct. Update the connection string, if requires.
6. Ensure the port 8080 is available. If the port is to be updated, add the following property to the application.yml before running the application:
server:
  port: <<AVAILABLE_PORT_NO>>
7. Run the application as Spring Boot application.
8. To "Export CSV" of the list of products in the inventory: Go the following endpoint in a browser: localhost:8080/export.html.
