package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Ipo;
import com.example.service.Iposervice;

@RestController
public class ipoController {
     
	@Autowired
	private Iposervice serv;
	
	@GetMapping("/getAll")
	public List<Ipo> getAllIpo(){
		
		return serv.getAllIpo();
		
	}
	@GetMapping("/ipo/{id}")
	public Optional<Ipo> getIpo(@PathVariable int id){
	 
		return serv.getIpo(id);
		
	}
}
