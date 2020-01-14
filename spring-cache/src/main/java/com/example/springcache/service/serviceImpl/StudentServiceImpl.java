package com.example.springcache.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.springcache.Entity.Student;
import com.example.springcache.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public Student getStudentByID(int id) {
		try {
			System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return new Student(id, "Sajal", "V");
	}

	@Override
	public void cleanCache() {
		System.out.println("cache cleaned!!!!!!!!!!");
		
	}

}
