package com.nt.runner;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Movie;
import com.nt.service.IMovieMgmtService;

@Component
public class CrudRepTestRunner implements CommandLineRunner {

	@Autowired 
	private IMovieMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		/* try {
			Iterable<Movie> movie = service.displayMovieByOrder(true, "myear", "mname");
			movie.forEach(System.out:: println);
		} catch (Exception e) {
			e.printStackTrace();
		} */
		try {
			Page<Movie> page = service.generateReport(1, 3, true, "mname");
			List<Movie> list = page.getContent();
			list.forEach(System.out:: println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
