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

@Table ( name ="store" )
public class StoreDO implements Serializable {


	private static final long serialVersionUID = 6363229574754536457L;


 	@Column(name = "store_id" )
	private Long   storeId;

 	@Column(name = "manager_staff_id" )
	private Integer   managerStaffId;

 	@Column(name = "address_id" )
	private Integer   addressId;

 	@Column(name = "last_update" )
	private Date   lastUpdate;

	public Long  getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId=storeId;
	}

	public Integer  getManagerStaffId() {
		return this.managerStaffId;
	}

	public void setManagerStaffId(Integer managerStaffId) {
		this.managerStaffId=managerStaffId;
	}

	public Integer  getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId=addressId;
	}

	public Date  getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate=lastUpdate;
	}

}