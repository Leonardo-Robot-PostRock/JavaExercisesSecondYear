package Pais02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 29-Apr-2024 3:39:12 PM
 */
public class Provincia {

	private String nombre;
	private Capital m_Capital;
	private List<Ciudad> m_Ciudad;
	private List<Provincia> provinciasLimitrofes;
	private List<Pais> paisesLimitrofes;
	private List<Object> limitrofes;

	public Provincia(String nombre, Ciudad ciudad) {
		this.nombre = nombre;
		this.m_Ciudad.add(ciudad);
		this.provinciasLimitrofes = new ArrayList<Provincia>();
		this.limitrofes = new ArrayList<Object>();
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

	
	public List<Provincia> getProvinciasLimitrofes() {
		return provinciasLimitrofes;
	}

	public void setProvinciasLimitrofes(List<Provincia> provinciasLimitrofes) {
		this.provinciasLimitrofes = provinciasLimitrofes;
	}
	
	public List<Pais> getPaisesLimitrofes() {
		return paisesLimitrofes;
	}

	public void setPaisesLimitrofes(Pais pais) {
		this.paisesLimitrofes.add(pais);
	}
	
	public Object getLimitrofes() {
		return limitrofes;
	}

	public void setLimitrofes(Object territorio) {
		this.limitrofes.add(territorio);
	}

}