package m2i.Formation.VenteEnLigne;

import java.util.Date;

public class Dvd extends Media{
	private Authors author = new Authors("toto", "toto", "FR", 2);
	private Date dateSortie = new Date();

	
	public Authors getAuthor() {
		return author;
	}
	public void setAuthor(Authors author) {
		this.author = author;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	@Override
	public double getVATPrice() {
		// TODO Auto-generated method stub
		return getPrice() * 1.05;
	}
	
	
}
