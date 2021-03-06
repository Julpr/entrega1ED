
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

public class Fichero implements Serializable {

	private static final long serialVersionUID = -9126610298850162622L;
	protected String contrasena;
	Estudiante[] e6 = new Estudiante[0];
	Profesor[] p = new Profesor[0];
	Administracion[] a = new Administracion[0];
	Aula[] t = new Aula[0];
	Grupo[] g = new Grupo[0];


	public String getContraseña() {
		return contrasena;
	}

	public void setContraseña(String contraseña) {
		this.contrasena = contraseña;
	}


	public void main(String[] args) throws IOException, Excepciones {

		Materia m = new Materia("calculo", 2, true, 2, true, new double[] { 2, 4, 3, 5 });
		Estudiante e = new Estudiante("j",new Materia[] { m }, "Felipe", 'M', 12, 2, "123");
		Estudiante e2 = new Estudiante("a",new Materia[] { m }, "Carla", 'F', 23, 2, "98070163128");
		Estudiante[] e3 = { e, e2 };
		Profesor p = new Profesor("m",new Materia[] { m }, "Raul", 'M', 34, 1, "1017261973");
		Profesor p2 = new Profesor("k",new Materia[] { m }, "Raul", 'M', 34, 1, "1017261973");
		Profesor[] p6 = { p, p2 };
		Grupo g = new Grupo(12, p, m, 34);
		Aula z = new Aula(12, new Materia[] { m }, 4, "Palmas", new Grupo[] { g }, true);
		Administracion a = new Administracion("1","s",new Profesor[] { p }, new Aula[] { z }, e3, new Grupo[] { g });
		Administracion a2 = new Administracion("2","m",new Profesor[] { p }, new Aula[] { z }, e3, new Grupo[] { g });
		Administracion[] a9 = { a, a2 };
		Fichero us= new Fichero();
		crearFicheroObjetoAdministrador(a9);
		crearFicheroObjetoProfesor(p6);
		crearFicheroObjetoEstudiante(e3);
		crearObjetoDesdeElFicheroProfesor("Profesores");
		crearObjetoDesdeElFicheroAdministracion("Administracion");
		crearObjetoDesdeElFicheroEstudiante("Estudiantes");
		System.out.println(us.crearOnjetoDesdeElFicheroProfesor("Profesores", "1017261973"));
		System.out.println(us.crearOnjetoDesdeElFicheroEstudiante("Estudiantes", "123"));
		System.out.println(us.crearOnjetoDesdeElFicheroAdministracion("Administracion", "1"));
		// File f = new File("C:\\Users\\dcr7j\\eclipse-workspace\\Universidad\\" +
		// "98070162128"+".dat");
		// u.leerArchivo(f);

	}
	
	public String crearOnjetoDesdeElFicheroEstudiante(String Estudiantes,String cedula) throws Excepciones {

		try {
			ObjectInputStream traerObjeto = new ObjectInputStream(new FileInputStream("./"+Estudiantes+".obj"));
			Estudiante[] estudianteObjeto =  (Estudiante[])traerObjeto.readObject();
			traerObjeto.close();
			int i = 0;
			while (i<estudianteObjeto.length&&estudianteObjeto[i].getCedula().compareTo(cedula)!=0) {
				i++;

			}if (i==estudianteObjeto.length) {
				return "No existe Estudiante con esa ceula";
			}else {
				e6 = Arrays.copyOf(e6, e6.length+1);
				e6[e6.length-1] = estudianteObjeto[i];
				return e6[e6.length-1].getCedula();

			}


		} catch (Exception e) {
			// TODO: handle exception
		}
		throw new Excepciones("No se encontro el Estudiante");

	}

	public String crearOnjetoDesdeElFicheroProfesor(String Profesores,String cedula) throws Excepciones {

		try {
			ObjectInputStream traerObjeto = new ObjectInputStream(new FileInputStream("./"+Profesores+".obj"));
			Profesor[] profesorObjeto =  (Profesor[])traerObjeto.readObject();
			traerObjeto.close();
			int i = 0;
			while (i<profesorObjeto.length&&profesorObjeto[i].getCedula().compareTo(cedula)!=0) {
				i++;

			}if (i==profesorObjeto.length) {
				return "No existe Profesor con esa ceula";
			}else {
				p = Arrays.copyOf(p, p.length+1);
				p[p.length-1] = profesorObjeto[i];
				return p[p.length-1].getCedula();

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		throw new Excepciones("No se encontro el profesor");

	}

	public String crearOnjetoDesdeElFicheroAdministracion(String Administraciones,String cedula) throws Excepciones{

		try {
			ObjectInputStream traerObjeto = new ObjectInputStream(new FileInputStream("./"+Administraciones+".obj"));
			Administracion[] administracionObjeto =  (Administracion[])traerObjeto.readObject();
			traerObjeto.close();
			int i = 0;
			while (i<administracionObjeto.length&&administracionObjeto[i].getCedula().compareTo(cedula)!=0) {
				i++;

			}if (i==administracionObjeto.length) {
				return "No existe Administrador con esa ceula";
			}else {
				a = Arrays.copyOf(a, a.length+1);
				a[a.length-1] = administracionObjeto[i];
				return a[a.length-1].getCedula();

			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		throw new Excepciones("No se encontro el Administrador");



	}

	public void crearFicheroObjetoEstudiante(Estudiante[] e11)  {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("Practica1/src/Usuarios/"+"Estudiantes"+".obj");
			ObjectOutputStream estudiante = new ObjectOutputStream(fichero);
			estudiante.writeObject(e11);
			fichero.close();

		} catch (Exception e) {

		}


	}

	public void crearFicheroObjetoProfesor(Profesor[] p)  {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("Practica1/src/Usuarios/"+"Profesores"+".obj");
			ObjectOutputStream profesor = new ObjectOutputStream(fichero);
			profesor.writeObject(p);
			fichero.close();

		} catch (Exception e) {

		}


	}

	public void crearFicheroObjetoAdministrador(Administracion[] a1)  {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("Practica1/src/Usuarios/"+"Administracion"+".obj");
			ObjectOutputStream administrador = new ObjectOutputStream(fichero);
			administrador.writeObject(a1);
			fichero.close();

		} catch (Exception e) {

		}


	}




	public void crearObjetoDesdeElFicheroEstudiante(String Estudiantes) {

		try {
			ObjectInputStream traerObjeto = new ObjectInputStream(new FileInputStream("Practica1/src/Usuarios/"+Estudiantes+".obj"));
			Estudiante[] estudianteObjeto =  (Estudiante[])traerObjeto.readObject();
			traerObjeto.close();
			for (Estudiante estudiante : estudianteObjeto) {
				System.out.println(estudiante);
			}


		} catch (Exception e) {
			// TODO: handle exception
		}


	}

	public void crearObjetoDesdeElFicheroProfesor(String Profesores) {

		try {
			ObjectInputStream traerObjeto = new ObjectInputStream(new FileInputStream("Practica1/src/Usuarios/"+Profesores+".obj"));
			Profesor[] profesorObjeto =  (Profesor[])traerObjeto.readObject();
			traerObjeto.close();
			for (Profesor profesor2 : profesorObjeto) {
				System.out.println(profesor2);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}


	}

	public void crearObjetoDesdeElFicheroAdministracion(String Administraciones) {

		try {
			ObjectInputStream traerObjeto = new ObjectInputStream(new FileInputStream("Practica1/src/Usuarios/"+Administraciones+".obj"));
			Administracion[] administracionObjeto =  (Administracion[])traerObjeto.readObject();
			traerObjeto.close();
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
			String lectura = entrada.readLine();
			while (lectura!=null) {
				System.out.println(lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}

	}

	public static boolean verificarMateriaAnual(String materia) throws Excepciones {
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
	
	public void buscarUsuario(String cedula) throws Excepciones{
        int i = 0;
        while (i < e6.length) {
            if (cedula == e6[i].getCedula()) {
                 //e6[i];
            }
        }
        i = 0;
        while (i < p.length) {
        	if(cedula == p[i].getCedula()) {
        		 //p[i];
        	}
        }
        i = 0;
        while(i < a.length) {
        	if(cedula == a[i].getCedula()) {
        		 //a[i];
        	}
        }
        // No se encontro el ID
        // Tira error si no encuentra el ID
        throw new Excepciones("El ID no se encuentra o se digitó mal");
	}
	
	/*public boolean verificarContraseña(String cedula, String contraseña) throws Excepciones {
		if(contraseña.equals(buscarUsuario(cedula).getContraseña())==true) {
			return true;
		} else {
			return false;
		}
	}

	public void iniciarSesion(String cedula, String contraseña) throws Excepciones {
		if(verificarContraseña(cedula, contraseña) == true) {
			//Inicia sesión
		} else {
			throw new Excepciones("El ID o la contraseña no coinciden");
		}
	}
	
	public Materia buscarMateria(String cedula, String nombreMateria) throws Excepciones {
		for(int i = 0; i < ((Persona) buscarUsuario(cedula)).getMaterias().length-1; i++) {
			if(nombreMateria.equals(((Persona) buscarUsuario(cedula)).getMaterias()[i].getNombre()) == true) {
				return ((Persona) buscarUsuario(cedula)).getMaterias()[i];
			}
		}
		throw new Excepciones("No se encontro la materia");
	}*/

}
