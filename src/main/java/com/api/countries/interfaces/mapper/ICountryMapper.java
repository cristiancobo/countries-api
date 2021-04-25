package com.api.countries.interfaces.mapper;


import com.api.countries.dtos.stdin.CountryStdInDto;
import com.api.countries.dtos.stdout.CountryStdOutDto;
import com.api.countries.model.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ICountryMapper {
    ICountryMapper INSTANCE = Mappers.getMapper(ICountryMapper.class);
    CountryStdOutDto asCountryToCountryStdOutDto(Country country);
    Country asCountryStdInDtoToCountry(CountryStdInDto countryStdInDto);
    List<CountryStdOutDto> asCountryListToCountryStdOutDtoList(List<Country> countries);

}