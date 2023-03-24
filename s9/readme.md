#### Cómo instalo Gradle y como se habré en IntelliJ

- https://www.adictosaltrabajo.com/2013/12/04/gradle-install/
     
- https://parzibyte.me/blog/2019/07/27/instalar-configurar-gradle/
     
- https://www.tutorialspoint.com/gradle/gradle_installation.htm

  
#### Actualmente Gradle está siendo más utilizado que Maven para nuevos proyectos?
- Sí
#### Qué desventajas podría tener Gradle en relación con Maven, a mí me pareció mucho más ágil con los proyectos de ejemplo:
- La principal desventaja es en proyectos pequeños.
#### Podríamos revisar a alto nivel algunos de los Patrones de Diseño con que está construído Spring Boot?
#### Se comentó en la sesión de Thymeleaf que se recomendaba crear un proyecto para la vista y otro para la parte de servicios. 

- Qué tanto se usa Thymeleaf en la práctica real.
- Sería recomendado para aplicaciones que no tengan demasiada complejidad.
- Se puede mezclar con otras librerías y/o frameworks de UI, si es recomendable y cual sería un stack más utilizado.

     </br>

     | Gradle | Maven |
     |---|---|
     | El tiempo de construcción de Gradle es corto y rápido | El rendimiento de Maven es lento en comparación con Gradle |
     | Los scripts de Gradle son mucho más cortos y limpios | Los scripts de Maven son un poco largos en comparación con Gradle |
     | Utiliza lenguaje específico de dominio (DSL) | Utiliza XML |
     | Se basa en la tarea mediante la cual se realiza el trabajo | En Maven se definen objetivos vinculados al proyecto |
     | Admite compilaciones incrementales de la clase java | No admite compilaciones incrementales |

     **¿Cuál debo elegir Maven o Gradle?**

     La clave está en la flexibilidad, si el proyecto se puede gestionar con metas standard o con poca personalización entonces Maven es suficiente, por otro lado si el proyecto requiere diferentes comportamientos en función de múltiples variables en tiempo de construcción quizá Gradle responda más eficazmente a esos requerimientos.

#### ¿Se puede validar el front-end generado con Thymeleaf mediante jUnit?

- https://github.com/eea/thymeleaf-test/blob/master/src/test/java/eea/eprtr/controller/UserControllerTest.java

- https://rieckpil.de/test-thymeleaf-controller-endpoints-with-spring-boot-and-mockmvc/

- I: https://youtu.be/sxWNJJ4dKJo
- II: https://youtu.be/Aasp0mWT3Ac
- III: https://youtu.be/d7TDoGSZCoc
- IV: https://youtu.be/oLtXe1wgSC8

#### Como crear relaciones Uno a Uno, Uno a muchos y muchos a muchos usando las anotaciones de Spring.

- https://www.baeldung.com/spring-data-rest-relationships

#### Como crear un sistema de login para que los endpoints esten protegidos?

- https://blog.softtek.com/es/autenticando-apis-con-spring-y-jwt

- https://sunitc.dev/2020/08/23/spring-boot-add-jwt-authentication/


#### ¿Qué alternativas existen a Thymeleaf que se equiparen o lo superen?
- https://openwebinars.net/blog/thymeleaf-vs-jsp/

#### ¿Algún sitio web donde podamos encontrar más ejercicios para practicar y comprender mejor los temas?

- Realizar proyecto

Respecto a Gradle, alguna vez mencionaron que manejaba un caché, ¿hay alguna manera de reiniciarlo/regenerarlo? 

En la sesión pasada tuve un problema de que no me reconocía una clase si la quería usar en otras clases del mismo proyecto, esta clase no presentaba ningún error y hasta que la borré y la volví a crear con la misma información me la reconoció, no sé si este comportamiento se debió al caché de gradle o tal vez fue un error del IDE IntelliJ

Tuve problemas con el reto 2 al momento de crear los archivos .sql , la aplicación no compila porque me dice que debo seleccionar un esquema , y hasta ahora no he podido descifrar como hacerlo

#### Otro ejemplo de plugin como el que se pido del markdown.

#### Cuales son los tipos de error de respuestas HTTPS del servidor, tuve problemas para mandar un error 400
- https://developer.mozilla.org/en-US/docs/Web/HTTP/Status

#### ¿Cuáles eran las configuraciones y todo lo que se modifica para visualizar la consola h2 en el navegador?
- https://github.com/andres2093/dw-c3-2023/commit/5f2768e78e074314b4cbe6716a5f61676d89f190

### Transaccionalidad con spring data

- https://www.arquitecturajava.com/jpa-transaction-un-concepto-importante/

### Llamar un template html desde otro, ahora estoy usando un hiperlink, pero no se como gestionar la peticion en el controller

```html
<button type="button" th:onclick="|window.location.href='/adios'|">Adios</button>
```

```java
@RequestMapping(value="/adios")
public void doStuffMethod() {
     System.out.println("Success");
}
```