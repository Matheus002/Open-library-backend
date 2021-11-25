package com.api.library.domain.enums;

public enum Format {
	PAPERBACK(1, "Paperback"),
	HARDCOVER(2, "Hardcover"),
	AUDIOBOOK(3, "Audiobook"),
	PDF(5, "Pdf");
	
	private int cod;
	private String description;
	
	private Format(int cod, String description) {
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
