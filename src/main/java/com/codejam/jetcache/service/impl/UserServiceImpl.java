package com.codejam.jetcache.service.impl;

import com.codejam.jetcache.model.User;
import com.codejam.jetcache.service.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserServiceImpl implements IUserService {


    @Override
    public User getRandomUser() {

        User one = User.builder().money(BigDecimal.ONE)
                .name("one")
                .age(11)
                .build();


        return one;
    }
}
