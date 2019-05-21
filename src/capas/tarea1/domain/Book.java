package capas.tarea1.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "book")
public class Book {

	@Id
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="quantity")
	private int quantity;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String Isbn) {
		isbn = Isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
