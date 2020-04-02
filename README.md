## GEOSURA-test


### DEMO Web App

https://geosura-test.herokuapp.com/


### Local installation 
#### Requeriments

* Spring Boot - 2.2.6
* JDK - 1.8 or later
* Spring Framework - 5.2.5
* Hibernate 
* JPA
* Apache Maven - 3.6
* PostgreSQL 10.2
* PostGIS 2.5

Clone this repo.

*git clone https://github.com/AndresHerrera/geosura-test.git*

*cd geosura-test*


#### Configuring Spring Boot to use PostgreSQL
needed to configure postgresql connectivity into application.properties:

```config
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=none
spring.jpa.hibernate.show-sql=true
spring.datasource.url=jdbc:postgresql://localhost:5432/geosuradb
spring.datasource.username=postgres
spring.datasource.password=postgres
```

#### Compile and Run the application
*mvn spring-boot:run*


## CRUD RESTFul API for vehicles

| API Name       | HTTP Method | Path                  | Status Code      | Description                       |
|----------------|-------------|-----------------------|------------------|-----------------------------------|
| GET Vehicles   | GET         | /api/v1/vehicles      | 200 (OK)         | All Vehicle resources are fetched |
| POST Vehicle   | POST        | /api/v1/vehicles      | 201 (Created)    | A new Vehicle resource is fetched |
| GET Vehicle    | GET         | /api/v1/vehicles/{id} | 200 (OK)         | One vehicle resource is fetched   |
| PUT Vehicle    | PUT         | /api/v1/vehicles/{id} | 200 (OK)         | Vehicle resource is updated       |
| DELETE Vehicle | DELETE      | /api/v1/vehicles/{id} | 204 (No Content) | Vehicle resource is deleted       |

### DEMO RESTFul API
https://geosura-test.herokuapp.com:8080/api/v1/

## API Examples

### Get all Vehicles REST API
- HTTP Method: GET 
- Request URL: http://localhost:8080/api/v1/vehicles

```curl
curl --location --request GET 'http://localhost:8080/api/v1/vehicles' --data-raw ''
```

### Create Vehicle REST API

- HTTP Method: POST 
- Request URL: https://localhost:8080/api/v1/vehicles

```curl
curl --location --request POST 'http://localhost:8080/api/v1/vehicles' \
--header 'Content-Type: application/json' \
--data-raw '{
    "licencePlate": "BBB-666",
    "longitude": -76.50305,
    "latitude": 3.43372
}'
```

### Get Vehicle by ID REST API
- HTTP Method: GET 
- Request URL: http://localhost:8080/api/v1/vehicles/\{id}

```curl
curl --location --request GET 'http://localhost:8080/api/v1/vehicles/2' \
--header 'Content-Type: application/json' \
--data-raw ''
```

### Update Vehicle REST API
- HTTP Method: GET 
- Request URL: http://localhost:8080/api/v1/vehicles/2

```curl
curl --location --request PUT 'http://localhost:8080/api/v1/vehicles/2' \
--header 'Content-Type: application/json' \
--data-raw '{"licencePlate":"MMM-999","longitude":-76.50503,"latitude":3.43372}'
```

### Delete Vehicle REST API
- HTTP Method: DELETE 
- Request URL: http://localhost:8080/api/v1/vehicles/1

```curl
curl --location --request DELETE 'http://localhost:8080/api/v1/vehicles/1' --data-raw ''
```

### Screen shots

![screenshot 1](https://github.com/AndresHerrera/geosura-test/raw/master/screenshot.png "Screen Shot 1")

![screenshot 2](https://github.com/AndresHerrera/geosura-test/raw/master/screenshot_2.png "Screen Shot 2")

### inspired on
[1] https://github.com/RameshMF/spring-boot-tutorial/tree/master/springboot2-postgresql-jpa-hibernate-crud-example