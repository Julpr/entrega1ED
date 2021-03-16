

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Administracion extends Usuario implements Serializable {

	/**
	 * 
	 */
	
	
	
	private static final long serialVersionUID = 7507771529842300606L;
	Profesor[] profesor = new Profesor[0];
	Aula[] aula = new Aula[0];
	Estudiante[] estudiantes = new Estudiante[0];
	Grupo[] grupos = new Grupo[0];
	private String cedula;
	
	public void crearFicheroObjetoAdministrador(Administracion[] a1)  {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("src/Universidad_prueba/Usuarios/"+"Administracion"+".obj");
			ObjectOutputStream administrador = new ObjectOutputStream(fichero);
			administrador.writeObject(a1);
			fichero.close();

		} catch (Exception e) {

		}
	}
	
	public String getCedula() {
		return cedula;
	}


	public Administracion(String cedula, String contraseña, Profesor[] profesor, Aula[] aula, Estudiante[] estudiantes, Grupo[] grupos) {
		super(contraseña);
		this.cedula=cedula;
		this.profesor = profesor;
		this.aula = aula;
		this.estudiantes = estudiantes;
		this.grupos = grupos;
	}

	

	public void crearAlumnos(Materia[] materias, String nombre, char sexo, int edad, int faltas,String cedula) {
		Estudiante e = new Estudiante("h",materias, nombre, sexo, edad, faltas,cedula);
		estudiantes = Arrays.copyOf(estudiantes, estudiantes.length+1);
		estudiantes[estudiantes.length-1] = e;

	}

	public void eliminarAlumnos(String TarjetaDeIdentidad) {
		int i =0;
		while (i<estudiantes.length&&estudiantes[i].getCedula().compareTo(TarjetaDeIdentidad)!=0) {
			i++;
		}if (i==estudiantes.length) {
			System.out.println("No se encontro el estudiante");
		}else {
			estudiantes[i] = estudiantes[estudiantes.length-1] ;
			estudiantes = Arrays.copyOf(estudiantes, estudiantes.length-1);

		}
	}

	
	public void crearProfesor(String contraseña, Materia[] materias, String nombre, char sexo, int edad, int faltas,String cedula) {
		Profesor p = new Profesor(contraseña,materias, nombre, sexo, edad, faltas, cedula);
		profesor = Arrays.copyOf(profesor, profesor.length+1);
		profesor[profesor.length-1] = p;
	}

	public void eliminarProfesor(String cedula) {
		int i = 0;
		while (i<profesor.length&&profesor[i].getCedula().compareTo(cedula)!=0) {
			i++;
		}if (i==profesor.length) {
			System.out.println("No se ecnontro el profesor ");
		}else {
			profesor[i] = profesor[profesor.length-1];
			profesor = Arrays.copyOf(profesor, profesor.length-1);
		}
	}

	public void crearGrupos(int codigo, Profesor profesor, Materia materia, int capacidad) {
		Grupo g = new Grupo(codigo, profesor, materia, capacidad);
		grupos = Arrays.copyOf(grupos, grupos.length+1);
		grupos[grupos.length-1] = g;

	}

	public void eliminarGrupos(int codigo) {
		int i = 0;
		while (i<grupos.length&&grupos[i].getCodigo()==codigo) {
			i++;
		}if (i==grupos.length) {
			System.out.println("No se encontro grupo con ese codigo");
		}else {
			grupos[i] = grupos[grupos.length-1];
			grupos = Arrays.copyOf(grupos, grupos.length-1);
		}
	}

	public void modificarAlumnos(String TarjetaDeIdentidad,String nuevaTarjetaDeIdentidad, String nuevoNombre, int modificarFaltas,int modificarEdad) {
		int i = 0 ;
		while (i<estudiantes.length&&estudiantes[i].getCedula().compareTo(TarjetaDeIdentidad)!=0) {
			i++;
		}if (i== estudiantes.length) {
			System.out.println("No se encontro estudiante para modificar");
		}else {
			estudiantes[i].setCedula(nuevaTarjetaDeIdentidad);
			estudiantes[i].setEdad(modificarEdad);
			estudiantes[i].setFaltas(modificarFaltas);
			estudiantes[i].setNombre(nuevoNombre);



		}
	}

	public void modificarProfesores(String Cedula,String nuevaCedula, String nuevoNombre, int modificarFaltas,int modificarEdad) {
		int i = 0 ;
		while (i<estudiantes.length&&estudiantes[i].getCedula().compareTo(Cedula)!=0) {
			i++;
		}if (i== estudiantes.length) {
			System.out.println("No se encontro Profesor para modificar");
		}else {
			estudiantes[i].setCedula(nuevaCedula);
			estudiantes[i].setEdad(modificarEdad);
			estudiantes[i].setFaltas(modificarFaltas);
			estudiantes[i].setNombre(nuevoNombre);



		}
	}
	

	public void modificarGrupos(int codigo, int codigoNuevo, Profesor profesor,Materia materia,int capacidad) {
		int i = 0 ;
		while (i<grupos.length&& grupos[i].getCodigo()==codigo) {
			i++;
		}if (i== estudiantes.length) {
			System.out.println("No se encontro estudiante para modificar");
		}else {
			grupos[i].setCapacidad(capacidad);
			grupos[i].setCodigo(codigoNuevo);
			grupos[i].setProfesor(profesor);
			grupos[i].setMateria(materia);
		}
	}
	
	public  void verificarExistenciaEstudiantes() {
		for(int i=0;i<estudiantes.length;i++) {
			System.out.println(estudiantes[i].getCedula());
		}
	}
	
}
