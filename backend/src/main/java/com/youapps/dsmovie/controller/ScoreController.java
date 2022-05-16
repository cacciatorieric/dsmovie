package com.youapps.dsmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youapps.dsmovie.dto.MovieDto;
import com.youapps.dsmovie.dto.ScoreDto;
import com.youapps.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@Autowired
	private ScoreService service;

	@PutMapping()
	public MovieDto saveScore(@RequestBody ScoreDto dto){
		MovieDto movieDto = service.saveScore(dto);
		return movieDto;
	}
	
}
