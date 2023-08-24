package com.mfcc.digi.data.model;

import java.util.List;

import com.mfcc.digi.data.model.Pokemon.Descriptions;
import com.mfcc.digi.data.model.Pokemon.Language;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Builder
@Getter
public class DigimonField {

    private List<Descriptions> flavor_text_entries;

@Setter
@Getter
    public static class Descriptions {
        private Language language;
        private String flavor_text;

    }

@Setter
@Getter
    public static class Language{
        private String name;

    }


}