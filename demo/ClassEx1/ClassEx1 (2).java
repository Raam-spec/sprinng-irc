package com.example.demo.ClassEx1;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClassEx1 {
	@RequestMapping("/skct")
	@ResponseBody
	public String Welcome(){
		return "Welcome to RESTAPI";
	}

}


