package com.bookservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookservice.bean.ResultBean;
import com.bookservice.entity.Book;

@Service("userService")
public class BookServiceImpl implements BookService {

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
