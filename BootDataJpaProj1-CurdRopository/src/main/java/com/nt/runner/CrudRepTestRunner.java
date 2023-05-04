package com.nt.runner;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Movie;
import com.nt.service.IMovieMgmtService;

import antlr.collections.List;

@Component
public class CrudRepTestRunner implements CommandLineRunner {

	@Autowired 
	private IMovieMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		//invoke service method
		/*Movie movie = new Movie();
		  movie.setMname("Machine"); movie.setMyear("2018"); movie.setMrating(4.0f);
		  try { System.out.println(service.registerMovie(movie));
		  System.out.println(service.fetchMovieCount());
		  System.out.println(service.checkMovieById(2)); } catch (Exception e) {
		  e.printStackTrace(); }*/
		 
	/*	try {
			Iterable<Movie> movieList = service.fetchAllMovies();
			for(Movie movie : movieList) System.out.println(movie);
			System.out.println("--------------------------");
			
		} catch (Exception e) {
			e.printStackTrace();
		} */
/*		try {
			java.util.List<Integer> mid = new ArrayList<>();
			mid.add(1); mid.add(2); mid.add(4);
			Iterable<Movie> movies  = service.findAllMoviesByIds(mid);
			for(Movie movie : movies) System.out.println(movie);
			
		} catch (Exception e) {
			e.printStackTrace();
		} */
	/*	try {
			System.out.println("Movie By id:: " + service.findMovieById(1));
		} catch (Exception e) {
			e.printStackTrace();
		} */
	/*	try {
			Iterable<Movie> smovie = service.groupMovieRegistration(java.util.List.of(new Movie("GRAVITY", "2018", 4.0F),
																																		  new Movie("KRISH", "2012", 3.0F),
																																		  new Movie("PIRATES", "2011", 4.5F)
																															));
			for(Movie movie : smovie) System.out.println(movie);
		} catch (Exception e) {
			e.printStackTrace();
		} */
	/*	try {
			System.out.println(service.updateMovieDetails(2, "Shazam", 4.5f));
		} catch (Exception e) {
			e.printStackTrace();
		} */
		try {
			Movie movie = new Movie("SpiderMan", "2019", 4.0f);
			movie.setMid(21);
			System.out.println(service.updateMovie(movie));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
