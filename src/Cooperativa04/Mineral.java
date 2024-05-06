package Cooperativa04;

/**
 * @author mrRobot
 * @version 1.0
 * @created 06-May-2024 1:04:51 AM
 */
public class Mineral {

	private String nombre;
	private String tipoDeMineral;

	public Mineral() {

	}

	/**
	 * 
	 * @param tipoDeMineral
	 * @param nombre
	 */
	public Mineral(String nombre, String tipoDeMineral) {
		this.nombre = nombre;
		verificarTipoDeMineral(tipoDeMineral.toLowerCase());
		this.tipoDeMineral = tipoDeMineral.toLowerCase();
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNombre(String newVal) {
		this.nombre = newVal;
	}

	public String getTipoDeMineral() {
		return this.tipoDeMineral;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTipoDeMineral(String newVal) {
		verificarTipoDeMineral(newVal.toLowerCase());
		tipoDeMineral = newVal.toLowerCase();
	}
	
	private void verificarTipoDeMineral(String tipoDeMineral) {
		if (!tipoDeMineral.equals("primario") || !tipoDeMineral.equals("secundario")) {
			throw new IllegalArgumentException("Los minerales sólo pueden ser de tipo primario o secundario");
		}
	}

}