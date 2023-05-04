package com.nt.runner;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Movie;
import com.nt.repository.IMovieRepo;
@Component
public class FinderMethodTestRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * System.out.
		 * println("==========selecting all columns values using name================="
		 * );
		 * 
		 * List<Movie> list = repo.searchByMovieName("Shazam", "RRR", "Machine");
		 * list.forEach(System.out:: println);
		 */
		
		/*
		 * System.out.
		 * println("==========Scalar Queryesselecting specific  column values ================="
		 * ); List<Object[]> list = repo.fetchMovieDetailsByRatingAndYear(3.0f, "2011",
		 * "2023"); list.forEach(x-> { for(Object obj : x) System.out.print(obj + " ");
		 * System.out.println(); });
		 */
		System.out.println("============ Select only single column values===================");
		List<Object[]> list = repo.fectchMovieNameByYearRange("2010", "2020");
		list.forEach(x-> {
			for(Object object : x) System.out.println(object);
		});
		
	}
	
}
