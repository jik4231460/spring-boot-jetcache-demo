package com.codejam.jetcache.dto.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseRes<T> {

    public Integer code;

    public String msg;

    public T content;
}
