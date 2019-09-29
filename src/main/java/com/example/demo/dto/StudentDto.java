package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentDto {

    private Long id;
    private String name;
    private String phone;
    private String address;
    private String gender;
    private String identity_card;
    private String updated_by;
    private Long updated_at;
    private Long created_at;

}
