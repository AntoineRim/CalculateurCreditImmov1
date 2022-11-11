import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Combien coute le bien immobilier ?");
		int prixbien = scanner.nextInt();
		
		System.out.println("A combien s'eleve votre apport en capital ?");
		int capital = scanner.nextInt();
		
		System.out.println("Quel est votre taux d'emprunt ? Pas besoin d'indiquer le signe %");
		double tauxemprunt = 1 +(scanner.nextDouble()/100);
		
		System.out.println("Sur combien d'annees s'etale votre emprunt ?");
		int anneesemprunt = scanner.nextInt();
		
		System.out.println("A quel mois MM commence votre emprunt ?");
		int moisdebut = scanner.nextInt();
		
		System.out.println("En quelle annee AAAA commence votre emprunt ?");
		int annee = scanner.nextInt();
		
		double rbannuel[] = new double [anneesemprunt*12];
		String mois[] = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
		double montantrembourse = ((prixbien - capital) / (anneesemprunt*12) )*tauxemprunt;
		
		remplirTableau(montantrembourse, rbannuel);
		afficherTableau(rbannuel, mois, moisdebut, annee);

		
		scanner.close();
		
	}

	private static void remplirTableau(double a, double[] tab) {
		for (int index = 0; index < tab.length; index++) {
			tab[index] = a;
		}
	}
	
	private static void afficherTableau(double [] rbannuel, String[] mois, int moisdebut, int annee) {
		moisdebut = moisdebut - 1;
		
		for (int index = 0; index < rbannuel.length; index++) {
			if (moisdebut < 12) {
				System.out.print(mois[moisdebut]+" "+annee+" "+rbannuel[index]);
				moisdebut++;
				System.out.println();
			}
			else {
				moisdebut = 0;
				annee++;
				System.out.print(mois[moisdebut]+" "+annee+" "+rbannuel[index]);
				moisdebut++;
				System.out.println();
			}
		}
	}

}
