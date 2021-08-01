# REST-ADAPTER

## This is REST wrapper by SOAP requests for http://www.dneonline.com/calculator.asmx

### Build

```
$ ./gradlew build
```

### Launch

```
$ ./gradlew bootrun 
```

#### or launch this command after build  

```
$  java -jar build/libs/restAdapter-0.0.1-SNAPSHOT.jar --server.port=8081
```
--server.port by default port is 8080

### API 

REST API available by path app/v1/

### Swagger UI
Swagger UI available by path http://localhost:8080/swagger-ui.html