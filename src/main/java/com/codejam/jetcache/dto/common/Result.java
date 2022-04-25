package com.codejam.jetcache.dto.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result<T> {

    public Result<T> ok(T t){
        Result r = new Result();
        return r;
    }

}
