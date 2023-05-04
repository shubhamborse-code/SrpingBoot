package com.nt.runner;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IMovieMgmtService;

@Component
public class CrudRepTestRunner implements CommandLineRunner {

	@Autowired 
	private IMovieMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			List<Integer> list = new ArrayList<>();
			list.add(21);
			list.add(22);
			System.out.println(service.removeMovieByIds(list));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
