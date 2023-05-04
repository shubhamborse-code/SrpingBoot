package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepo;

@Service("movieService")
public class MovieMgmtServiceImpl implements IMovieMgmtService {
	@Autowired
	private IMovieRepo movieRepo;
	
	@Override
	public String registerMovie(Movie movie) {
	    System.out.println("Before saving:: " + movie);
		Movie movie1 = movieRepo.save(movie);
		return "Movie is register with id value:: " + movie1.getMid();
	}

	@Override
	public long fetchMovieCount() {
		return  movieRepo.count();
	}

	@Override
	public boolean checkMovieById(int id) {
		return movieRepo.existsById(id);
	}
	@Override
	public Iterable<Movie> fetchAllMovies() {
		return movieRepo.findAll();
	}
	@Override
	public Iterable<Movie> findAllMoviesByIds(List<Integer> mids) {
		return movieRepo.findAllById(mids);
	}
	@Override
	public Movie findMovieById (Integer id) {
		Optional<Movie> opt = movieRepo.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
		return opt.orElseThrow();
	}
	@Override
	public Iterable<Movie> groupMovieRegistration(List<Movie> listMovie) {
		Iterable<Movie> smovie = movieRepo.saveAll(listMovie);
		return smovie;
	}
	@Override
	public String updateMovieDetails(Integer mid, String mname, Float mrating) {
		Optional<Movie> opt = movieRepo.findById(mid);
		if(opt.isPresent()) {
			Movie movie = opt.get();
			movie.setMname(mname);
			movie.setMyear("2023");
			movie.setMrating(mrating);
			movieRepo.save(movie); //always call merge(-) to perform update operation
			return mid + "Movie is update";
		} else {
			return mid + " movie id is not available";
		}//method
	}
	@Override
	public String updateMovie(Movie movie) {
		Optional<Movie> opt = movieRepo.findById(movie.getMid());
		if(opt.isPresent()) {
			movieRepo.save(movie);
			return "Movie is updated";
		} else {
			return "Movie id is not found";
		}
	}//method

}
