package com.bookservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookservice.bean.ResultBean;
import com.bookservice.entity.Book;

@RestController
@RequestMapping(value="/bookservices")
public class BookController {
	
	@RequestMapping(value="/getallbooks", method=RequestMethod.GET)
	public ResultBean getAllBooks() throws Exception {
		ResultBean resultBean = new ResultBean();
		return resultBean;
	}
	
	@RequestMapping(value="/updatebook", method=RequestMethod.GET)
	public ResultBean updateBook(Book book) throws Exception {
		ResultBean resultBean = new ResultBean();
		return resultBean;
	}

	@RequestMapping(value="/getbookcount", method=RequestMethod.GET)
	public ResultBean getbookcount(String bookName) throws Exception {
		ResultBean resultBean = new ResultBean();
		return resultBean;
	}
	
	@RequestMapping(value="/retirebook", method=RequestMethod.GET)
	public ResultBean retirebook(String bookName, String retireDate) throws Exception {
		ResultBean resultBean = new ResultBean();
		return resultBean;
	}
}
