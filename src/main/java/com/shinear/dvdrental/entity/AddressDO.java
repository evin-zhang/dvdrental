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

@Table ( name ="address" )
public class AddressDO implements Serializable {


	private static final long serialVersionUID = 748222480890562773L;


 	@Column(name = "address_id" )
	private Long   addressId;

 	@Column(name = "address" )
	private String   address;

 	@Column(name = "address2" )
	private String   address2;

 	@Column(name = "district" )
	private String   district;

 	@Column(name = "city_id" )
	private Integer   cityId;

 	@Column(name = "postal_code" )
	private String   postalCode;

 	@Column(name = "phone" )
	private String   phone;

 	@Column(name = "last_update" )
	private Date   lastUpdate;

	public Long  getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId=addressId;
	}

	public String  getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address=address;
	}

	public String  getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2=address2;
	}

	public String  getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district=district;
	}

	public Integer  getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId=cityId;
	}

	public String  getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode=postalCode;
	}

	public String  getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone=phone;
	}

	public Date  getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate=lastUpdate;
	}

}
