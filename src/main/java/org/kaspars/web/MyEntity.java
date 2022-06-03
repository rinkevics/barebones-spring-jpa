package org.kaspars.web;

import javax.persistence.*;

@Entity
public class MyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public Integer id;

    public String name;

    public MyEntity(String name) {
        this.name = name;
    }

    public MyEntity() {
    }

}
