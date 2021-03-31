package com.shinear.dvdrental.repository;
import com.shinear.dvdrental.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FilmRepository extends JpaRepository<Film,Long> {
}