package rgp_exercice_callisthenics;

public class attaque {
	static void attaqu�() {
		if (point_vie.point_de_vie>0) {
			point_vie.point_de_vie-=degat.d�gat;
			vivant_oupas.verify_mort() ;
			System.out.println(point_vie.point_de_vie);
	}
	}
}
