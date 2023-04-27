package com.BikkadIT.ControllerToUI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.ControllerToUI.Model.Book;

@Controller
public class BooksController {
	
	@GetMapping("/getBook")
	public ModelAndView getBook() {
		
		Book book=new Book();
		book.setBookid(11);
		book.setBookname("JAVA");
		book.setBookprice(500.00);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("BOOKS", book);
		mav.setViewName("book");
	
		return mav;
	}
	
	@GetMapping("/getBooks")
	public String getBooks(Model model) {
		
		Book book1=new Book();
		book1.setBookid(11);
		book1.setBookname("JAVA");
		book1.setBookprice(500.00);
		
		Book book2=new Book();
		book2.setBookid(12);
		book2.setBookname("Python");
		book2.setBookprice(450.00);
		
		Book book3=new Book();
		book3.setBookid(13);
		book3.setBookname("C++");
		book3.setBookprice(200.00);
		
		Book book4=new Book();
		book4.setBookid(14);
		book4.setBookname("OOPS");
		book4.setBookprice(500.00);
		
		List<Book> list=new ArrayList();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		
		model.addAttribute("BOOKS", list);
		
		return "books";
		
	}

}
