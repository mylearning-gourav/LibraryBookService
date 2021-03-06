package com.bookservice.dao;

import java.util.Date;
import java.util.List;

import com.bookservice.entity.Book;

public interface BookDao {
	
	public List<Object> getAllBooks() throws Exception;
	public void updateBook(Book book) throws Exception;
	public int getbookcount(String bookName) throws Exception;
	public void retirebook(String bookName, Date retireDate) throws Exception;
}
