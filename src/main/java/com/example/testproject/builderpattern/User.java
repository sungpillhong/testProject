package com.example.testproject.builderpattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String name;
    private String age;
    private String addr;
    private String phone;
    private String sex;
    private String birth;
}
