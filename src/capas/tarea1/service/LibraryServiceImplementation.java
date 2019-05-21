package capas.tarea1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import capas.tarea1.dao.BookDAO;
import capas.tarea1.domain.Book;

@Service
public class LibraryServiceImplementation implements LibraryService {

	@Autowired
	BookDAO bookDAO;
	
	@Override
	public List<Book> fetchAllBooks() throws DataAccessException {
		return bookDAO.fetchAll();
	}

	@Override
	public List<Book> fetchBooksByAttribute(String attribute, String value) throws DataAccessException {	
		return bookDAO.fetchByAttribute(attribute, value);
	}
	
}
