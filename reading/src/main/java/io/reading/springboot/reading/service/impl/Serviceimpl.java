package io.reading.springboot.reading.service.impl;

import java.util.List;

import io.reading.springboot.reading.books.Books;
import io.reading.springboot.reading.repository.Repository;
import io.reading.springboot.reading.servicee.Service;

public class Serviceimpl implements Service {
	
	
	private Repository Repository;
	
	public Serviceimpl(Repository repository) {
		super();
		this.Repository = repository;
	}

	
	

}
