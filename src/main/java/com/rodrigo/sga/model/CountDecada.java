package com.rodrigo.sga.model;

import javax.persistence.Column;

public class CountDecada {
	
	@Column( name = "count" )
	long count;
	
	@Column( name = "decada" )
	int decada;
	
	public long getCount() {
		return count;
	}
	
	public CountDecada() {
		super();
	}

	public CountDecada(long count, int decada) {
		super();
		this.count = count;
		this.decada = decada;
	}

	public void setCount(long count) {
		this.count = count;
	}
	public int getDecada() {
		return decada;
	}
	public void setDecada(int decada) {
		this.decada = decada;
	}
	
}
