package com.example.testproject.builderpattern;

import lombok.Builder;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Child extends Parent{
    private String c;
    private String d;
    private String e;
}
