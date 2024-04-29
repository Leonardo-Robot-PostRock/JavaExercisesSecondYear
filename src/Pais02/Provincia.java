package Pais02;

/**
 * @author mrRobot
 * @version 1.0
 * @created 29-Apr-2024 3:39:12 PM
 */
public class Provincia {

	private String capital;
	public Provincia m_Provincia;
	public Ciudad m_Ciudad;

	public Provincia(){

	}

	public void finalize() throws Throwable {

	}

	public String getcapital(){
		return capital;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcapital(String newVal){
		capital = newVal;
	}

}