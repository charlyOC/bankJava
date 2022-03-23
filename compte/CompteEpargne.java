package compte;

public class CompteEpargne extends Compte {

	private int tauxInt;
	private int plafond; 

	public CompteEpargne(int TauxInt, int Plafond) {
		super();
		this.tauxInt = TauxInt; 
		this.plafond = Plafond; 
		// TODO Auto-generated constructor stub
	}

	public int getTauxInt() {
		return tauxInt;
	}

	public void setTauxInt(int tauxInt) {
		this.tauxInt = tauxInt;
	}

	public int getPlafond() {
		return plafond;
	}

	public void setPlafond(int plafond) {
		this.plafond = plafond;
	}
	
}