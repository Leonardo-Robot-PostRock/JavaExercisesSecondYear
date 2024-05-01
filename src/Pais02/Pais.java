package Pais02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 29-Apr-2024 3:39:11 PM
 */
public class Pais {

	private String nombre;
	private List<Provincia> m_Provincia;
	private Continente continente;
	private Capital m_Capital;
	private List<Pais> paisesLimitrofes;

	public Pais(String nombre) {
		this.nombre = nombre;
		this.paisesLimitrofes = new ArrayList<Pais>();
	}

	public Pais(Provincia nombreProvincia, String nombreCapital) {
		this.paisesLimitrofes = new ArrayList<Pais>();
		this.m_Capital = new Capital(nombreCapital);
		this.m_Provincia.add(nombreProvincia);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Capital getM_Capital() {
		return m_Capital;
	}

	public void setM_Capital(Capital m_Capital) {
		this.m_Capital = m_Capital;
	}


	public Continente getContinente() {
		return continente;
	}

	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	public List<Pais> getPaisesLimitrofes() {
		return paisesLimitrofes;
	}

	public void setPaisesLimitrofes(Pais paisesLimitrofes) {
		this.paisesLimitrofes.add(paisesLimitrofes);
	}

}