package com.mfcc.digi.data.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import org.springframework.core.convert.TypeDescriptor;


@Builder
@Getter
public class Pokemon {

    private int id;
    private String name;
    private Double height;
    private Double weight;
    /*private List<Stats> stats;*/

    @Setter
    @Getter
    public static class Levels {
        private int id;
        private Double height;
        private Double weight;
    }

    @Setter
    @Getter
    public static class Types {
        private int id;
        private String types;

    }

    @Setter
    @Getter
    public static class Weaknesses {
        private int id;
        
    }





}
