package com.shinear.dvdrental.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * generated by Generate POJOs.groovy 
 * <p>Date: Mon Jan 11 00:34:39 CST 2021.</p>
 *
 * @author Kevin
 */
@Entity
@Table ( name ="film_category" )
public class FilmCategory implements Serializable {


	private static final long serialVersionUID = 9093041174730392745L;

	
 	@Column(name = "film_id" )
	private Integer   filmId;
	
 	@Column(name = "category_id" )
	private Integer   categoryId;

 	@Column(name = "last_update" )
	private Date   lastUpdate;

	public Integer  getFilmId() {
		return this.filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId=filmId;
	}

	public Integer  getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId=categoryId;
	}

	public Date  getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate=lastUpdate;
	}

}