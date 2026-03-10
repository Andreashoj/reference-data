package com.springtest.referencedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ReferenceDataApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReferenceDataApplication.class, args);
	}
}
