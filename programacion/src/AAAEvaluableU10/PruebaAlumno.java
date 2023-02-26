package AAAEvaluableU10;

import java.util.Scanner;

public class PruebaAlumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Alumno Luis = new Alumno ("luis", "2ºBach", 6);
		Alumno Pedro = new Alumno ("Pedro", "1ºBach" , 7);
		Alumno Felipe = new Alumno ("Felipe");
		
		
		
		//ALUMNO LUIS		
		System.out.println("Introduce la nueva nota de luis");
		int respuesta = sc.nextInt();
		Luis.Setnuevanotam(respuesta);
		
		System.out.println("Cambiale el nombre a luis :");
		String respuesta2 = sc.nextLine();
		Luis.cambiarnombre(respuesta2);
		
		System.out.println("Cambiale el curso a luis : ");
		String curso = sc.nextLine();
		Luis.cambiarcurso(curso);
		
		//ALUMNO PEDRO
		
		System.out.println("Cambiale el nombre a pedro :");
		String nombre = sc.nextLine();
		Pedro.cambiarnombre(nombre);
		
		System.out.println("Cambiale el curso a pedro :");
		String cursoPedro = sc.nextLine();
		Pedro.cambiarcurso(cursoPedro);		
		
		//ALUMNO FELIPE
		
		System.out.println("Cambiale el nombre a Felipe:");
		String nombreFelipe = sc.nextLine();
		Felipe.cambiarnombre(nombreFelipe);
		
	
		
		System.out.println(Luis.toString());
		System.out.println(Pedro.toString());
		System.out.println(Felipe.toString());
		
				
		
	}
}
