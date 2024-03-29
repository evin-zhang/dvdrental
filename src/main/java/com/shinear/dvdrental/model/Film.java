package com.shinear.dvdrental.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table ( name ="film" )
public class Film implements Serializable {


	private static final long serialVersionUID = 4784522027838467102L;

	@Id
 	@Column(name = "film_id" )
	private Long   filmId;

 	@Column(name = "title" )
	private String   title;

 	@Column(name = "description" )
	private String   description;

 	@Column(name = "release_year" )
	private String   releaseYear;

 	@Column(name = "language_id" )
	private Integer   languageId;

 	@Column(name = "rental_duration" )
	private Integer   rentalDuration;

 	@Column(name = "rental_rate" )
	private String   rentalRate;

 	@Column(name = "length" )
	private Integer   length;

 	@Column(name = "replacement_cost" )
	private String   replacementCost;

 	@Column(name = "rating" )
	private String   rating;

 	@Column(name = "last_update" )
	private Date   lastUpdate;

 	@Column(name = "special_features" )
	private String   specialFeatures;

 	@Column(name = "fulltext" )
	private String   fulltext;

	public Long  getFilmId() {
		return this.filmId;
	}

	public void setFilmId(Long filmId) {
		this.filmId=filmId;
	}

	public String  getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title=title;
	}

	public String  getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description=description;
	}

	public String  getReleaseYear() {
		return this.releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear=releaseYear;
	}

	public Integer  getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId=languageId;
	}

	public Integer  getRentalDuration() {
		return this.rentalDuration;
	}

	public void setRentalDuration(Integer rentalDuration) {
		this.rentalDuration=rentalDuration;
	}

	public String  getRentalRate() {
		return this.rentalRate;
	}

	public void setRentalRate(String rentalRate) {
		this.rentalRate=rentalRate;
	}

	public Integer  getLength() {
		return this.length;
	}

	public void setLength(Integer length) {
		this.length=length;
	}

	public String  getReplacementCost() {
		return this.replacementCost;
	}

	public void setReplacementCost(String replacementCost) {
		this.replacementCost=replacementCost;
	}

	public String  getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating=rating;
	}

	public Date  getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate=lastUpdate;
	}

	public String  getSpecialFeatures() {
		return this.specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures=specialFeatures;
	}

	public String  getFulltext() {
		return this.fulltext;
	}

	public void setFulltext(String fulltext) {
		this.fulltext=fulltext;
	}

}
