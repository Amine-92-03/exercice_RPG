package rgp_exercice_callisthenics;

public class soin {
	static int soins;
	static void recevoir_soins() {
		if(vivant_oupas.vivant==1 && point_vie.point_de_vie<1000 && point_vie.point_de_vie>0 ) {
		   point_vie.point_de_vie+=soin.soins;
		   sur_dosage.sur_dose();
		   System.out.println(point_vie.point_de_vie);
		}
	}
	}

