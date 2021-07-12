package colis;

public class ColisXLFragilBuilder extends ColisBuilder {
	@Override
	public void choisirTaille() {
		this.colis.setTaille("XL");
	}

	@Override
	public void fragileOuPas() {
		this.colis.setFragile(true);
	}

	@Override
	public void affranchir() {
		//XL= 15€ + 5€ fragilité
		this.colis.setAffranchissement(20);
	}
}
