package capas.tarea1.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import capas.tarea1.domain.Book;

public interface LibraryService {
	
	List<Book> fetchAllBooks() throws DataAccessException;
	
	List<Book> fetchBooksByAttribute(String attribute, String value) throws DataAccessException;

}
