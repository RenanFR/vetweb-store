package vetweb.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//The main configuration class for this application
public class WebApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		//Initialize the application with this configuration class and arguments 
	}
}
