

import java.io.Serializable;
import java.util.Arrays;

public class Materia implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6606234483613686273L;
	private int creditos;
	private String nombre;
	private boolean anual; //True: Es anual False: Que no es anual
	private int faltas;
	private boolean aprobado;// true es aprobo y false reprobo
	private double[] nota;
	
	
	public Materia(String nombre, int creditos, boolean anual, int faltas, boolean aprobado, double[] nota) {
		this.nombre= nombre;
		this.creditos = creditos;
		this.anual = anual;
		this.faltas = faltas;
		this.aprobado = aprobado;
		this.nota = nota;
	}


	public int getMateria() {
		return creditos;
	}


	public void setMateria(int materia) {
		this.creditos = materia;
	}


	public boolean isAnual() {
		return anual;
	}


	public void setAnual(boolean anual) {
		this.anual = anual;
	}


	public int getFaltas() {
		return faltas;
	}


	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}


	public boolean isAprobado() {
		return aprobado;
	}


	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}


	public double[] getNota() {
		return nota;
	}


	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	public void setNota(int index, double nota) {
		this.nota[index] = nota;
	}
	
	public void asistenciaUniversidad() {
		if (faltas>((int)(creditos*1.5*16)*0.3)+1) {
			 this.aprobado = false;
		}
	}
	
	public double[] agregarNota(String nombreMateria, double nota) throws Excepciones {
		if(nombre.equals(nombreMateria) == true) {
			setNota(Arrays.copyOf(getNota(), getNota().length));
			setNota(getNota().length-1, nota);
			return getNota();
		} else {
			throw new Excepciones("No esta cursando esta materia o se digitó mal");
		}
	}


	public int getCreditos() {
		return creditos;
	}


	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	

}

