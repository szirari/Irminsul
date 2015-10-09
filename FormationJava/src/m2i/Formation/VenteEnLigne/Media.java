package m2i.Formation.VenteEnLigne;

public abstract class  Media extends Item{
	private MediaCategory Category;

	public MediaCategory getCategory() {
		return Category;
	}

	public void setCategory(MediaCategory category) {
		Category = category;
	}
	
	
	public abstract double getVATPrice();
}
