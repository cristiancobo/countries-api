package com.api.countries.restcontroller;

import com.api.countries.dtos.stdout.CountryStdOutDto;
import com.api.countries.interfaces.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/countries")
public class CountryController {

    private ICountryService iCountryService;
    @Autowired
    public CountryController(ICountryService iCountryService) {
        this.iCountryService = iCountryService;
    }

    @GetMapping("/")
    public ResponseEntity<List<CountryStdOutDto>> findAllCountries(Long id){
        List<CountryStdOutDto> countryStdOutDtos = iCountryService.findAll();
        return new ResponseEntity<List<CountryStdOutDto>>(countryStdOutDtos, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CountryStdOutDto> findByIdCountry(@PathVariable Long id){
        CountryStdOutDto countryStdOutDto = iCountryService.findById(id);
        return new ResponseEntity<CountryStdOutDto>(countryStdOutDto, HttpStatus.OK);
    }
}
