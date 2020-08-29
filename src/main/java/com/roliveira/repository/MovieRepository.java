package com.roliveira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roliveira.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, String> {
}
