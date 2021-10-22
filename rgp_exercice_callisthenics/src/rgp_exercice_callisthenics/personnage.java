package rgp_exercice_callisthenics;
public class personnage {
	   initial_values val_init =new initial_values();
		int verify_negative_sign(int nombre) {
			if(nombre<=0) {
			return 0;
			}
			return nombre;
		} 
		void attaqué() {
			if (initial_values.point_de_vie>0) {
				initial_values.point_de_vie-=initial_values.dégat;
			initial_values.point_de_vie=verify_negative_sign(initial_values.point_de_vie);
			initial_values.vivant=verify_negative_sign(initial_values.vivant);
		}
		}
		int depassement_seuil(int nombre) {
			if(nombre>=1000) {return 1000;}
			return nombre;
		} 
		void recevoir_soins() {
			if(initial_values.vivant==1 && initial_values.point_de_vie<1000 && initial_values.point_de_vie>0 ) {
				initial_values.point_de_vie+=initial_values.soins;
				initial_values.point_de_vie=depassement_seuil(initial_values.point_de_vie);
			}
			initial_values.point_de_vie=verify_negative_sign(initial_values.point_de_vie);
			initial_values.vivant=verify_negative_sign(initial_values.vivant);
		}
		}


	
		




