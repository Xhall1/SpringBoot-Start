package com.xl.holamundospring.domain;

import lombok.Data;

@Data //Lombok (This put for default the getters and setters methods, hashcode, equals() and toString)
public class Person {
    private String name;
    private String surname;
    private String email;
    private String phone;

}
