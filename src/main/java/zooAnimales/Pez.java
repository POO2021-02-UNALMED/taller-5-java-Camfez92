package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	
	//Atributos
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	//Constructores
	
	//Constructor vacio
	
	public Pez() {
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
	}
	
	//Constructor con parametros
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
	}
	
	//Metodos	
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	static public Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre, edad, "oceano",genero,"rojo", 6);
	}
	
	static public Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez(nombre, edad, "oceano",genero,"gris", 6);
	}
	
	static public int cantidadPeces() {
		return listado.size();
	}
	
	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public static int getSalmones() {
		return salmones;
	}

	public static void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}

	public static int getBacalaos() {
		return bacalaos;
	}

	public static void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}
