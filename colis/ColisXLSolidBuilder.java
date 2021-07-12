package colis;

public class ColisXLSolidBuilder extends ColisBuilder {
	@Override
	public void choisirTaille() {
		this.colis.setTaille("XL");
	}

	@Override
	public void fragileOuPas() {
		this.colis.setFragile(false);
	}

	@Override
	public void affranchir() {
		//XL= 15€ 
		this.colis.setAffranchissement(15);
	}
}
