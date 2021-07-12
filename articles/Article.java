package articles;

public abstract class Article {
	private String nom;
	private String ref;
	private double prix;
	private int poids;
	public String fragilite;

	public Article (String nom, String ref, double prix,int poids) {
		this.nom=nom;
		this.ref=ref;
		this.prix=prix;
		this.poids=poids;
	}
	
	public String getNom() {
		return this.nom;
	}

	public String getRef() {
		return this.ref;
	}

	public double getPrix() {
		return this.prix;
	}
	
	public int getPoids() {
		return this.poids;
	}

	public String getFragilite() {
		return this.fragilite;
	}
	
	public abstract void setFragilite();
	
	@Override
	public String toString() {
		return "Article : Nom= "+ this.getNom()+" Ref= "+ this.getRef()+" Prix= "+ this.getPrix() + " Poids= "+ this.getPoids() +"g";
	}
	
}
