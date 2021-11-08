package rgp_exercice_callisthenics;
public class Main {
	public static void main(String[]  args) {
		
		personnage personne =new personnage();
		/* initailisation des variables*/
		/*
		point_vie.point_de_vie=1000;
		degat.dégat=70;
		vivant_oupas.vivant=1;
	    soin.soins=10; */
		personne.attaqué();
		personne.recevoir_soins();
	}
}
