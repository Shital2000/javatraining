package com.example.demohttpmethods;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student3 {
@Id
	private int id;
    private String name;
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
    public Student3() {}
	public Student3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
    
}
