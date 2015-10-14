package m2i.Formation.test;

import org.junit.*;
import m2i.Formation.VenteEnLigne.entities.Book;

public class EntitiesTests {

	@Test
	public void test() {
		Book b = new Book();
		b.setId(3);
		Assert.assertEquals(3, b.getId());
	}

}
