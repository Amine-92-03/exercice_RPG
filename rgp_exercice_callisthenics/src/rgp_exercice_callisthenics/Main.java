package rgp_exercice_callisthenics;
public class Main {
	public static void main(String[]  args) {
		personnage personne =new personnage();
		 initial_values.point_de_vie=1000;
		 initial_values.dégat=120;
		 initial_values.vivant=1;
		 initial_values.soins=40;
		personne.attaqué();
		System.out.println(initial_values.point_de_vie);
		personne.recevoir_soins();
		System.out.println(initial_values.point_de_vie);
	}
}
