package gestion;
import java.util.ArrayList;

public class Zoologico {
	
	//Atributos
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	//Constructores
	
	//Constructor vacio
	public Zoologico() {}
	
	//Constructor con parametros
	public Zoologico (String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	
	//Cantidad total de animales en el zoologico
	int cantidadTotalAnimales() {
		int numAnimales=0;
		for(int i=0;i < zonas.size(); i++) {
			numAnimales += zonas.get(i).cantidadAnimales();
		}
	
		return numAnimales;
	}
	
	//Agregar nuevas zonas
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}

	
	//Metodos getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
}
