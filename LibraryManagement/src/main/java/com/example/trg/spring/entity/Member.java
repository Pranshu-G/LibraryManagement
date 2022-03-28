package com.example.trg.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

	public Member() {

	}
	
	@Id
	Integer mid;
	@Column(length=25)
	String name;
	String address;
	
	public Member(Integer mid, String name, String address) {
		super();
		this.mid = mid;
		this.name = name;
		this.address = address;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
