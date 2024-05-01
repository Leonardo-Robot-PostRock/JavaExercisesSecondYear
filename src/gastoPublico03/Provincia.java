package gastoPublico03;

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
	}


	public List<Ciudad> getCiudades() {
		return ciudades;
	}
	
	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}