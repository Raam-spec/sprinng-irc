package com.example.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.Service.BikeService;
import com.example.demo.bikes.bikes;

@RestController

public class BikeController {
	@Autowired
	public BikeService bser;
	
	@PostMapping("/savebike")
	public bikes addDetails(@RequestBody bikes bb)
	{
		return bser.saveInfo(bb);
	}
	@GetMapping("/getbike")
	public List<bikes> getDetails()
	{
		return bser.getDetails();
	}
	@PutMapping("/updatebike")
	public bikes updateDetails(@RequestBody bikes bbb)
	{
		return bser.updateInfo(bbb);
	}
	//PathVariable
	@DeleteMapping("deletebike/{BikeId}")
	public String deleteDetails(@PathVariable("BikeId"
			) int bid) 
	
	{
		bser.deleteInfo(bid);
		return "bikeid"+bid+"deleted";
	}
	@DeleteMapping("/deleteByReq")
	public String deletebyRequestParam(@RequestParam("BikeId")int nn)
	{
		bser.deleteInfo(nn);
		return "Bike number"+nn+"is deleted";
	}

}
