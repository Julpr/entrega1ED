

import java.io.Serializable;

public class Aula implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4480117366180859733L;
	private int id;
	private Materia[] materias;
	private int limiteDeGrupo;
	private String sede;
	private Grupo[] grupo;
	private boolean disponible;
	
	public Aula(int id, Materia[] materias, int limiteDeGrupo, String sede, Grupo[] grupo, boolean disponible) {
		super();
		this.id = id;
		this.materias = materias;
		this.limiteDeGrupo = limiteDeGrupo;
		this.sede = sede;
		this.grupo = grupo;
		this.disponible = disponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Materia[] getMaterias() {
		return materias;
	}

	public void setMaterias(Materia[] materias) {
		this.materias = materias;
	}

	public int getLimiteDeGrupo() {
		return limiteDeGrupo;
	}

	public void setLimiteDeGrupo(int limiteDeGrupo) {
		this.limiteDeGrupo = limiteDeGrupo;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public Grupo[] getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo[] grupo) {
		this.grupo = grupo;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	
	
}

