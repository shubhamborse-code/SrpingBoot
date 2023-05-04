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
		List<Movie> list = repo.serachMovieByIdRange(2, 5);
		list.forEach(System.out:: println);
	}
	
}
