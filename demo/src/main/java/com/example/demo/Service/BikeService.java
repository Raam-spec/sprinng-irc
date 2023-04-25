package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Repository.Bikerepo;
import com.example.demo.bikes.bikes;


@Service
public class BikeService {
	@Autowired
	public Bikerepo brepo;
	public bikes saveInfo(bikes ff)
	{
		return brepo.save(ff);
	}
public List<bikes> getDetails()
{
	return brepo.findAll();
	
}
public bikes updateInfo(bikes aa)
{
	return brepo.saveAndFlush(aa);
}
public void deleteInfo(int BikeId)
{
	brepo.deleteById(BikeId);
}

}
