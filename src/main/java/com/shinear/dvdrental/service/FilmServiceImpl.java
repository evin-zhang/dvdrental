package com.shinear.dvdrental.service;

import java.util.ArrayList;
import java.util.List;

import com.shinear.dvdrental.controller.customer.resource.FilmResource;
import com.shinear.dvdrental.model.Film;
import com.shinear.dvdrental.repository.FilmRepository;
import com.shinear.dvdrental.service.command.FilmCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("filmService")
public class FilmServiceImpl implements FilmService {
  @Autowired
  private FilmRepository filmRepository;

  @Override
  public List<FilmResource> findAll() {
    List<Film> filmDO = filmRepository.findAll();
    return new ArrayList<>();
  }

  @Override
  public FilmResource findById(Integer id) {
    FilmResource dto = new FilmResource();
    return dto;
  }

  @Override
  public List<FilmResource> search() {

    return null;
  }

  @Override
  public Integer create(FilmCommand command) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object update(FilmCommand command) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void delete(Integer id) {
    // TODO Auto-generated method stub

  }
    
}
