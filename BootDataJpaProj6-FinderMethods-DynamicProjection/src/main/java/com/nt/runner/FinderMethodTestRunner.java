package com.nt.runner;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IMovieRepo;
import com.nt.view.ResultView1;
import com.nt.view.ResultView2;
@Component
public class FinderMethodTestRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
			Iterable<ResultView1> list = repo.findByMnameIn(List.of("RRR","Machine"),ResultView1.class);
			list.forEach(v1-> {
				System.out.println(v1.getMname() + " " + v1.getMid());
			});
			
			repo.findByMnameIn(List.of("Spider Man","Shazam", "JHON WICK 4"), ResultView2.class).forEach(v2-> {
				System.out.println(v2.getMid() + " " + v2.getMname() + " " + v2.getMrating());
			});
	}

}
