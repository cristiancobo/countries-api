package com.api.countries.implementation.service;

import com.api.countries.dtos.stdout.CountryStdOutDto;
import com.api.countries.interfaces.mapper.ICountryMapper;
import com.api.countries.interfaces.service.ICountryService;
import com.api.countries.model.Country;
import com.api.countries.repository.ICountryRepository;
import com.api.countries.utils.exceptions.CountryDoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class representing country's service implementation
 * @version 1.0
 */
@Service
public class CountryServiceImpl implements ICountryService {


    //Injection
    private ICountryRepository iCountryRepository;
    @Autowired
    public CountryServiceImpl(ICountryRepository iCountryRepository) {
        this.iCountryRepository = iCountryRepository;
    }

    /**
     * Method find all countries
     * @return
     */
    @Override
    public List<CountryStdOutDto> findAll() {
        List<Country> countries = (List<Country>) iCountryRepository.findAll();
        List<CountryStdOutDto> countryStdOutDtos = ICountryMapper.INSTANCE.asCountryListToCountryStdOutDtoList(countries);
        return countryStdOutDtos;
    }

    /**
     * Method find a country by id
     * @param id
     * @return
     */
    @Override
    public CountryStdOutDto findById(Long id) {
        if(!iCountryRepository.existsById(id)){
            throw  new CountryDoesNotExistException("Country with id " +id+" does not exist");
        }
        Country country = iCountryRepository.findById(id).get();
        CountryStdOutDto countryStdOutDto = ICountryMapper.INSTANCE.asCountryToCountryStdOutDto(country);
        return countryStdOutDto;
    }
}
