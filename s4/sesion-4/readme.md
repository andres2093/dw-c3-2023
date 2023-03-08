### Crear procto con Spring Boot
[Spring Initializr](https://start.spring.io/)

### Ejecutar proyecto sin compilar
gradle bootRun

### Ejecutar proyecto sin compilar en otro puerto
gradle bootRun --args='--server.port=8888'

### Compilar proyecto
gradle clean build

### Ejecutar desde jar
java -jar build/libs/sesion-4-0.0.1-SNAPSHOT.jar 

### Ejecutar jar en otro puerto
gradle bootRun --args='--server.port=8888'

### Consultar WS saludo
http://localhost:8080/saludo
