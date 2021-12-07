package io.reading.springboot.reading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import io.reading.springboot.reading.repository.Repository;

@SpringBootApplication
public class ReadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingApplication.class, args);
	}

	@Autowired
    private Repository repository;
	
}
