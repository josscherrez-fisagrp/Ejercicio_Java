package com.mfcc.digi.data.model;

import lombok.Builder;
import lombok.Getter;


import java.util.List;


@Builder
@Getter
public class Result {

    private int id;
    private String name;
    private Double height;
    private Double weight;
    /*private List<Descriptions> descriptions;*/
    private List<String> types;
    private List<String> Weaknesses;

    public static class ResultBuilder {

        @Override
        public String toString() {
            return "\n--------------PokeDex---------------"+
                    "\nBlaziken Information \n" +
                    "Code: " + id +
                    "\nName: " + name +
                    "\nHeight: " + height +
                    "\nWeight: " + weight +
                    "\nDescription: " +
                    "\nType: " + types +
                    "\nWeaknesses: " + Weaknesses+
                    "\nStat:";
        }
    }

/*   @Builder
    @Getter
    public static class Field {
        private String name;
        private String description;

        @Override
        public String toString() {
            return String.format("Name: %s Description: %s", name, description);
        }
    }*/  

}
