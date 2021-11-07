package rgp_exercice_callisthenics;

public class vivant_oupas {
	static int vivant;
	static void verify_mort() {
		if(point_vie.point_de_vie<=0 || vivant_oupas.vivant==0) {
			point_vie.point_de_vie=0;
			vivant_oupas.vivant=0;
		}
	} 
}
