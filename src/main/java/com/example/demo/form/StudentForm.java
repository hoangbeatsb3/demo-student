package com.example.demo.form;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentForm {

    private String name;
    private Integer phone;
    private String address;
    private Integer gender;
    private Integer identity_card;
    private String updated_by;

}
