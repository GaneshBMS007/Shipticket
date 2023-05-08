package com.example.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelS.Smodel;
import com.example.demo.model.Login;
import com.example.demo.service.Logser;

@RestController
public class Logcon {
	@Autowired
	Logser cusservice;
	
	@PostMapping("/pom")
	public String create(@RequestBody Smodel customer)
	{
		return cusservice.addCustomer(customer);
	}
	
	
	@GetMapping("/gm")
	public List<Smodel> read()
	{
		return cusservice.getCustomer();
	}
	
	
	@GetMapping("/{id}")
	public Optional <Smodel> readById(@PathVariable int id)
	{
		return cusservice.getCustomerById(id);
	
	}
	
	
	@PutMapping("/pum")
	public String update(@RequestBody Smodel customer)
	{
		return cusservice.updateCustomer(customer);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		return cusservice.deleteById(id);
	}
	
	
	@GetMapping("/service")
	public List<Smodel> getProSorted(@RequestParam String field)
	{
		return cusservice.getProDetails(field);
	}
		
		
	@GetMapping("/service/{offset}/{pagesize}")
	public List<Smodel> getProwithPagination(@PathVariable int offset,@PathVariable int pagesize)
	{
		return cusservice.getProwithPag(offset,pagesize);
	}
	
	
	@PostMapping("/pomL")
	public String login(@RequestBody Map<String,String> loginData)
	{
		String uname=loginData.get("uname");
		String pwd=loginData.get("pwd");
		String result=cusservice.checkLogin(uname,pwd);
		return result;
    }
	
	
	@PostMapping("/addL")
	public Login AddUser(@RequestBody Login mod)
	{
		return cusservice.addUser(mod);
	}
	
	
	@GetMapping("/gmL")
	public List<Login> listAll()
	{
		return cusservice.getUser();
	}
	
	
	
	
}