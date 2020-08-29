package com.roliveira.repository;

import java.util.Map;

import com.roliveira.model.Movie;

public interface RedisRepository {

    /**
     * Return all movies
     */
    Map<Object, Object> findAllMovies();

    /**
     * Add key-value pair to Redis.
     */
    void add(Movie movie);

    /**
     * Delete a key-value pair in Redis.
     */
    void delete(String id);
    
    /**
     * find a movie
     */
    Movie findMovie(String id);
    
}
