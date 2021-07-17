package com.example.testproject.builderpattern;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class UserBuilder {
    private String name;
    private String age;
    private String addr;
    private String phone;
    private String sex;
    private String birth;
}
