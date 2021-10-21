package rgp_exercice_callisthenics;

public class Main {
	public static void main(String[]  args) {
		personnage personnage= new personnage();		
		System.out.println(personnage.point_de_vie);
		personnage.attaqué(1880);
		System.out.println(personnage.point_de_vie);
		personnage.recevoir_soins(15550);
		System.out.println(personnage.point_de_vie);
	}
}
