package com.codejam.jetcache.dto.common;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PagedRes<T>{

    public Integer code;

    public String msg;

    public List<T> content;
}
