package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Movie;
import com.nt.view.ResultView;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	public List<ResultView> findByMidGreaterThanAndMidLessThan(int startMid, int endMid);
}
