package com.example.moviesApiGatewayOnAws.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movies {
	
	private int id;
	
	private String title;
	
	private String cast;

	public Movies(int id, String title, String cast) {
		
		this.id = id;
		this.title = title;
		this.cast = cast;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}
	
	
	

}
