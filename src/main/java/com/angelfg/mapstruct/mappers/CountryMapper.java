package com.angelfg.mapstruct.mappers;

import com.angelfg.mapstruct.dtos.CountryDto;
import com.angelfg.mapstruct.models.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {

    CountryMapper mapper = Mappers.getMapper(CountryMapper.class);

    CountryDto toCountryDto(Country country);

}
