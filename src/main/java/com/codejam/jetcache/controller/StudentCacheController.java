package com.codejam.jetcache.controller;

import com.alicp.jetcache.anno.Cached;
import com.codejam.jetcache.model.Student;
import com.codejam.jetcache.service.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 */
@RestControllerAdvice
@RequestMapping("studentCache")
@RestController
public class StudentCacheController {


    @Autowired
    private IStudentService studentService;



    @Cached(name = "studentCache-", key = "#key", expire = 3600)
    @GetMapping("getUserByKey")
    public String getUserByKey(Long id) {

        Student studentById = studentService.getStudentById(id);

        return studentById.toString();
    }


}
