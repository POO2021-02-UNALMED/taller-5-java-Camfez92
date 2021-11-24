package zooAnimales;

import java.util.ArrayList;
import gestion.*;

public class Animal {
	
	
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<Zona>();
	
	
	
	
	public Animal(){
			
			totalAnimales++;
	}
	
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		totalAnimales++;
	}
	
	
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() +
				"\nAves: " + Ave.cantidadAves() +
				"\nReptiles: " + Reptil.cantidadReptiles() +
				"\nPeces: " + Pez.cantidadPeces() +
				"\nAnfibios: " + Anfibio.cantidadAnfibios();
	}
	
	@Override
	public String toString() {
		
		if(zona.size()==1) {
			
			return "Mi nombre es " + nombre + ", tengo una edad de " + Integer.toString(edad) + 
					", habito en " + habitat +
					" y mi genero es " + genero + ", la zona en la que me ubico es " + zona.get(0).getNombre() + 
					", en el " + zona.get(0).getNombre();
			
		}
		else {
			return "Mi nombre es " + nombre + ", tengo una edad de " + Integer.toString(edad) + 
					", habito en " + habitat +" y mi genero es " + genero;
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String movimiento() {
		return "desplazarse";
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}
	
	
	
	
}
