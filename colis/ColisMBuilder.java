package colis;

public class ColisMSolidBuilder extends ColisBuilder {

	@Override
	public void choisirTaille() {
		this.colis.setTaille("M");
	}

	@Override
	public void fragileOuPas() {
		this.colis.setFragile(false);
	}

	@Override
	public void affranchir() {
		//M = 5€ 
		this.colis.setAffranchissement(5);
	}

}
