

import java.io.Serializable;

public class Estudiante extends Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5484708416456237025L;
	private double promedio;

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public Estudiante(int id, String contraseña, Materia[] materias, String nombre, char sexo, int edad, int faltas,String TarjetaDeIdentidad) {
		super(id, contraseña, materias, nombre, sexo, edad, faltas, TarjetaDeIdentidad);
	}

	public Estudiante() {
		
	}

	public double calcularProm(Materia[] materias, int contadorMaterias, int contadorNotas, double prom) {
		if(contadorMaterias > materias.length-1) {
			setPromedio(prom);
			return prom/contadorMaterias-1;
		} else {
			if(contadorNotas > materias[contadorMaterias].getNota().length-1) {
				return calcularProm(materias, contadorMaterias+1, 0, prom);
			} else {
				return materias[contadorMaterias].getNota()[contadorNotas] + calcularProm(materias, contadorMaterias, contadorNotas+1, prom);
			}
		}
	}
	
	public double calcularPromMateria(Materia materia, int contadorNotas, double prom) {
		if(contadorNotas < materia.getNota().length-1) {
			return prom;
		} else {
			return prom + materia.getNota()[contadorNotas];
		}
	}




}

