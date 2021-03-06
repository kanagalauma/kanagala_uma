package com.practice.application;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication("camunda")
public class SampleApplicationMain {
	public static void main(String... args) {
		
		SpringApplication.run(SampleApplicationMain.class, args);
	}
}
