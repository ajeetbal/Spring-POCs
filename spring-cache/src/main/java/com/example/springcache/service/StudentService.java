package com.example.springcache.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import com.example.springcache.Entity.Student;

public interface StudentService {

	@Cacheable(cacheNames = "student", condition = "#id>10")
	Student getStudentByID(int id);

	@CacheEvict(cacheNames = "student", allEntries = true)
	void cleanCache();
}
