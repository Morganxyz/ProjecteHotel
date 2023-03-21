import java.util.ArrayList;
import java.util.Scanner;

public class Ex8_2_Main {
	
	static Scanner entrada = new Scanner(System.in);
	static ArrayList<Hotel>llistaHotels = new ArrayList <Hotel>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcio;
		
		do {
			System.out.println("Introdueix l´opció desitjada: \n1. Crear Hotel\n2. Veure Hotel"
					+ "\n3. Modificar Hotel\n4. Eliminar Hotel\n0. Sortir");
			opcio = entrada.nextInt();
			
				switch(opcio) {
				
					case 1:	crearHotel();
						break;
					case 2: veureHotel();
						break;
					case 3:	modificarHotel();
						break;
					case 4:	eliminarHotel();
						break;
					case 0:
						System.out.println("Vins aviat!");
						System.out.println("");
						break;
					default:
						System.out.println("L´opció introduïda no és vàlida");
						System.out.println("");
				}
		}while (opcio != 0);
		
	}
	
	public static void crearHotel() {
		
		String nom;
		int numHab;
		int numPlantes;
		int superficie;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom de l´ Hotel: ");
		nom = entrada.nextLine();
		System.out.println("Introdueix el nombre total d´habitacions de l´ Hotel: ");
		numHab = entrada.nextInt();
		System.out.println("Introdueix el nombre total de plantes de l´Hotel: ");
		numPlantes = entrada.nextInt();
		System.out.println("Introdueix la superfície total de l´Hotel: ");
		superficie = entrada.nextInt();
		
		Hotel hotel0 = new Hotel(nom,numHab,numPlantes,superficie);
		llistaHotels.add(hotel0);
	}
	
	public static void veureHotel() {
		
		String nom;
		boolean esc = false;
		int posHot = -1;
		int i = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom de l´Hotel a cercar: ");
		nom = entrada.nextLine();
		
		while(i < llistaHotels.size() && !esc) {
			Hotel hotelTrovat = llistaHotels.get(i);
			
			if(nom.equalsIgnoreCase(hotelTrovat.getNom())) {
				posHot = i;
				esc = true;
			}
		i++;
		}
		if(esc) {
			System.out.println(llistaHotels.get(posHot).toString());
			System.out.println("");

		}else {
			System.out.println("L´hotel cercat no s´ha trovat");
			System.out.println("");
		}
	}
	
	public static void modificarHotel() {
		
		String nom;
		String nouNom;
		int nouNumHab;
		int nouNumPlantes;
		int nouSuperficie;
		boolean esc = false;
		int posHot = -1;
		int opcio;
		int i = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom de l´Hotel a cercar: ");
		nom = entrada.nextLine();
		
		while(i < llistaHotels.size() && !esc) {
			Hotel hotelTrovat = llistaHotels.get(i);
			
			if(nom.equalsIgnoreCase(hotelTrovat.getNom())) {
				posHot = i;
				esc = true;
			}
		i++;	
		}
		if(esc) {
			System.out.println(llistaHotels.get(posHot).toString());
			System.out.println("");
			
			do {
				System.out.println("Introdueix l´atribut a modificar: \n1. Nom de l´Hotel"
						+ "\n2. Nombre d´habitacions de l´Hotel"
						+ "\n3. Nombre de plantes de l´Hotel"
						+ "\n4. Superficie de l´hotel"
						+ "\n0. Tornar al menú incial");
				opcio = entrada.nextInt();
				
				switch(opcio) {
				
					case 1: 
						entrada.nextLine();
						System.out.println("Introdueix la nova denominació de l´Hotel: ");
						nouNom = entrada.nextLine();
						llistaHotels.get(posHot).setNom(nouNom);
						System.out.println("Atribut 'nom' modificat amb èxit");
						break;			
					case 2:
						entrada.nextLine();
						System.out.println("Introdueix el nou nombre d´habitacions de l´Hotel: ");
						nouNumHab = entrada.nextInt();
						llistaHotels.get(posHot).setNumHab(nouNumHab);
						System.out.println("Atribut 'nom' modificat amb èxit");
						break;
					case 3:
						entrada.nextLine();
						System.out.println("Introdueix el nou nombre de plantes de l´Hotel: ");
						nouNumPlantes = entrada.nextInt();
						llistaHotels.get(posHot).setNumPlantes(nouNumPlantes);
						System.out.println("Atribut 'nom' modificat amb èxit");
						break;
					case 4:
						entrada.nextLine();
						System.out.println("Introdueix la nova superfície de l´Hotel: ");
						nouSuperficie = entrada.nextInt();
						llistaHotels.get(posHot).setSuperficie(nouSuperficie);
						System.out.println("Atribut 'nom' modificat amb èxit");
						break;
					case 0:
						entrada.nextLine();
						System.out.println("Tornant al menú inicial");
						System.out.println("");
						break;
					default:
						System.out.println("L´opció introduïda no és vàlida");
						System.out.println("");
				}
			}while(opcio != 0);
		
		}else {
			System.out.println("L´hotel cercat no s´ha trovat");
			System.out.println("");
		}	
	}
	
	public static void eliminarHotel() {
		
		String nom;
		boolean esc = false;
		int posHot = -1;
		int i = 0;
		String resp;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom de l´Hotel a cercar: ");
		nom = entrada.nextLine();
		
		while(i < llistaHotels.size() && !esc) {
			Hotel hotelTrovat = llistaHotels.get(i);
			
			if(nom.equalsIgnoreCase(hotelTrovat.getNom())) {
				posHot = i;
				esc = true;
			}
		i++;
		}
		if(esc) {
			System.out.println(llistaHotels.get(posHot).toString());
			System.out.println("");
			System.out.println("Está segur/a de voler eliminar aquest Hotel? s/n: ");
			resp = entrada.next();
			if(resp.equalsIgnoreCase("s")) {
				llistaHotels.remove(posHot);
				System.out.println("Hotel eliminat amb èxit!");
				System.out.println("");
				
			}else {
				System.out.println("Eliminació avortada");
				System.out.println("");
			}

		}else {
			System.out.println("L´hotel cercat no s´ha trovat");
			System.out.println("");
		}
	}
}
		


