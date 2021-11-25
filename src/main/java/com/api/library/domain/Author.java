package com.api.library.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Author implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String biography;
	private Date birthDate; 
	
	public Author() {
		
	}

	public Author(Integer id, String name, String biography, Date birthDate) {
		super();
		this.id= id; 
		this.name = name;
		this.biography = biography;
		this.birthDate = birthDate;
	}

	public Integer getId(){
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
