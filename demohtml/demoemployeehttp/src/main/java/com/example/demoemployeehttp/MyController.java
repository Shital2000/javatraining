package com.example.demoemployeehttp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

	


@RestController
public class MyController{
	@Autowired
	private EmployeeRepository emp;
	
//	@GetMapping("/employee")
//	public List  <Employee> getAllEmployee(){
//		return emp.findAll();
//	}

//	@GetMapping("/employee/{id}")
//	public Employee getemployeeById(@PathVariable("id") Integer empId) {
//	Optional<Employee> op = emp.findById(empId);
//		Employee e = op.get();
//    return e;
//	}
//}

		@PostMapping("/save")
		public Employee createemployee(@RequestBody Employee st) {
			return emp.save(st);
}

	}

	//@PutMapping("/updatestud/{id}")
	//public boolean updateEmployee(@PathVariable(value = "id") Integer studId,
//			@RequestBody Student3 studDetails) throws Exception {
//		boolean f=true;
//		try {
//			Optional<Student3> op = stud.findById(studId);
//			Student3 st = op.get();
//			st.setName(studDetails.getName());
//			final Student3 updatedStud = stud.save(st);
//		} catch(Exception e) {
//			f=false;
//		}
//		return f;
	//}
	//}
//	@DeleteMapping("/deletestud/{id}")
//	public boolean deleteEmployee(@PathVariable(value = "id") Integer studId,
//			@RequestBody Student3 studDetails) throws Exception {
//		Optional<Student3> op = stud.findById(studId);
//		Student3 st = op.get();
//		 
//		stud.delete(st);
//		return true;
//	}
//
//	}
//
//}
