package rgp_exercice_callisthenics;
public class Main {
	public static void main(String[]  args) {
		personnage personne =new personnage();
		point_vie.point_de_vie=1000;
		degat.d�gat=80;
		vivant_oupas.vivant=1;
	    soin.soins=10;
		personne.attaqu�();
		System.out.println(point_vie.point_de_vie);
		personne.recevoir_soins();
		System.out.println(point_vie.point_de_vie);
	}
}
