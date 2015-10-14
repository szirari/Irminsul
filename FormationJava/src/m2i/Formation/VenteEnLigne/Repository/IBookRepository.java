package m2i.Formation.VenteEnLigne.Repository;

import java.io.IOException;
import java.util.List;

import m2i.Formation.VenteEnLigne.entities.Book;

public interface IBookRepository {
	
	String getUri();
	void setUri(String uri);
	List<Book> getAll() throws IOException;
	Book getById(int id) throws IOException;
	List<Book> getByPrice(double price) throws IOException;
	List<Book> getByTitle(String title) throws IOException;

}
