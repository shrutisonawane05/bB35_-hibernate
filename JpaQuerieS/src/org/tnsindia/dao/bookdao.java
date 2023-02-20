package org.tnsindia.dao;



	import java.util.List;

	import org.tnsindia.entities.book;

	public interface bookdao {

		//abstract method
		book getbookById(int id);
		List<book>getAllBooks();
		List<book>getAuthorBooks(String author);
		Long getbooksCount();
		List<book>getbookByPrice(int low,int high);

	}

