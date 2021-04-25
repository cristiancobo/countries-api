package com.api.countries.interfaces.service;

import com.api.countries.dtos.stdout.CountryStdOutDto;

import java.util.List;

public interface ICountryService {
    public List<CountryStdOutDto> findAll();
    public CountryStdOutDto findById(Long id);

}
