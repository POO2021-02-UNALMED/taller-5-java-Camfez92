package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		setTotalAnimales(getTotalAnimales() + 1);
		listado.add(this);
	}
	
	public static ArrayList<Ave> getListado() {
		return listado;
	}

	@Override
	public String movimiento() {
		return "volar";
	}
	
	static public Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre, edad, "montanas",genero,"cafe glorioso");
	}
	static public Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre, edad, "montanas",genero,"blanco y amarillo");
	}
	
	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public static int getHalcones() {
		return halcones;
	}

	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}

	public static int getAguilas() {
		return aguilas;
	}

	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	static public int cantidadAves() {
		return listado.size();
	}
	
	
	
}
