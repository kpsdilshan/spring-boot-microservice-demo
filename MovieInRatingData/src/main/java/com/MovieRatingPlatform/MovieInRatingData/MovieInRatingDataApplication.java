package com.MovieRatingPlatform.MovieInRatingData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
 * Implemented by KPS Dilshan
 */

@SpringBootApplication
@EnableEurekaClient
public class MovieInRatingDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInRatingDataApplication.class, args);
	}

}
