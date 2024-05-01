package Pais02;

/**
 * @author mrRobot
 * @version 1.0
 * @created 29-Apr-2024 3:39:12 PM
 */
public class Ciudad {
	private String nombre;


	public Ciudad(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNombre(String newVal){
		nombre = newVal;
	}

}