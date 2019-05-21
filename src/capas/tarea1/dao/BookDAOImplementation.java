package capas.tarea1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import capas.tarea1.domain.Book;

@Repository
public class BookDAOImplementation implements BookDAO{

	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;
	

	@Override
	public List<Book> fetchAll() throws DataAccessException {
		
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.book");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		List<Book> result = query.getResultList();
		return result;
	}


	@Override
	public List<Book> fetchByAttribute(String attribute, String value) throws DataAccessException {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM book WHERE LOWER(").append(attribute).append(") LIKE LOWER(?1)");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		query.setParameter(1, value);
		List<Book> result = query.getResultList();
		return result;
	}
	
}
