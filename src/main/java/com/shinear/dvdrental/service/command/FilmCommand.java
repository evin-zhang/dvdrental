package com.shinear.dvdrental.service.command;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class FilmCommand {
    private Integer id;
    private String title;
    private String description;
    private Integer releaseYear;
    private Short rentalDuration;
    private BigDecimal rentalRate;
    private Short length;
    private BigDecimal replacementCost;
    private Integer languageId;
    private List<Integer> actorIds = new ArrayList<>();
    private List<Integer> categoryIds = new ArrayList<>();

}
