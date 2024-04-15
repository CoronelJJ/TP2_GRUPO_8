package Ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor>{

	private String cargo;
	private int antiguedadDocente;
	
	public Profesor() {
		super();
		this.cargo="Sin cargo";
		this.antiguedadDocente=99;
	}
	
	public Profesor(String NombreEmpleado, int edad, String cargo, int antiguedadDocente) {
		
		super(NombreEmpleado,edad);
		this.cargo=cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	public String toString() {
		return super.toString()+", Cargo:"+cargo+", Antiguedad:" +antiguedadDocente;
	}

	@Override
	public int compareTo(Profesor p) {
		if(p.antiguedadDocente == this.antiguedadDocente)
			return 0;
		
		if (p.antiguedadDocente<this.antiguedadDocente)
		{
			return 1;
		}		
		return -1;
	}
	
	
	
	
}
