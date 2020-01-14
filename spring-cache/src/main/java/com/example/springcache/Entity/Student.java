package com.example.springcache.Entity;

public class Student {
	int id;
	String name;
	String clz;

	public Student(int id, String name, String clz) {
		super();
		this.id = id;
		this.name = name;
		this.clz = clz;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClz() {
		return clz;
	}

	public void setClz(String clz) {
		this.clz = clz;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clz=" + clz + "]";
	}

}
