package org.hsz.lwdbiz.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

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
public class orderController {
	
	private static final Logger logger = LoggerFactory.getLogger(orderController.class);
	
	public OrderForm initForm() {
		logger.info("init order form..");
		OrderForm orderForm = new OrderForm();
		/*orderForm.setQuantity(1);
		orderForm.setOrderDate(simpleDateFormat.format(new Date()));*/
		return orderForm;
	}
	
	public Map<Long, String> initSelectableCategories(){
		logger.info("init selectable categories..");
		Map<Long, String> selectableCategories = new HashMap<Long, String>();
		selectableCategories.put(10000L, "java");
		return selectableCategories;
	}
	
	public Map<Long, String> initSelectableBooks(OrderForm orderForm) {
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
	
}
