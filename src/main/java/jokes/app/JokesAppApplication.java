package jokes.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("jokes.app.*")
public class JokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesAppApplication.class, args);
	}

}
