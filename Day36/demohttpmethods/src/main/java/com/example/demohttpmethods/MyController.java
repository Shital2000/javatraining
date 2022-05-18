package com.example.demohttpmethods;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@Autowired
private Student3Repository stud;
@GetMapping("/students")
public List<Student3>getAllStudents(){
	return stud.findAll();
	
}
}
