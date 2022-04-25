package com.codejam.jetcache.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private Long id;

    private double score;

    private String name;

    @Override
    public String toString() {
        String format = String.format("student = %d-%f-%s", id, score, name);
        return format;
    }
}
