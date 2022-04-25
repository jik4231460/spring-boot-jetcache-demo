package com.codejam.jetcache.service.interfaces;

import com.alicp.jetcache.anno.Cached;
import com.codejam.jetcache.model.Student;

public interface IStudentService {

    @Cached(name = "studentCache-", key = "#id", expire = 3600)
    Student getStudentById(Long id);
}
