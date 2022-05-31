package com.example.demo;


import javax.persistence.Entity;
@Entity
public class Student {
@Id

public class Student
{
    
    private int id;
    private String name;
    public int getId(){
        return id;

    }
    public String getName(){
        return name;

    }
    public void settId(int id){
        this.id=id;

    }
    public void setName(String name){
        this.name=name;
    }

public student(int id,String name)
{
this.id=id;
this.name=name;
}
}