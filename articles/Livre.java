package articles;

public class Livre extends Article {

	public Livre(String nom, String ref, double prix, int poids) {
		super(nom, ref, prix, poids);
		this.setFragilite();
	}
	
	public void setFragilite() {
		this.fragilite="aucune";
	}
	@Override
	public String toString() {
		return "Livre : titre= "+ this.getNom()+" Ref= "+ this.getRef()+" Prix= "+ this.getPrix() + " Poids= "+ this.getPoids()+"g";
	}

}
