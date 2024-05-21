package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Ipo;
import com.example.repository.Repository;

@Service
public class Iposervice {

	@Autowired
	private Repository resp;
	
	public List<Ipo> getAllIpo(){
		return resp.findAll();
	}
	
	public Optional<Ipo> getIpo(int id){
		return resp.findById(id);
	}
}
