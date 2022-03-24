package compte;

public class CompteCourant extends Compte {

	private int fraisTrans; 
	private int soldeMinAutorise; 
	
	public CompteCourant(int FraisTrans, int SoldeMinAutorise) {
		super();
		// TODO Auto-generated constructor stub
		this.fraisTrans = FraisTrans; 
		this.soldeMinAutorise = SoldeMinAutorise; 
	}

	public int getFraisTrans() {
		return fraisTrans;
	}

	public void setFraisTrans(int fraisTrans) {
		this.fraisTrans = fraisTrans;
	}

	public int getSoldeMinAutorise() {
		return soldeMinAutorise;
	}

	public void setSoldeMinAutorise(int soldeMinAutorise) {
		this.soldeMinAutorise = soldeMinAutorise;
	}

	
}
