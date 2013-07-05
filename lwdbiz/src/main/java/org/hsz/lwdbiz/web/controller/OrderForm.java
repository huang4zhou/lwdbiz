package org.hsz.lwdbiz.web.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.hsz.lwdbiz.domain.Book;
import org.hsz.lwdbiz.domain.Category;

public class OrderForm implements Serializable {

	private Map<Book, Integer> selectedBooks = new HashMap<Book, Integer>();

	private Long bookId;
	private Integer quantity;
	private Category category;
	private Date deliveryDate;
	private Date orderDate;

	public void resetSelectedBooks() {
		selectedBooks.clear();
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Map<Book, Integer> getSelectedBooks() {
		return selectedBooks;
	}

	public void setSelectedBooks(Map<Book, Integer> selectedBooks) {
		this.selectedBooks = selectedBooks;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}