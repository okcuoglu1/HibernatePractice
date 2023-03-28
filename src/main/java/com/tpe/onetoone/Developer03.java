package com.tpe.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "t_developer03")
public class Developer03 {


    @Id//her bir entity için zorunlu:PK sağlar
    private int id;

    //optional
    @Column(name = "dev_name",length = 50,nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    //@Transient
    private String branch;


    //her developer bir bilgisayar veriliyor.
    //developer'a verilen bilgisayarın verildiği bilgisini tutmak istiyoruz.


}
