import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quelle est la valeur de votre bien immobilier svp ?");
		double valeur = scanner.nextDouble();
		
		System.out.println("Quelle somme pouvez-vous apporter directement dans l'achat ? (apport)");
		double somme = scanner.nextDouble();
		
		System.out.println("Quel est le taux d'intérêt de votre crédit ?");
		double taux = scanner.nextDouble();

		System.out.println("Quand commence votre crédit ? Mois MM");
		int moisdebut = scanner.nextInt();
		System.out.println("Quand commence votre crédit ? Année AAAA");
		int anneedebut = scanner.nextInt();
		
		int[] tab = {moisdebut, anneedebut};
		
		System.out.println("Quelle est la durée de votre crédit en années ?");
		int duree = scanner.nextInt()*12;
		
		Credit credit = new Credit(valeur, somme, taux, tab, duree);
		
		System.out.println("Echeancier : \n");
		credit.afficherEcheances(credit.tableauCredit());
		
		System.out.println("Vous cherchez à connaître la valeur de votre prêt pour une date. Le mois svp ?");
		int moisvaleur = scanner.nextInt();
		
		System.out.println("L'année svp ?");
		int anneevaleur = scanner.nextInt();
		System.out.println("Résultat pour "+credit.MoistoString(moisvaleur)+" "+anneevaleur+" = "+credit.renduValeur(moisvaleur, anneevaleur)+" euros.");
		
		scanner.close();
	}
}
