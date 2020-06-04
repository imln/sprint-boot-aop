package com.spring_boot.aop_example.service;
import org.springframework.stereotype.Service;
import com.spring_boot.aop_example.model.Student;

@Service
public class StudentService {
    public static Student createStudent(String stdId, String fname, String sname)
    {
        Student std = new Student();
        std.setStdId(stdId);
        std.setFirstName(fname);
        std.setLastName(sname);
        return std;
    }

    public static void deleteStudent(String stdId)
    {
    }
}
