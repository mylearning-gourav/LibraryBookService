package com.bookservice.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookservice.bean.ResultBean;
import com.bookservice.entity.Book;
import com.bookservice.service.BookService;

@RestController
@RequestMapping(value="/bookservices")
public class BookController {
	
	private BookService bookService;
	
	@RequestMapping(value="/getallbooks", method=RequestMethod.GET)
	public ResultBean getAllBooks() throws Exception {
		ResultBean resultBean = new ResultBean();
		HashMap<String, ArrayList<Object>> userResultMap = new HashMap<String, ArrayList<Object>>();
		userResultMap.put("Result", (ArrayList<Object>) bookService.getAllBooks());
		resultBean.setResult(userResultMap);
		return resultBean;
	}
	
	@RequestMapping(value="/updatebook", method=RequestMethod.GET)
	public ResultBean updateBook(Book book) throws Exception {
		bookService.updateBook(book);
		ResultBean resultBean = new ResultBean();
		return resultBean;
	}

	@RequestMapping(value="/getbookcount", method=RequestMethod.GET)
	public ResultBean getbookcount(String bookName) throws Exception {
		int count = bookService.getbookcount(bookName);
		System.out.println("Book Count: " + count);
		ResultBean resultBean = new ResultBean();
		return resultBean;
	}
	
	@RequestMapping(value="/retirebook", method=RequestMethod.GET)
	public ResultBean retirebook(String bookName, String retireDate) throws Exception {
		/*Date retireDate = new Date(retireDate);
		bookService.retirebook(bookName, retireDate);*/
		ResultBean resultBean = new ResultBean();
		return resultBean;
	}
}
