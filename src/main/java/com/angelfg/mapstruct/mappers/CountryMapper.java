package com.angelfg.mapstruct.mappers;

import com.angelfg.mapstruct.dtos.CountryDto;
import com.angelfg.mapstruct.dtos.LanguageDto;
import com.angelfg.mapstruct.models.Country;
import com.angelfg.mapstruct.models.Language;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {

    CountryMapper mapper = Mappers.getMapper(CountryMapper.class);

    @Mapping(target = "continent", source = "location.continent")
    CountryDto toCountryDto(Country country);

    // Del dto target (isOfficialLanguage) al source entity (isOfficial)
    @Mapping(target = "isOfficialLanguage", source = "isOfficial")
    @Mapping(target = "speakersTotal", source = "speakersCount")
    LanguageDto toLanguageDto(Language language);

}
