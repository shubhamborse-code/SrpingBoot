package com.nt.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.model.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	/*
	 * @Query("from Movie where mname in(:name1,:name2,:name3)") public List<Movie>
	 * searchByMovieName(String name1, String name2, String name3);
	 */
	
//	@Query("select mname,mrating,myear from Movie where mrating >=:rating and myear in(:y1,:y2)")
//	public List<Object[]> fetchMovieDetailsByRatingAndYear(float rating, String y1, String y2); 
	
	@Query("select mname from Movie where myear>=:start and myear<=:end order by myear" )
	public List<Object[]> fectchMovieNameByYearRange(String start, String end);
}
