package com.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.model.Student;

@Controller
public class StudentController {

    @Value("${student.name}")
    private String studentName;

    @Value("${student.age}")
    private int studentAge;

    @Value("${student.course}")
    private String studentCourse;

    @GetMapping("/")
    public String showStudentDetails(Model model) {
        Student student = new Student();
        student.setName(studentName);
        student.setAge(studentAge);
        student.setCourse(studentCourse);

        model.addAttribute("student", student);
        return "student-details";
    }
}