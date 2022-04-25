package com.codejam.jetcache.controller.dto.req;

import lombok.Data;

@Data
public class SetValue {

    private Integer key;

    private String value;
}
