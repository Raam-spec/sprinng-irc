package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsonApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(JsonApplication.class, args);
		person p=new person(1,"ram",20);
		ObjectMapper m=new ObjectMapper();
		String json=m.writeValueAsString(p);
		System.out.println(json);
	}

}
