package com.roliveira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.roliveira.model.Movie;
import com.roliveira.repository.MovieRepository;
import com.roliveira.repository.RedisRepository;

@Service
public class MovieService {

	@Autowired
	private RedisRepository redisRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@HystrixCommand(fallbackMethod = "findByIdentifierCache")
	public Movie findByIdentifier(String id) {
		return movieRepository.findById(id)
			   .map(movie -> {
					redisRepository.add(movie);
					return movie;
				}).orElse(null);
	}
	
	public Movie findByIdentifierCache(String id) {
		return redisRepository.findMovie(id);
	}
}
