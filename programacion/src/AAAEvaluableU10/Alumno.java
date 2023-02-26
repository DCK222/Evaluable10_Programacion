package AAAEvaluableU10;

import java.util.Arrays;

public class Alumno {
	
	private String nombre;
	private String curso;
	private int[] notas;
	public int asig;
	public int notamedia;
	
	
	public Alumno(String nombre, String curso, int asign) {
		
		this.nombre = nombre;
		this.curso = curso;
		this.notas = new int [asig];
	}

	public Alumno(String nombre, String curso) {
		
		this(nombre, curso, 5);
		this.nombre=nombre;
		this.curso=curso;
		
				
	}

	public Alumno(String nombre) {
		
		this(nombre,  "DAM");
		this.nombre = nombre;
		
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + ", notas=" + Arrays.toString(notas) + ", asig=" + asig
				+ ", notamedia=" + notamedia + "]";
	}

	public void Setnuevanotam(int newnotamedia){
		
		this.notamedia = newnotamedia;
	}
	
	public void cambiarcurso(String newcurso) {
		this.curso=newcurso;
	}
	 
	public void cambiarnota (int[] newnota) {
		 this.notas = newnota;
	 }
	
	public void cambiarnombre (String newnombre) {
		this.nombre = newnombre;
	}
	public void cambiarasig (int newAsign) {
		this.asig = newAsign;
	}
	
	public void cambiarn(int newn) {
		this.notamedia = newn;
	}
	
	
	
	

}
