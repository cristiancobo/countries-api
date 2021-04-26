package com.api.countries.dtos.stdout;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
/**
 * Class representing a country dto
 * @version 1.0
 */
public class CountryStdOutDto {

    //Attributes

    private Long id;

    private String name;

    //Access methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}