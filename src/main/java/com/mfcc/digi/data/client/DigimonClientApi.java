package com.mfcc.digi.data.client;

import com.mfcc.digi.data.model.Pokemon;
import com.mfcc.digi.data.model.DigimonField;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "digimonApi", url="https://pokeapi.co/api/v2")
public interface DigimonClientApi {

    @GetMapping("/pokemon/{pokemon}")
    Pokemon getDigimonInfo(@PathVariable String pokemon);

    @GetMapping("/pokemon-species/257")
    DigimonField getDigimonField();

}
