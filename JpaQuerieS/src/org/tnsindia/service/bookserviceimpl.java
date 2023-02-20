package org.tnsindia.service;


	import java.util.List;

	import org.tnsif.dao.BookDao;
	import org.tnsif.dao.BookDaoImpl;
	import org.tnsif.entities.Book;

	public class bookserviceimpl implements bookservice{

		private bookdao dao;


		public BookServiceImpl() {
			super();
			dao=new BookDaoImpl();
		}

		@Override
		public Book getBookById(int id) {

			return dao.getBookById(id);
		}

		@Override
		public List<Book> getAllBooks() {
			// TODO Auto-generated method stub
			return dao.getAllBooks();
		}

		@Override
		public List<Book> getAuthorBooks(String author) {
			// TODO Auto-generated method stub
			return dao.getAuthorBooks(author);
		}

		@Override
		public Long getBooksCount() {
			// TODO Auto-generated method stub
			return dao.getBooksCount();
		}
		@overide
		public List<Book> getBookByPrice(int low, int high) {
			
			return dao.getBookByPrice(low, high);
		}

	}

