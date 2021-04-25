package com.api.countries.dtos.stdout;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CountryStdOutDto {

    @Size(max = 45, min=3, message="The name must be between 3 and 45 characters.")
    @Pattern(regexp = ".*", message="The name can only have characters of the alphabet.")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}