

import java.io.Serializable;

public class Grupo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -823381173248489487L;
	private int codigo;
	private Profesor profesor;
	private Materia materia;
	private int capacidad;

	public Grupo(int codigo, Profesor profesor, Materia materia, int capacidad) {
		super();
		this.codigo = codigo;
		this.profesor = profesor;
		this.materia = materia;
		this.capacidad = capacidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


}
