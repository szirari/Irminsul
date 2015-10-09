package m2i.Formation.VenteEnLigne;

import java.util.Date;

public class CD extends Media {
	private String title;
	private Authors author = new Authors("toto", "toto", "FR", 2);
	private Date dateSortie = new Date();
	private CdCategory categoryCd;
	
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

	public CdCategory getCategoryCd() {
		return categoryCd;
	}
	public void setCategoryCd(CdCategory categoryCd) {
		this.categoryCd = categoryCd;
	}	


}
