package rgp_exercice_callisthenics;
	public class personnage {
		int point_de_vie=1000;
		int niveau=1;
		int vivant=1;
		int verify_negative_sign(int nombre) {
			if(nombre<=0) {
			return 0;
			}
			return nombre;
		} 
		void attaqué(int degat) {
			if (point_de_vie>0) {
				point_de_vie-=degat;
			point_de_vie=verify_negative_sign(point_de_vie);
			vivant=verify_negative_sign(vivant);	
		}
		}
		int depassement_seuil1000(int nombre) {
			if(nombre>=1000) {
			return 1000;
			}
			return nombre;
		} 
		void recevoir_soins(int gain) {
			if(vivant==1 && point_de_vie<1000 && point_de_vie>0 ) {
				point_de_vie+=gain;
				point_de_vie=depassement_seuil1000(point_de_vie);
			}
			point_de_vie=verify_negative_sign(point_de_vie);
			vivant=verify_negative_sign(vivant);
		}
		}
		




