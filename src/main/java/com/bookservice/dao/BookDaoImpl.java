package com.bookservice.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bookservice.entity.Book;

@Transactional
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<Object> getAllBooks() throws Exception {
		String getBooksHsql = "SELECT id, name, author, publishDate, purchaseDate, retiredDate, price FROM Book";
		return (ArrayList<Object>) entityManager.createQuery(getBooksHsql).getResultList();
	}

	public void updateBook(Book book) throws Exception {
		entityManager.merge(book);
	}

	public int getbookcount(String bookName) throws Exception {
		Query query = entityManager.createQuery("SELECT COUNT(*) count FROM Book WHERE name = ?");
		query.setParameter(1, bookName);
		int count = (Integer) query.getSingleResult();
		return count;
	}

	public void retirebook(String bookName, Date retireDate) throws Exception {
		Book book = new Book();
		book.setName(bookName);
		book.setRetiredDate(retireDate);
		entityManager.merge(book);
	}

}
