package com.adsway.log.entity;

public enum CreatedByType {

	AUTO(1),

	USER(2);

	public final int value;

	private CreatedByType(int value) {
		this.value = value;
	}
	
	
}
