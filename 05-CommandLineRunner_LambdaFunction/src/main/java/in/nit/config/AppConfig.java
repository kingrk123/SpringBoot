package in.nit.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	 //no.of methods = no.of objects
	  @Bean
	  public CommandLineRunner clrOb() {
	    //Interface ob=(methodParams)->{methodBody};
	    /*
	    CommandLineRunner cob1 = (String... args) -> {
	          System.out.println("Welcome to Runner using Lambda!!"); 
	       };
	     */
	    CommandLineRunner cob = args -> 
	        System.out.println("WELCOME TO RUNNER-NEW USING LAMBDA!!"); 
	    return cob;
	  }
	}
