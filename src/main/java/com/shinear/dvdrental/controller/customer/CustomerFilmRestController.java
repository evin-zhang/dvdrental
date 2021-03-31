package com.shinear.dvdrental.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;

import com.shinear.dvdrental.controller.customer.resource.FilmResource;
import com.shinear.dvdrental.service.FilmService;

@RestController
@RequestMapping("/api/v1/customer/films")
@Api(tags = "film")
public class CustomerFilmRestController {
	@Autowired
	@Qualifier("filmService")
	private FilmService filmService;
	/**
	 * view
	 */
	@GetMapping
	@ApiOperation(value="Get movie list",nickname = "customer_get_films")
	public List<FilmResource> index(){
		return filmService.findAll();
	}
	/**
	 * detail
	 * @param id
	 * @return
	 */
	@GetMapping("{id}")
	@ApiOperation(value="Get movie details",nickname="customer_get_film")
	public FilmResource show(@PathVariable Integer id){
		return filmService.findById(id);

	}
	/**
	 * Movie search
	 * @return
	 */
	@GetMapping("search")
	@ApiOperation(value = "Movie search",nickname = "customer_search_films")
	public List<FilmResource> search(){
		return filmService.search();
	}
}
