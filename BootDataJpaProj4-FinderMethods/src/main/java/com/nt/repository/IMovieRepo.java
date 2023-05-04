package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	//select mid,mname,myear,mrating from Movie where mname=?
	public List<Movie> findByMnameEquals(String name);
	//select mid,mname,myear,mrating from Movie where mname=?
	public List<Movie> findByMnameIs(String name);
	//select mid,mname,myear,mrating from Movie where mname=?
	public List<Movie> findByMname(String name);
	//select mid,mname,myear,mrating from Movie where mname like 'R%'
	public List<Movie> findByMnameStartingWith(char initfirst);
	//select mid,mname,myear,mrating from Movie where mname like 'R%'
	public List<Movie>findByMnameEndingWith(char lastName);
	//select mid,mname,myear,mrating from Movie where mname like 'der%'
	public List<Movie> findByMnameContains(String mcontain);
	//select mid,mname,myear,mrating from Movie where mname like 'der%'
		public List<Movie> findByMnameContaining(String mcontain);
		
}
