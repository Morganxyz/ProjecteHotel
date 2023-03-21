
public class Hotel {
	
	private String nom;
	private int numHab;
	private int numPlantes;
	private int superficie;
	
	public Hotel(String nom,int numHab, int numPlantes,int superficie) {
		this.nom = nom;
		this.numHab = numHab;
		this.numPlantes = numPlantes;
		this.superficie = superficie;
		
	}
	
	public String getNom() {
		return this.nom;
	}
	public int getNumHab(){
		return this.numHab;
	}
	
	public int getNumPlantes() {
		return this.numPlantes;
	}
	public int getSuperfie() {
		return this.superficie;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}
	public void setNumPlantes(int numPlantes) {
		this.numPlantes = numPlantes;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	
	//Aquest mètode ha de tenir en compte que cada persona del servei pot atendre 20 habitacions
	//i haurà de mostrar quantes persones són necessàries per atendre el servei d’habitacions de l’hotel 
	//i quin és el cost total destinat 
	//al servei sabent que aquestes persones cobren 1.500 € al mes.
	
	public String calcularManteniment() {
		
		int costPers = 1500;
		int costMant = -1;
		int pers = -1;
					
		if(this.numHab <= 20) {
			costMant = costPers;
			pers = 1;
			
		}else if (this.numHab > 20 && this.numHab % 20 == 0){
			pers = Math.round(this.numHab/20);
			costMant = pers * costPers;
			
		}else if(this.numHab > 20 && this.numHab % 20 != 0){
			pers = Math.round(this.numHab/20) +1;
			costMant = pers * costPers;
		}
			
		return (costMant) + " Euros, i " + (pers) + " persones.";
	}

	public String toString() {
		return "L´hotel " + this.nom + " té " + this.numHab + " habitacions totals, " + this.numPlantes +
				" plantes totals " + " i compte amb una superficie total de " + this.superficie + " m2." +
				"Té un cost de manteniment i la quantitat de personal necessari és, respectivament, de " + 
				this.calcularManteniment();
	}

}
