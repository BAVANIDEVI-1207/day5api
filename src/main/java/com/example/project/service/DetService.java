package com.example.project.service;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.project.model.Model;
//import com.example.repository.Repository;
import com.example.repository.Repository;


@Service

public class DetService {
	@Autowired
	Repository rep;
	

	public Model getde(Model m) {
		return rep.save(m);
	}
	//get
	public List<Model> show(){
		return rep.findAll();
	}
	//get by id
	public Optional<Model>showid(@PathVariable int id){
		return rep.findById(id);
	}
	

	//update
	public Model update(Model m) {
		 return rep.saveAndFlush(m);
	}
	//update by id
	public String updated(int id ,Model m) {
		rep.saveAndFlush(m);
		if(rep.existsById(id)) {
			return "Updated";
		}
		else {
			return "Enter valid id";
		}
	}
	//delete
	public void remove(Model m) {
		rep.delete(m);
	}
	//delete by id
	public void deletede(int m) {
		rep.deleteById(m);
	}
	

}
