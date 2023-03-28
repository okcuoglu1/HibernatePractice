package com.tpe.embeddable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_developer02")
public class Developer02 {

    @Id//her bir entity için zorunlu:PK sağlar
    private int id;

    //optional
    @Column(name = "dev_name",length = 50,nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    //@Transient
    private String branch;


//    private String university;
//    private String department;




}
