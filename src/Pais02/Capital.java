package Pais02;

/**
 * @author mrRobot
 * @version 1.0
 * @created 29-Apr-2024 4:51:45 PM
 */
public class Capital {
	private String nombre;


	public Capital(String nombre){
		this.nombre = nombre;
	}

	public String getnombre(){
		return nombre;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnombre(String newVal){
		nombre = newVal;
	}

}