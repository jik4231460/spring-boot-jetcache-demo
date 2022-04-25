package com.codejam.jetcache.service.impl;

import com.codejam.jetcache.model.Student;
import com.codejam.jetcache.service.interfaces.IStudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    static List<Student> students = new ArrayList<Student>() {
    };

    static {
        students.add(Student.builder().score(Math.random()).id(1L).name("liuda").build());
        students.add(Student.builder().score(Math.random()).id(2L).name("yaoer").build());
        students.add(Student.builder().score(Math.random()).id(3L).name("zhangsan").build());
        students.add(Student.builder().score(Math.random()).id(4L).name("lisi").build());
    }


    @Override
    public Student getStudentById(Long id) {
        Student student1 = students.stream().filter(student -> student.getId().equals(id)).findFirst().get();
        return student1;
    }
}
