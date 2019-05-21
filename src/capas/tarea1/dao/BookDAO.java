package capas.tarea1.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import capas.tarea1.domain.Book;

public interface BookDAO {

	//Method to fetch all records
	List<Book> fetchAll() throws DataAccessException;
	
	//Method to fetch records filtered by attribute
	List<Book> fetchByAttribute(String attribute, String value) throws DataAccessException;

}
