package Pais02;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 29-Apr-2024 3:39:12 PM
 */
public class Continente {

	private String nombre;
	private List<Pais> m_Pais;

	public Continente(String nombre){
		this.nombre = nombre;
	}
	
	public Continente(String nombre, Pais pais){
		this.m_Pais.add(pais);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pais> getM_Pais() {
		return m_Pais;
	}

	public void setM_Pais(List<Pais> m_Pais) {
		this.m_Pais = m_Pais;
	}

}