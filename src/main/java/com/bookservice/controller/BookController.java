package com.bookservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

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
@Api(value="BookService", description="Book Service for Library")
public class BookController {
	
	private BookService bookService;
	
	@RequestMapping(value="/getallbooks", method=RequestMethod.GET)
	@ApiOperation(value = "View a list of books", response = ResultBean.class)
	public ResultBean getAllBooks() throws Exception {
		ResultBean resultBean = new ResultBean();
		HashMap<String, ArrayList<Object>> userResultMap = new HashMap<String, ArrayList<Object>>();
		userResultMap.put("Result", (ArrayList<Object>) bookService.getAllBooks());
		resultBean.setResult(userResultMap);
		return resultBean;
	}
	
	@RequestMapping(value="/updatebook", method=RequestMethod.GET)
	@ApiOperation(value="Update Book in Book List", response=ResultBean.class)
	public ResultBean updateBook(Book book) throws Exception {
		bookService.updateBook(book);
		ResultBean resultBean = new ResultBean();
		return resultBean;
	}

	@RequestMapping(value="/getbookcount", method=RequestMethod.GET)
	@ApiOperation(value="Get count of a specific book", response=ResultBean.class)
	public ResultBean getbookcount(String bookName) throws Exception {
		int count = bookService.getbookcount(bookName);
		System.out.println("Book Count: " + count);
		ResultBean resultBean = new ResultBean();
		return resultBean;
	}
	
	@ApiOperation(value="Retire a book", response=ResultBean.class)
	@RequestMapping(value="/retirebook", method=RequestMethod.GET)
	public ResultBean retirebook(String bookName, String retireDate) throws Exception {
		/*Date retireDate = new Date(retireDate);
		bookService.retirebook(bookName, retireDate);*/
		ResultBean resultBean = new ResultBean();
		return resultBean;
	}
}
