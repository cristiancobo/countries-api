package com.api.countries.implementation.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.*;

import org.springframework.boot.test.context.SpringBootTest;
import com.api.countries.repository.ICountryRepository;
import com.api.countries.dtos.stdout.CountryStdOutDto;
import com.api.countries.utils.exceptions.CountryDoesNotExistException;
import com.api.countries.model.Country;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class CountryServiceImplTest {

    @Mock
    private ICountryRepository iCountryRepository;

    @InjectMocks
    private CountryServiceImpl CountryService;


    private CountryStdOutDto CountryStdOutDto;
    private Country Country;

    @BeforeEach
    public void setUp() {
        Country = new Country();
        Country.setId(1L);
        Country.setName("red");
        CountryStdOutDto = new CountryStdOutDto();
        CountryStdOutDto.setId(1L);
        CountryStdOutDto.setName("red");
    }

    @Test
    public void whenUserGetaCountrySuccessfully(){
        when(iCountryRepository.existsById(Country.getId())).thenReturn(true);
        when(iCountryRepository.findById(Country.getId())).thenReturn(java.util.Optional.ofNullable(Country));
        CountryStdOutDto CountryStdOutDtoTest = CountryService.findById(Country.getId());
        Long expectedIdCountry = Country.getId();
        Long actualIdCountry =  CountryStdOutDtoTest.getId();
        String expectedNameCountry = Country.getName();
        String actualName = CountryStdOutDtoTest.getName();
        assertEquals(expectedIdCountry, actualIdCountry);
        assertTrue(actualName.contains(expectedNameCountry));
    }
    @Test
    public void whenUserTryToFindCountryDoesNotExistAndThrowException(){
        when(iCountryRepository.existsById(Country.getId())).thenReturn(false);
        Exception exception = assertThrows(CountryDoesNotExistException.class, () -> {
            CountryService.findById(Country.getId());
        });
        String expectedMessage = "Country with id 1 does not exist";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void whenUserFindAllCountrysAndDoesNotExistCountrys(){
        List<CountryStdOutDto> CountryStdOutDtos = CountryService.findAll();
        assertEquals(0,CountryStdOutDtos.size());
    }
    @Test
    public void whenUserFindAllCountrysSuccessfully(){
        List<Country> countries = new ArrayList<>();
        countries.add(Country);
        when(iCountryRepository.findAll()).thenReturn(countries);
        List<CountryStdOutDto> CountryStdOutDtos = CountryService.findAll();
        assertTrue(CountryStdOutDtos.size() > 0);
    }
}
