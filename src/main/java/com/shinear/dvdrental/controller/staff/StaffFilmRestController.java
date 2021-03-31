package com.shinear.dvdrental.controller.staff;

import java.util.List;

import com.shinear.dvdrental.controller.customer.resource.FilmResource;
import com.shinear.dvdrental.controller.staff.param.FilmRestParam;
import com.shinear.dvdrental.service.FilmService;
import com.shinear.dvdrental.service.command.FilmCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/staff/films")
@Api(tags = "film")
public class StaffFilmRestController {
    @Autowired
    @Qualifier("filmService")
    private FilmService filmService;
    /**
     * staff get films
     */
    @GetMapping
    @ApiOperation(value = "Get Film list",nickname = "staff_get_films")
    public List<FilmResource> index(){
        return filmService.findAll();
    }
    /**
     * Get Film details
     * @param id
     * @return
     */
    @GetMapping("{id}")
    @ApiOperation(value="Get Film details",nickname = "staff_get_film")
    public FilmResource show(@PathVariable Integer id){
        return filmService.findById(id);
    }
    /**
     * Film search
     * @return
     */
    @GetMapping("search")
    @ApiOperation(value="Film search",nickname = "staff_search_films")
    public List<FilmResource> search(){
        return filmService.search();
    }
    /**
     * Film making
     * @param filmRestParam
     * @return
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Film making",nickname = "taff_create_film")
    public Integer create(@RequestBody @Validated FilmRestParam filmRestParam){
        FilmCommand command = new FilmCommand();
        command.setTitle(filmRestParam.getTitle());
        command.setDescription(filmRestParam.getDescription());
        command.setReleaseYear(filmRestParam.getReleaseYear());
        command.setRentalDuration(filmRestParam.getRentalDuration());
        command.setRentalRate(filmRestParam.getRentalRate());
        command.setLength(filmRestParam.getLength());
        command.setReplacementCost(filmRestParam.getReplacementCost());
        command.setLanguageId(filmRestParam.getLanguageId());
        command.setActorIds(filmRestParam.getActorIds());
        command.setCategoryIds(filmRestParam.getCategoryIds());
        return filmService.create(command);
        
        
    }
    /**
     * Film making
     * @param id
     * @param filmRestParam
     */
    @PutMapping("{id}")
    @ApiOperation(value = "Film making",nickname = "staff_update_film")
    public void update(@PathVariable  Integer id,@RequestBody @Validated FilmRestParam filmRestParam ){
        FilmCommand command = new FilmCommand();
        command.setId(id);
        command.setTitle(filmRestParam.getTitle());
        command.setDescription(filmRestParam.getDescription());
        command.setReleaseYear(filmRestParam.getReleaseYear());
        command.setRentalDuration(filmRestParam.getRentalDuration());
        command.setRentalRate(filmRestParam.getRentalRate());
        command.setLength(filmRestParam.getLength());
        command.setReplacementCost(filmRestParam.getReplacementCost());
        command.setLanguageId(filmRestParam.getLanguageId());
        command.setActorIds(filmRestParam.getActorIds());
        command.setCategoryIds(filmRestParam.getCategoryIds());
        filmService.update(command);
    }

    /**
     * Film deletion
     * @param id
     */
    @DeleteMapping("{id}")
    @ApiOperation(value="Film deletion", nickname = "staff_delete_film")
    public void delete (@PathVariable Integer id){
        filmService.delete(id);
    }
}
