package com.example.demo;


import lombok.Data;

import java.util.Date;
@Data
public class Student {
    private Long id;
    private String name;
    private Double score;
    private Date birthday;
}
