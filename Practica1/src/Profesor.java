

import java.io.Serializable;

public class Profesor extends Persona implements Serializable{

	private static final long serialVersionUID = -4262531568827767469L;

	private double sueldo;
	private double estudios;
	

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getEsudios() {
		return estudios;
	}

	public void setEsudios(double esudios) {
		this.estudios = esudios;
	}

	public Profesor(int id, String contraseña, Materia[] materias, String nombre, char sexo, int edad, int faltas,String cedula, double sueldo, double estudios) {
		super(id, contraseña, materias, nombre, sexo, edad, faltas,cedula);
		this.sueldo = sueldo;
		this.estudios = estudios;
	}
	
	public void calcularSueldo(int id) throws Excepciones {
		int contador = 0;
		for(int i = 0; i < ((Persona) buscarUsuario(id)).getMaterias().length-1; i++) {
			contador += ((Persona) buscarUsuario(id)).getMaterias()[i].getCreditos();
		}
		setSueldo(contador*((Profesor) buscarUsuario(id)).getEsudios()*100.000);
		//estudios es el procentaje extra segun los titulos
	}

	public void agregarNota(int idEstudiante, double nota, String materia) throws Excepciones {
		buscarUsuario(idEstudiante).buscarMateria(idEstudiante, materia).agregarNota(materia, nota);
	}
	

}

