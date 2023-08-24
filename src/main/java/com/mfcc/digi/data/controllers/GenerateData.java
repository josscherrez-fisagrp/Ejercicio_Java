package com.mfcc.digi.data.controllers;

import com.mfcc.digi.data.client.DigimonClientApi;
import com.mfcc.digi.data.model.Pokemon;
import com.mfcc.digi.data.model.DigimonField;
import com.mfcc.digi.data.model.Result;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
public class GenerateData {

    private Pokemon digimon;
    private DigimonClientApi digimonClientApi;

    public GenerateData(Pokemon digimon, DigimonClientApi digimonClientApi) {
        this.digimon = digimon;
        this.digimonClientApi = digimonClientApi;

    }

    public Optional<Result> getInformation() {
        if (digimon != null) {
            Result.ResultBuilder resultBuilder = Result.builder();
            resultBuilder.id(digimon.getId());
            resultBuilder.name(digimon.getName());
            resultBuilder.height(digimon.getHeight());
            resultBuilder.weight(digimon.getWeight());

          /* String description = digimon.getDescriptions().stream()
                    .filter(descriptions -> "en_us".equals(descriptions.getLanguage()))
                    .findFirst().orElse(Pokemon.Descriptions.builder().descriptions("Description not found").build())
                    .getDescriptions(); */

          /*   List<String> types = new ArrayList<>();
            DigimonField digimonField = digimonClientApi.getDigimonField();
            log.info(digimonField.getFlavor_text_entries().get(0).getFlavor_text()); 
                /*types.add(Result.Field.builder().name(digimonField.getName())
                        .description(digimonField.getDescription())
                        .build());
                
            });
            resultBuilder.fields(fields);*/
            log.info(resultBuilder.toString());
            return Optional.of(resultBuilder.build());
        }
        return Optional.empty();
    }

}
