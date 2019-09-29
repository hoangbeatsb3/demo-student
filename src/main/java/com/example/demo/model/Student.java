package com.example.demo.model;

import com.example.demo.form.StudentForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "address")
    private String address;

    // 0: Male, 1: Female, 2: Undefine
    @Column(name = "gender")
    private Integer gender;

    @Column(name = "identity_card")
    private Integer identity_card;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;

    @Column(name = "updated_by")
    private String updated_by;

    public Student(StudentForm form) {
        this.name = form.getName();
        this.phone = form.getPhone();
        this.address = form.getAddress();
        this.gender = form.getGender();
        this.identity_card = form.getIdentity_card();
        this.created_at = new Date();
        this.updated_at = new Date();
        this.updated_by = form.getUpdated_by();
    }

}
