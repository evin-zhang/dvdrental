package com.shinear.dvdrental.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * generated by Generate POJOs.groovy 
 * <p>Date: Mon Jan 11 00:34:39 CST 2021.</p>
 *
 * @author Kevin
 */

@Table ( name ="staff" )
public class StaffDO implements Serializable {


	private static final long serialVersionUID = 4336152656191759947L;


 	@Column(name = "staff_id" )
	private Long   staffId;

 	@Column(name = "first_name" )
	private String   firstName;

 	@Column(name = "last_name" )
	private String   lastName;

 	@Column(name = "address_id" )
	private Integer   addressId;

 	@Column(name = "email" )
	private String   email;

 	@Column(name = "store_id" )
	private Integer   storeId;

 	@Column(name = "active" )
	private Boolean   active;

 	@Column(name = "username" )
	private String   username;

 	@Column(name = "password" )
	private String   password;

 	@Column(name = "last_update" )
	private Date   lastUpdate;

 	@Column(name = "picture" )
	private String   picture;

	public Long  getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId=staffId;
	}

	public String  getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}

	public String  getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName=lastName;
	}

	public Integer  getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId=addressId;
	}

	public String  getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email=email;
	}

	public Integer  getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId=storeId;
	}

	public Boolean  getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active=active;
	}

	public String  getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username=username;
	}

	public String  getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password=password;
	}

	public Date  getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate=lastUpdate;
	}

	public String  getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture=picture;
	}

}
