package com.MovieRatingPlatform.MovieInfor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
 * Implemented by KPS Dilshan
 */
@SpringBootApplication
@EnableEurekaClient
public class MovieInforApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInforApplication.class, args);
	}

}
