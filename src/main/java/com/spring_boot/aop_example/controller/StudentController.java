package com.spring_boot.aop_example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring_boot.aop_example.model.Student;
import com.spring_boot.aop_example.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    private StudentService stdService;

    @RequestMapping(value = "/add/student", method = RequestMethod.GET)
    public Student addStudent(@RequestParam("stdId") String stdId, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
    {
        return StudentService.createStudent(stdId, firstName, lastName);
    }

    @RequestMapping(value = "/remove/student", method = RequestMethod.GET)
    public String removeStudent( @RequestParam("stdId") String stdId)
    {
        StudentService.deleteStudent(stdId);
        return "Student removed";
    }
}
