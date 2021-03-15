

import java.io.BufferedReader;
import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public abstract class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9126610298850162622L;
	protected int id;
	protected String contrasena;
	Estudiante[] e = new Estudiante[0];
	Profesor[] p = new Profesor[0];
	Administracion[] a =  new Administracion[0];
	Aula[] t = new Aula[0];
	Grupo[] g = new Grupo[0];

	public static void main(String[] args) throws IOException {

		Materia m = new Materia("calculo",2, true, 2, true, new double[] {2,4,3,5});
		Estudiante e = new Estudiante(new Materia[] {m}, "Felipe", 'M', 12, 2, "123");
		Estudiante e2 = new Estudiante(new Materia[] {m}, "Carla", 'F', 23, 2, "98070163128");
		Estudiante[] e3 = {e,e2};
		Profesor p = new Profesor(new Materia[] {m}, "Raul", 'M', 34, 1, "1017261973");
		Profesor p2 = new Profesor(new Materia[] {m}, "Raul", 'M', 34, 1, "1017261973");
		Profesor[] p6 = {p,p2};
		Grupo g = new Grupo(12, p, m, 34);
		Aula z = new Aula(12, new Materia[] {m}, 4, "Palmas", new Grupo[] {g}, true);
		Administracion a = new Administracion(new Profesor[] {p}, new Aula[] {z}, e3, new Grupo[] {g});
		Administracion a2 = new Administracion(new Profesor[] {p}, new Aula[] {z}, e3, new Grupo[] {g});
		Administracion[] a9 = {a,a2};
		crearFicheroObjetoAdministrador(a9);
		crearFicheroObjetoProfesor(p6);
		crearFicheroObjetoEstudiante(e3);
		crearOnjetoDesdeElFicheroProfesor("Profesores");
		crearOnjetoDesdeElFicheroAdministracion("Administracion");
		crearOnjetoDesdeElFicheroEstudiante("Estudiantes");
		//File f = new File("C:\\Users\\dcr7j\\eclipse-workspace\\Universidad\\" + "98070162128"+".dat");
		//u.leerArchivo(f);

	}



	public static  void crearFicheroObjetoEstudiante(Estudiante[] e11)  {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("src/Universidad_prueba/Usuarios/"+"Estudiantes"+".obj");
			ObjectOutputStream estudiante = new ObjectOutputStream(fichero);
			estudiante.writeObject(e11);
			fichero.close();

		} catch (Exception e) {

		}


	}

	public static  void crearFicheroObjetoProfesor(Profesor[] p)  {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("src/Universidad_prueba/Usuarios/"+"Profesores"+".obj");
			ObjectOutputStream profesor = new ObjectOutputStream(fichero);
			profesor.writeObject(p);
			fichero.close();

		} catch (Exception e) {

		}


	}

	public static  void crearFicheroObjetoAdministrador(Administracion[] a1)  {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("src/Universidad_prueba/Usuarios/"+"Administracion"+".obj");
			ObjectOutputStream administrador = new ObjectOutputStream(fichero);
			administrador.writeObject(a1);
			fichero.close();

		} catch (Exception e) {

		}


	}




	public static  void crearOnjetoDesdeElFicheroEstudiante(String Estudiantes) {

		try {
			ObjectInputStream tarerObjeto = new ObjectInputStream(new FileInputStream("src/Universidad_prueba/Usuarios/"+Estudiantes+".obj"));
			Estudiante[] estudianteObjeto =  (Estudiante[])tarerObjeto.readObject();
			tarerObjeto.close();
			for (Estudiante estudiante : estudianteObjeto) {
				System.out.println(estudiante);
			}


		} catch (Exception e) {
			// TODO: handle exception
		}


	}

	public static  void crearOnjetoDesdeElFicheroProfesor(String Profesores) {

		try {
			ObjectInputStream tarerObjeto = new ObjectInputStream(new FileInputStream("src/Universidad_prueba/Usuarios/"+Profesores+".obj"));
			Profesor[] profesorObjeto =  (Profesor[])tarerObjeto.readObject();
			tarerObjeto.close();
			for (Profesor profesor2 : profesorObjeto) {
				System.out.println(profesor2);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}


	}

	public static void crearOnjetoDesdeElFicheroAdministracion(String Administraciones) {

		try {
			ObjectInputStream tarerObjeto = new ObjectInputStream(new FileInputStream("src/Universidad_prueba/Usuarios/"+Administraciones+".obj"));
			Administracion[] administracionObjeto =  (Administracion[])tarerObjeto.readObject();
			tarerObjeto.close();
			for (Administracion administracion2 : administracionObjeto) {
				System.out.println(administracion2);
			}


		} catch (Exception e) {
			// TODO: handle exception
		}


	}

	public void leerArchivo(File f) throws IOException {


		try {
			BufferedReader entrada = new BufferedReader(new FileReader(f));
			String lextura = entrada.readLine();
			while (lextura!=null) {
				System.out.println(lextura);
				lextura = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}

	}

	public static boolean verificarMateriaAnual(String materia) throws Excepciones{
		switch (materia) {
		case "Calculo":
			return false;
		case "Fisica":
			return false;
		case "Probabilidad":
			return false;
		case "Estructuras de datos":
			return true;
		case "Sistemas discretos":
			return true;
			default:
				throw new Excepciones("La materia no está disponible");
		}
	}











}

