MyFirstApp is the first Springboot(2.2.6.RELEASE) application which will return you a greet message as on when you hit the below service URL.

As part of this application,added customization like server port in application.yml file. So, application is running on port 9090.

Created only one controller with hello request path. Controller class look like,

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping(path="/hello")
	public String sayHello(){
		return "Hello Shashidhar.... Welcome to Springboot World.";
	}
}
```
Hit this URL after application started successfully http://localhost:9090/hello

**Output:** Hello Shashidhar.... Welcome to Springboot World.
