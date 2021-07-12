package colis;

public class ColisLSolidBuilder extends ColisBuilder {
	@Override
	public void choisirTaille() {
		this.colis.setTaille("L");
	}

	@Override
	public void fragileOuPas() {
		this.colis.setFragile(false);
	}

	@Override
	public void affranchir() {
		//L= 10€ 
		this.colis.setAffranchissement(10);
	}
}
