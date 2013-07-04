package org.hsz.lwdbiz.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.hsz.lwdbiz.domain.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class OrderController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	public OrderForm initForm() {
		logger.info("init order form..");
		OrderForm orderForm = new OrderForm();
		orderForm.setQuantity(1);
		orderForm.setOrderDate(new Date());
		return orderForm;
	}
	
	public List<Category> initSelectableCategories(){
		logger.info("init selectable categories..");
		List<Category> selectableCategories = new LinkedList<Category>();
		Category category = new Category(10000L,"java");
		selectableCategories.add(category);
		return selectableCategories;
	}
	
	public Map<Long, String> initSelectableBooks(OrderForm orderForm) {
		logger.info("init selectable books.. category:" + orderForm.getCategory().getName());
		//orderForm.getSelectedBooks().clear();
		//orderForm.resetSelectedBooks();

		Map<Long, String> selectableBooks = new HashMap<Long, String>();
		/*for (Book book : bookstoreService.findBooksByCategory(categoryService.findById(orderForm.getCategoryId()))) {
			selectableBooks.put(book.getId(), book.getTitle());
		}*/
		selectableBooks.put(102121L,"spring in action");
		return selectableBooks;
	}
	
	public void addBook(OrderForm orderForm) {
		logger.info("add book");
	}
	
	public void placeOrder(final OrderForm orderForm){
		logger.info("place Order..." + orderForm.getCategory().getName());
	}
	
}
