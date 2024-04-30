package gastoPublico03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 30-Apr-2024 5:28:21 PM
 */
public class Provincia {

	public List<Ciudad> ciudades;
	private String nombre;
	
	public Provincia(String nombre){
		this.nombre = nombre;
		this.ciudades = new ArrayList<Ciudad>();
	}


	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudad> m_Ciudad) {
		this.ciudades = m_Ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param ciudad
	 */
	public void agregarCiudad(Ciudad ciudad){
		this.ciudades.add(ciudad);
	}

}