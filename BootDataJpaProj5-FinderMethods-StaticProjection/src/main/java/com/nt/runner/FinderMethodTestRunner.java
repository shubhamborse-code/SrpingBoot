package com.nt.runner;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IMovieRepo;
import com.nt.view.ResultView;
@Component
public class FinderMethodTestRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
			List<ResultView> lis = repo.findByMidGreaterThanAndMidLessThan(1, 30);
			lis.forEach(view-> {
				System.out.println("Runner class object:: " + view.getClass());
				System.out.println(view.getMid() + "  " + view.getMname());
			});
	}

}
