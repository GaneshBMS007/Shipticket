package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	public StudentService cser;
		
	@PostMapping("/postm")
	public Student addDetails(@RequestBody Student cr)
	{
		return cser.saveInfo(cr);
	}
	@GetMapping("/getma")
	public List <Student> getDetails()
	{
		return cser.getInfo();
	}
	
	@PutMapping("/updatem")
	public Student updateDetails(@RequestBody Student id)
	{
		return cser.updateInfo(id);
	}
	
	@DeleteMapping("delete/{cid}")
	public String deleteDetails (@PathVariable ("cid") int id)
	{
		cser.deleteInfo(id);
		return "Student number "+id+" is deleted";
				
	}
	@DeleteMapping("/deleteReq")
	public String deleteByReq(@RequestParam ("cid") int id)
	{
		cser.deleteInfo(id);
		return "Student number "+id+" is deleted";
	}
	
	
	
}