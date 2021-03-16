

import java.io.Serializable;
import java.util.Arrays;

public abstract class Persona extends Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5559292816179228345L;
	private Materia[] materias = new Materia[0];
	private String nombre;
	private char  sexo;
	private int edad;
	private int faltas;
	private String cedula;
	
	

	@Override
	public String toString() {
		return "Persona [materias=" + Arrays.toString(materias) + ", nombre=" + nombre + ", sexo=" + sexo + ", edad="
				+ edad + ", faltas=" + faltas + ", cedula=" + cedula + "]";
	}

	public Persona(String contraseña, Materia[] materias, String nombre, char sexo, int edad, int faltas,String cedula) {
		super(contraseña);
		this.materias = materias;
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.faltas = faltas;
		this.cedula = cedula;
	}
	
	

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Materia[] getMaterias() {
		return materias;
	}

	public void setMaterias(Materia[] materias) {
		this.materias = materias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public void cambiarContraseña(String cedula, String contraseña, String contraseñaNueva) throws Excepciones {
		if(verificarContraseña(cedula, contraseña) == true) {
			buscarUsuario(cedula).setContraseña(contraseñaNueva);
		} else {
			// Tira error
		}
		
		
	}
	
	public void justificarFalta(String cedula, boolean justificado) throws Excepciones {
		if(justificado = true) {
			((Persona) buscarUsuario(cedula)).setFaltas(getFaltas()-1); 
		}
	}

}

