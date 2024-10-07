package com.angelfg.mapstruct.dtos;

import lombok.Data;

@Data
public class LanguageDto {
    private String name;
    private Boolean isOfficialLanguage;
    private Integer speakersTotal;
}
