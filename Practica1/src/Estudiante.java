

import java.io.Serializable;

public class Estudiante extends Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5484708416456237025L;

	public Estudiante(Materia[] materias, String nombre, char sexo, 
			int edad, int faltas,String TarjetaDeIdentidad) {
		super(materias, nombre, sexo, edad, faltas,TarjetaDeIdentidad);
		// TODO Auto-generated constructor stub
	}

	public Estudiante() {
		
	}




}

