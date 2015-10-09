package m2i.Formation.VenteEnLigne;

import java.util.Date;

public class Dvd extends Media{
	private String title;
	private Authors author = new Authors("toto", "toto", "FR", 2);
	private Date dateSortie = new Date();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
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
	
	
}
