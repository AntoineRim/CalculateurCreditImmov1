import java.util.Arrays;

public class Credit {

	private double valeurBien;
	private double apportCapital;
	private double tauxInterets;
	private int[] dateDebut;
	private int dureeMois;

	public Credit(double valeurBien, double apportCapital, double tauxInterets, int[] dateDebut, int dureeMois) {
		this.valeurBien = valeurBien;
		this.apportCapital = apportCapital;
		this.tauxInterets = tauxInterets;
		this.dateDebut = dateDebut;
		this.dureeMois = dureeMois;
	}
	
	public Credit() {
	}

	public double getValeurBien() {
		return valeurBien;
	}

	public void setValeurBien(double valeurBien) {
		this.valeurBien = valeurBien;
	}

	public double getApportCapital() {
		return apportCapital;
	}

	public void setApportCapital(double apportCapital) {
		this.apportCapital = apportCapital;
	}

	public double getTauxInterets() {
		return tauxInterets;
	}

	public void setTauxInterets(double tauxInterets) {
		this.tauxInterets = tauxInterets;
	}

	public int[] getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(int[] dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDureeMois() {
		return dureeMois;
	}

	public void setDureeMois(int dureeMois) {
		this.dureeMois = dureeMois;
	}
	
	@Override
	public String toString() {
		return "Credit pour une valeur totale de " + valeurBien + ", un apport en Capital de " + apportCapital + ", un taux d'Intérêts de "
				+ tauxInterets + "%, commencant le " + Arrays.toString(dateDebut) + ", et durant " + dureeMois/12 + " années";
	}

	public double calculeMontant() {
		return (this.valeurBien - this.apportCapital) * (1+this.tauxInterets/100);
	}

	public double[] tableauCredit() {
		double tab []= new double [this.dureeMois];
		for (int index = 0; index < this.dureeMois; index++) {
			tab[index] = calculeMontant() / this.dureeMois;
		}
		return tab;
	}
	
	public void afficherEcheances(double tab[]) {
		
		String mois [] = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
		
		int moisdebut = this.dateDebut[0] - 1;
		int anneedebut = this.dateDebut[1];
		
		for (int index = 0; index < this.dureeMois; index++) {
			if (moisdebut == 12) {
				anneedebut++;
				moisdebut = 0;
			}
			System.out.print(mois[moisdebut]+" "+anneedebut+" "+tab[index]+"\n");
			moisdebut++;
		}
	}
	
	public double renduValeur(int mois, int annee) {
		
		 int diffMois = (mois + annee*12) - (this.dateDebut[0]+this.dateDebut[1]*12);
		 
		 return this.tableauCredit()[diffMois];
		 
	}
	
	public String MoistoString(int a) {
		String mois [] = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
		return mois[a-1];
	}
}
