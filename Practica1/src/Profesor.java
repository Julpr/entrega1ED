

import java.io.Serializable;

public class Profesor extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4262531568827767469L;

	public Profesor(Materia[] materias, String nombre, char sexo, int edad, int faltas,String cedula) {
		super(materias, nombre, sexo, edad, faltas,cedula);
		// TODO Auto-generated constructor stub
	}
	
	

}

