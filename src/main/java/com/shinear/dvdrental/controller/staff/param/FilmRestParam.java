package com.shinear.dvdrental.controller.staff.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class FilmRestParam implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Size(min = 1, max = 5)
    @NotBlank
    private String title;
    @Size(min = 1, max = 500)
    private String description;

    @Min(1901)
    @Max(2155)
    private Integer releaseYear;

    private Short rentalDuration;

    private BigDecimal rentalRate;

    private Short length;

    private BigDecimal replacementCost;

    private Integer languageId;

    private List<Integer> actorIds = new ArrayList<>();

    private List<Integer> categoryIds = new ArrayList<>();

}
