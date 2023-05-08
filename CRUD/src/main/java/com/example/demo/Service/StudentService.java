package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
     public StudentRepo crepo;
	
	public Student saveInfo(Student c)
	{
		return crepo.save(c);
	}
	public List<Student> getInfo()
	{
		return crepo.findAll();
	}
	public Student updateInfo(Student iu)
	{
		return crepo.saveAndFlush(iu);
		
	}
	public void deleteInfo(int id )
	{
		crepo.deleteById(id);
	}
}