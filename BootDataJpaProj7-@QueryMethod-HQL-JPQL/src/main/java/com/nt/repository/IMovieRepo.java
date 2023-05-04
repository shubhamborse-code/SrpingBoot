package com.nt.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.model.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
//	@Query("from Movie where mid>=?1 and mid<=?2")//entity query 	
//	@Query("from Movie where mid>=:minn and mid<=:maxx")
//	public List<Movie> serachMovieByIdRange(@Param("minn")  int  min ,@Param("maxx") int max);
	@Query("from Movie m where m.mid>=:min and m.mid<=:max")
	public List<Movie> serachMovieByIdRange( int  min , int max);
	
}
