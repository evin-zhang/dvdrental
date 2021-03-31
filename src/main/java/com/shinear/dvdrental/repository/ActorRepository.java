package com.shinear.dvdrental.repository;

import java.util.List;

import com.shinear.dvdrental.model.Actor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Long>{
    List<Actor>  findActorBy(Integer filmId); // findByFilmId(filmId: Int): 
    List<Actor>   findByIds(List<Integer> ids); 
    List<Actor>    search(String query);



}