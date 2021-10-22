package rgp_exercice_callisthenics;
public class personnage {
	   initial_values val_init =new initial_values();
		void verify_mort() {
			if(initial_values.point_de_vie<=0 || initial_values.vivant==0) {
				initial_values.point_de_vie=0;
				initial_values.vivant=0;
			}
		} 
		void attaqué() {
			if (initial_values.point_de_vie>0) {
				initial_values.point_de_vie-=initial_values.dégat;
				verify_mort() ;
		}
		}
		
		void sur_dose() {
			if(initial_values.point_de_vie>=1000) {
				initial_values.point_de_vie=1000;
			}
		} 
		void recevoir_soins() {
			if(initial_values.vivant==1 && initial_values.point_de_vie<1000 && initial_values.point_de_vie>0 ) {
			   initial_values.point_de_vie+=initial_values.soins;
			   sur_dose();
			}
		}
		}


	
		




