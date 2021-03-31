package com.shinear.dvdrental.service;

import java.util.List;

import com.shinear.dvdrental.controller.customer.resource.FilmResource;
import com.shinear.dvdrental.service.command.FilmCommand;

public interface FilmService {
    List<FilmResource>  findAll();
    FilmResource findById(Integer id);
	List<FilmResource> search();
	Integer create(FilmCommand command);
	Object update(FilmCommand command);
	void delete(Integer id);
}