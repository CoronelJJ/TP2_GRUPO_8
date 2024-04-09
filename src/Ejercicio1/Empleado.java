package Ejercicio1;

public class Empleado {

	
	//propiedades
	private final int id;
	private String Nombre;
	private int edad;
	private static int contadorIDs=999;
	
	//constructores
	public Empleado(String NombreEmpleado,int edad) {
		contadorIDs++;
		this.id=contadorIDs;
		this.Nombre = NombreEmpleado;
		this.edad = edad;
	}
	
	public Empleado() {
		contadorIDs++;
		this.id=contadorIDs;
		this.Nombre = "Sin nombre";
		this.edad = 99;
	}
	
	//getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		//this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//método ToString()
	public String toString() {
		return "Empleado: "+ Nombre + ", edad:"+ edad +", Legajo:" + id ;
	}
	
	//metodo que devuelve el proximo id a ser generado a
	public static int devuelveProximoID() { 
		return contadorIDs + 1;
	}
}
