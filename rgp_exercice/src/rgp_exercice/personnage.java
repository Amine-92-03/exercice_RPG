package rgp_exercice;

public class personnage {
	
	int point_de_vie=1000;
	int niveau=1;
	int vivant=1;
	
	void attaqué(int n) {
		if (point_de_vie>0) {
			point_de_vie-=n;
			if(point_de_vie<0) {
				point_de_vie=0;
			}
		} else {
			point_de_vie=0;
			vivant=0;
		}	
	}
	void recevoir_soins(int n) {
		if (vivant==1 &&  point_de_vie<1000) {
			point_de_vie+=n;
			if(point_de_vie>=1000) {
				point_de_vie=1000;
			} 
	        } else{
				point_de_vie=0;
				vivant=0;
			}
	}
	}
	

