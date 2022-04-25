package com.codejam.jetcache.controller;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import com.codejam.jetcache.controller.dto.req.GetUserNameReq;
import com.codejam.jetcache.model.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * 一个单个的cache
 */
@RestControllerAdvice
@RequestMapping("userCache")
@RestController
public class UserCacheController {


    @CreateCache(name = "userCache", expire = 100, cacheType = CacheType.REMOTE)
    private Cache<Integer, User> userCache;


    @PostMapping("setRandomUser")
    public Boolean setRandomUser(@RequestBody @Validated GetUserNameReq req) {

        User user = User.builder()
                .age(Long.valueOf(Math.round(Math.random() * 100)).intValue())
                .name(UUID.randomUUID().toString())
                .money(BigDecimal.TEN)
                .build();

        userCache.put(req.getKey(), user);

        return Boolean.TRUE;
    }


    @GetMapping("getUserByKey")
    public String getUserByKey(Integer key) {

        User user = userCache.get(key);

        return user.toString();
    }


}
