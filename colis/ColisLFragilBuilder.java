package colis;

public class ColisLFragilBuilder extends ColisBuilder {
	@Override
	public void choisirTaille() {
		this.colis.setTaille("L");
	}

	@Override
	public void fragileOuPas() {
		this.colis.setFragile(true);
	}

	@Override
	public void affranchir() {
		//L= 10€ + 5€ fragilité
		this.colis.setAffranchissement(15);
	}
}
