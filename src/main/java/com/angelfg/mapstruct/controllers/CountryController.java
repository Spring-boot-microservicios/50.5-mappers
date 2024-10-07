package com.angelfg.mapstruct.controllers;

import com.angelfg.mapstruct.dtos.CountryDto;
import com.angelfg.mapstruct.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "country")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping(path = "{id}")
    public ResponseEntity<CountryDto> getCountryById(@PathVariable UUID id) {
        return ResponseEntity.ok(this.countryService.readById(id));
    }

}
