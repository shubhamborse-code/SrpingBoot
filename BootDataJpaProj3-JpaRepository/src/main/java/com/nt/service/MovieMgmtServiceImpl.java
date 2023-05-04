package com.nt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepo;

@Service("movieService")
public class MovieMgmtServiceImpl implements IMovieMgmtService {
	@Autowired
	private IMovieRepo movieRepo;
	
	@Override
	public String removeMovieByIds(List<Integer> ids) {
		List<Movie> list = movieRepo.findAllById(ids);
		int count = list.size();
		movieRepo.deleteAllByIdInBatch(ids);
		return count + " movies are deleted";
	}//method

}
