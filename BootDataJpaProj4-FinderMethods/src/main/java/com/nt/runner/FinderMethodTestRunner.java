package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IMovieRepo;
@Component
public class FinderMethodTestRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.findByMnameEquals("Shazam").forEach(System.out:: println);
		repo.findByMnameIs("RRR").forEach(System.out:: println);
		repo.findByMname("Machine").forEach(System.out:: println);
		repo.findByMnameStartingWith('R').forEach(System.out:: println);
		repo.findByMnameEndingWith('S').forEach(System.out::println);
		repo.findByMnameContains("der").forEach(System.out::println);
		repo.findByMnameContaining("za").forEach(System.out::println);
	}

}
