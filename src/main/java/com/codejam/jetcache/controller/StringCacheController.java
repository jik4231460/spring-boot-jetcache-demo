package com.codejam.jetcache.controller;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import com.codejam.jetcache.controller.dto.req.SetValue;
import com.codejam.jetcache.dto.common.Result;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
@RequestMapping("stringCache")
@RestController
public class StringCacheController {

    @CreateCache(name = "stringCache1", expire = 100, cacheType = CacheType.REMOTE)
    private Cache<Integer, String> stringCache;


    @PostMapping("setValue")
    public Result<Void> setValue(@RequestBody @Validated SetValue setValue) {

        stringCache.put(setValue.getKey(), setValue.getValue());

        return null;
    }


    @GetMapping("getByKey")
    public String getByKey(Integer key) {

        String s = stringCache.get(key);
        return s;
    }

}
