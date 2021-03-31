package com.shinear.dvdrental.controller.staff.resource;

import java.math.BigDecimal;
import java.util.List;
import lombok.Data;

@Data
public class FilmResource {
    private Integer id;
    private String title;
    private String description;
    private Integer releaseYear;
    private BigDecimal rentalRate;
    private Short length;
    private LanguageResource language;
    private List<ActorResource> actors;
    private List<CategoryResource> categories;
}
