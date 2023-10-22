# jwt_starter_backend

Run this on mySQLWorkbecnh to get the port on which your MYSQL is running:
SHOW GLOBAL variables LIKE 'PORT';

This port has to be confugured on application.properties file

Commit Role created details: The order is entity class -> Controller for endpoint -> Service class that will be called from the endpoint -> Dao to access the object of that type from the DB, for CRUD operations.
Upon running this, the tables etc are created, this is happenning because of the property i.e spring.jpa.hiberante.ddl-auto=create

Use postman to check this working and the approprite user should be added to the database. 

