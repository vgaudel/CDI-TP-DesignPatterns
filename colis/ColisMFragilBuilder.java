package colis;

public class ColisMFragilBuilder extends ColisBuilder {

	@Override
	public void choisirTaille() {
		this.colis.setTaille("M");
	}

	@Override
	public void fragileOuPas() {
		this.colis.setFragile(true);
	}

	@Override
	public void affranchir() {
		//M = 5€ + 5€ fragilité
		this.colis.setAffranchissement(10);
	}

}
