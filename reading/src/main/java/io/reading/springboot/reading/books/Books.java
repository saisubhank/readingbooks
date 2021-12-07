package io.reading.springboot.reading.books;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "books_items")
public class Books {

	public long id;
	private String name;
	
	public Books() {
		
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
