package com.bookservice.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookservice.dao.BookDao;
import com.bookservice.entity.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {
	
	private BookDao bookDao;

	public List<Object> getAllBooks() throws Exception {
		return bookDao.getAllBooks();
	}

	public void updateBook(Book book) throws Exception {
		bookDao.updateBook(book);
	}

	public int getbookcount(String bookName) throws Exception {
		return bookDao.getbookcount(bookName);
	}

	public void retirebook(String bookName, Date retireDate) throws Exception {
		bookDao.retirebook(bookName, retireDate);
	}

}
