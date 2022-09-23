package com.example.demo.withDatabse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.withoutDatabase.Product;
import com.example.demo.withoutDatabase.ProductService;

@RestController
public class StudentController {
	@Autowired
	private StudentService sservice;

	// localhost:8080/allstudent
	@GetMapping("/allstudent")
	public List<Student> getStudentsdetail() {
		return this.sservice.getAllStudents();
	}

	// localhost:8080/addStudent
	// Adding the Data to databse with database
	@PostMapping("/addStudent")

	public String addString(@RequestBody Student student) {
		this.sservice.addStudent(student);
		return "Student Data Added Sucessfully";
	}

	// localhost:8080/studentdetailsbyid/sid
	@GetMapping("/studentdetailsbyid/{sid}")
	public Student getStudentById(@PathVariable int sid) {
		return this.sservice.searchStudentById(sid);

	}

	// localhost:8080/searchByName/name
	@GetMapping("/searchByName/{name}")
	public List<Student> searchStudentsname(@PathVariable String name) {
		return this.sservice.searchByStudents(name);

	}

	// localhost:8080/DeletedetailById/sid
	@DeleteMapping("/DeletedetailById/{sid}")
	public String deleteStudentById(@PathVariable int sid) {
		this.sservice.deleteStudent(sid);
		return "Student Data Deleted";
	}

	@PutMapping("/updatedetelibyid/{sid}")
	public Student updatestudentbyid(@PathVariable("sid") int sid, @RequestBody Student student) {
		return this.sservice.updatedetelibyid(sid, student);

	}
}
