package rgp_exercice;

public class Main {
	public static void main(String[]  args) {
		personnage personnage= new personnage();		
		System.out.println(personnage.point_de_vie);
		personnage.attaqué(1300);
		System.out.println(personnage.point_de_vie);
		personnage.recevoir_soins(200);
		System.out.println(personnage.point_de_vie);
	}
}
