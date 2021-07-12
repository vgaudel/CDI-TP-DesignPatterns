package colis;

public class Colis {
	
	private String taille;
	private boolean fragile;
	private double affranchissement;
	
	
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public void setFragile(boolean fragile) {
		this.fragile = fragile;
	}
	public void setAffranchissement(double affranchissement) {
		this.affranchissement = affranchissement;
	}
	
	/*public double getAffranchissement() {
		return this.affranchissement;
	}*/
	
	@Override
	public String toString() {
		String ret = "Colis de taille : " + taille ;
		if (fragile) {ret += " Fragile ";}
		ret += " Affranchissement : " + affranchissement +"€";
		return ret;
	}
	
}
