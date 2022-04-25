package com.codejam.jetcache.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Integer age;

    private String name;

    private BigDecimal money;


    public String toString(){

        return String.format("user ToString = {0}-{1}-{2}",age.toString(),name.toString(),money.toString());
    }
}
