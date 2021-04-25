package com.api.countries.model;

import javax.persistence.*;

/**
 * Class representing a country
 * @version 1.0
 */
@Entity
@Table(name = "COUNTRY")
public class Country {

    //Attributes
    @Id
    @Column(name = "ID", length = 45, nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", length = 45, nullable = false)
    private String name;

    //Access methods

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}