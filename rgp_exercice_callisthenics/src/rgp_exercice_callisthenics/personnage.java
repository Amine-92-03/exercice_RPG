package rgp_exercice_callisthenics;
public class personnage {
		void verify_mort() {
			if(point_vie.point_de_vie<=0 || vivant_oupas.vivant==0) {
				point_vie.point_de_vie=0;
				vivant_oupas.vivant=0;
			}
		} 
		void attaqu�() {
			if (point_vie.point_de_vie>0) {
				point_vie.point_de_vie-=degat.d�gat;
				verify_mort() ;
		}
		}
		void sur_dose() {
			if(point_vie.point_de_vie>=1000) {
				point_vie.point_de_vie=1000;
			}
		} 
		void recevoir_soins() {
			if(vivant_oupas.vivant==1 && point_vie.point_de_vie<1000 && point_vie.point_de_vie>0 ) {
			   point_vie.point_de_vie+=soin.soins;
			   sur_dose();
			}
		}
		}


	
		




