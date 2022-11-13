# CalculateurCreditImmov1
Premier projet visant à afficher les échéances d'un crédit immobilier

Objectif : réaliser une application Java permettant de restituer les échéances et montants d'un crédit immobilier auprès d'un utilisateur.

La première version sans objets permet uniquement de consulter l'échéancier de remboursement.
La seconde version avec objets permet de consulter l'échéancier de remboursement ainsi que de retrouver la somme associée à un mois.
Voici le déroulé du second programme ;

1) l'utilisateur saisit la valeur totale du bien
2) l'utilisateur saisit son apport en capital
3) l'utilisateur saisit la durée du crédit en années
4) l'utilisateur saisit le taux d'intérêt
5) le programme calcule le montant associé à chaque mois de remboursement
	La méthode de calcul par intérêts constants : (prix total - apport) * taux d'intérêts / nombre de mois du crédit
6) le programme affiche les remboursements + le total du crédit avec intérêts
7) l'utilisateur interroge le programme sur un mois et une année souhaitée
8) le programme affiche le montant pour la saisie de l'utilisateur
