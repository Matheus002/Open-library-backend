package com.api.library.domain.enums;

public enum Language {
	ENGLISH(1, "English"),
	FRENCH(2, "French"),
	GERMAN(3, "German"),
	SPANISH(4, "Spanish"),
	ITALIAN(5, "Italian");
	
	private int cod;
	private String description;
	
	
	private Language(int cod, String description) {
		this.cod = cod;
		this.description = description;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	public static Language toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (Language x : Language.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Invalid Id" + cod);	
	}
	
	

}
