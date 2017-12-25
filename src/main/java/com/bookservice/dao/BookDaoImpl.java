package com.bookservice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bookservice.entity.Book;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

	public List<Object> getAllBooks() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateBook(Book book) throws Exception {
		// TODO Auto-generated method stub

	}

	public int getbookcount(String bookName) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public void retirebook(String bookName, String retireDate) throws Exception {
		// TODO Auto-generated method stub

	}

}
