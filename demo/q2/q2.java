package com.example.demo.q2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class q2 {
	public String name="Iamneo";
			@RequestMapping("/q2")
			public String getName()
			{
		return "Welcome "+name;
			}

}