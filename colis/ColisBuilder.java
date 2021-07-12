package colis;



public abstract class ColisBuilder {
	protected Colis colis;
	
	 public Colis getColis() {
	        return this.colis;
	    }
	
	 public void createNewColis() {
	        this.colis = new Colis();
	    }
	 
	 public abstract void choisirTaille();
	 public abstract void fragileOuPas();
	 public abstract void affranchir();

	    
}
