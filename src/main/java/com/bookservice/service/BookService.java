package com.bookservice.service;

import java.util.List;

import com.bookservice.entity.Book;

public interface BookService {
	
	public List<Object> getAllBooks() throws Exception;
	public void updateBook(Book book) throws Exception;
	public int getbookcount(String bookName) throws Exception;
	public void retirebook(String bookName, String retireDate) throws Exception;
}
