package transferts;

import java.util.Date;

public class Transferts {

	private int idCompte;
	private int idCompte_1;
	private float montanttransfert;
	private Date datetransfert;

	private Transferts(int IdCompte, int IdCompte_1, float Montanttransfert, Date Datetransfert) {
		this.idCompte = IdCompte;
		this.idCompte_1 = IdCompte_1;
		this.montanttransfert = Montanttransfert;
		this.datetransfert = Datetransfert;

	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public int getIdCompte_1() {
		return idCompte_1;
	}

	public void setIdCompte_1(int idCompte_1) {
		this.idCompte_1 = idCompte_1;
	}

	public float getMontanttransfert() {
		return montanttransfert;
	}

	public void setMontanttransfert(float montanttransfert) {
		this.montanttransfert = montanttransfert;
	}

	public Date getDatetransfert() {
		return datetransfert;
	}

	public void setDatetransfert(Date datetransfert) {
		this.datetransfert = datetransfert;
	}
	
}
