package com.xl.holamundospring.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data //Lombok (This put for default the getters and setters methods, hashcode, equals() and toString)
@Entity //It says to Spring JPA that this class represent a database table
@Table(name = "person") //This one cause in my MySQL Workbench is on lower case
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerson;
    private String name;
    private String surname;
    private String email;
    private String phone;

}
