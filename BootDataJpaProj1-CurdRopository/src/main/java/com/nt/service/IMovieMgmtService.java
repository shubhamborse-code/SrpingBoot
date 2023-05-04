package com.nt.service;

import java.util.List;
import java.util.Optional;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import com.nt.entity.Movie;

public interface IMovieMgmtService {
	public String registerMovie(Movie movie);
	public long fetchMovieCount();
	public boolean checkMovieById(int id	);
	public Iterable<Movie> fetchAllMovies();
	public Iterable<Movie> findAllMoviesByIds(List<Integer> mids);
	public Movie findMovieById(Integer id);
	public Iterable<Movie> groupMovieRegistration(List<Movie> listMovie);
	public String updateMovieDetails(Integer mid, String mname, Float mrating);
	public String updateMovie(Movie movie);
}
