package com.example.demo.q3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class q3 {
@Value("${carname}")
public String car;
@GetMapping("/my")
@ResponseBody
public String displayCar()
{
	return "My fav car "+car; 
}
}
