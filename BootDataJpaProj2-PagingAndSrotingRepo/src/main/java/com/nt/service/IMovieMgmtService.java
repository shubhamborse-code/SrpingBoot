package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.entity.Movie;

public interface IMovieMgmtService {
	public Iterable<Movie> displayMovieByOrder(boolean asc, String... properties);
	public Page<Movie> generateReport(int pageNo, int pageSize, boolean order, String... props);
}
