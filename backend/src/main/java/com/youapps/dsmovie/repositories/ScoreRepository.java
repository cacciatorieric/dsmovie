package com.youapps.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youapps.dsmovie.entities.Score;
import com.youapps.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
