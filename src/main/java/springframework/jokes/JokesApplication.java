package springframework.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import springframework.jokes.services.JokeService;

@SpringBootApplication
@ImportResource("classpath:chuck-norris-config.xml")
public class JokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesApplication.class, args);
	}
}
