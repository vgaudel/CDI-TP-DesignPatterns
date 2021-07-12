package articles;

public class BlueRay extends Article {

	public BlueRay(String nom, String ref, double prix, int poids) {
		super(nom, ref, prix, poids);
		this.setFragilite();
	}
	public void setFragilite() {
		this.fragilite="légère";
	}
	
	@Override
	public String toString() {
		return "BlueRay : titre= "+ this.getNom()+" Ref= "+ this.getRef()+" Prix= "+ this.getPrix() + " Poids= "+ this.getPoids()+"g";
	}
}
