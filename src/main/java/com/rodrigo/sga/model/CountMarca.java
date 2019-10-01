package com.rodrigo.sga.model;

import javax.persistence.Column;

public class CountMarca {
	@Column( name = "count" )
	long count;
	@Column( name = "marca" )
	String marca;
	
	
	public CountMarca() {
		super();
	}
	public CountMarca(long count, String marca) {
		super();
		this.count = count;
		this.marca = marca;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	

}
