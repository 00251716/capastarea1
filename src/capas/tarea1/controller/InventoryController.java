package capas.tarea1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import capas.tarea1.domain.Book;
import capas.tarea1.service.LibraryService;

@Controller
@RequestMapping("/inventory")
public class InventoryController {
	
	@Autowired
	LibraryService libraryService;
	
	@GetMapping()
	public ModelAndView showAll() {
		
		ModelAndView mav = new ModelAndView("inventory");
		List<Book> bookList = null;
		Integer countAuthors =0, countBooks = 0;
		try {
			bookList = libraryService.fetchAllBooks();
			countBooks = bookList.stream().mapToInt(Book::getQuantity).sum();
			countAuthors = (int) bookList.stream().map(Book::getAuthor).distinct().count();
		} catch (DataAccessException e) {
			mav.addObject("Error", "Not able to fetch book list");
		}
		mav.addObject("countAuthors", countAuthors);
		mav.addObject("countBooks", countBooks);
		mav.addObject("bookList", bookList);
		return mav;
		
	}
	
	@GetMapping("/search")
	public ModelAndView showByAttribute(@RequestParam String attribute,@RequestParam String value) {
		ModelAndView mav = new ModelAndView("inventory");
		List<Book> bookList = null;
		try {
			bookList = libraryService.fetchBooksByAttribute(attribute, value);
		} catch(DataAccessException e) {
			mav.addObject("error", "Not able to fetch book list");
		}
		mav.addObject("attribute", attribute);
		mav.addObject("value", value);
		mav.addObject("bookList", bookList);
		return mav;
	}
}
