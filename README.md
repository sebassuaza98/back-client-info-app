Especificaciones tecnicas del proyecto:
--Java 17 Spring Boot 3.3.0 Maven 3.0
--Mysql 8.0 --Maven 3.0 --JDK 21 --Text editor (VsCode) 
--SDK

Clone the repo

https://github.com/sebassuaza98/back-client-info-app.git Install packages Una vez clonado el repositorio,
ejecutamos en el proyecto el comando, para cargar dependencias 
mvn clean install

Getting Started 
Si se desea ejecutar el api de forma local se deber ejecutar el siguiente comando en la consola del proyecto: 
El puerto de ejecuccion ES EL : 8090
Comaando  PARA EJECUTAR EL API EN EL AMBIENTE LOCAL .\mvnw.cmd spring-boot:run

Nota: NO se consume bases de datos, la informacion esta mockeada y esta almacenada en:
clientinfo\src\main\resources/clients.json

src
 ├── main
 │    ├── java
 │    │    └── com
 │    │         └── example
 │    │              └── clientinfo
 │    │                   ├── ClientInfoApplication.java
 │    │                   ├── controller
 │    │                   │    └── ClientController.java
 │    │                   ├── model
 │    │                   │    └── Client.java
 │    │                   ├── service
 │    │                   │    └── ClientService.java
 │    │                   └── exception
 │    │                        └── CustomException.java
 │    └── resources
 │        ├── application.properties
 │        └── clients.json

 
