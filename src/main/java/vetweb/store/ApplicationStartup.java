package vetweb.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//The main configuration class for this application
public class ApplicationStartup {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStartup.class, args);
		//Initialize the application with this configuration class and arguments 
	}
}