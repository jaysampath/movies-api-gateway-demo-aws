package com.example.moviesApiGatewayOnAws.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.moviesApiGatewayOnAws.entity.Movies;

@RestController
@RequestMapping("/")
public class MoviesRestController {
	
	private int dummyId = 100;
	private String dummyTitle = "Title";
	private String dummyCast = "Movie Cast";
	
	private List<Movies> movies = new ArrayList<>(){{add(new Movies(dummyId,dummyTitle,dummyCast));}};
	
	
	@GetMapping("/")
	public String homePage() {
		return "<h1>Welcome</h1>"
				+ "<h2>Api Gateway Demo on AWS</h2>";
	}
	
	@GetMapping("/movies")
	public List<Movies> showAllMovies(){
		return movies;
	}
	
	@PostMapping("/movies")
	public Movies addMovie(@RequestBody Movies movie) {
		movies.add(movie);
		return movie;
	}

}
