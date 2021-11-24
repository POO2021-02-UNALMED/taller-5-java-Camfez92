package gestion;

import zooAnimales.*;
import java.util.ArrayList;

public class Zona {
	
	//Atributos
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	
	//Constructores
	
	//Constructor vacio
	public Zona() {
		zoo = new Zoologico();
		this.zoo.agregarZonas(this);
		
	}
	
	//Constructor con parametros
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo=zoo;
		this.zoo.agregarZonas(this);
	}
	
	//Agregar animal a la lista de animales de la zona
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	//Cantidad de animales de esta zona
	public int cantidadAnimales() {
		return animales.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
}
