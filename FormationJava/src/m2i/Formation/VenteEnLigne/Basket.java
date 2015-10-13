package m2i.Formation.VenteEnLigne;

import java.util.*;

public class Basket {

	private List<Media> medias = new ArrayList<Media>();

	public List<Media> getMedias() {
		return medias;
	}
	
	public double getVATPrice(){
		double price = 0;
		
		for (Media m : medias)
			price += m.getVATPrice();
		return price; 
	}
}
