package ru.learnup18.aviasales.model;

import lombok.*;

@AllArgsConstructor
@Data
public class Premiere {

    private String name; 
    private String description;
    private String ageCategory;
    private Integer countFreeSeats;
    private Integer countFreeReal;

}
