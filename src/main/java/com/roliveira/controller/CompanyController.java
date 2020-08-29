package com.roliveira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.roliveira.model.Movie;
import com.roliveira.service.MovieService;

@RestController
public class CompanyController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping("/{identifier}")
    public Movie findByIdentifier(@PathVariable("identifier") final String identifier) {
        return movieService.findByIdentifier(identifier);
    }

}
