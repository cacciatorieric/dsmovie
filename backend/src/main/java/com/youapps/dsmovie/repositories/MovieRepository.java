package com.youapps.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youapps.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
