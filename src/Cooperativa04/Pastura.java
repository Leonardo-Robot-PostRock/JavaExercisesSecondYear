package Cooperativa04;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 06-May-2024 1:04:52 AM
 */
public class Pastura implements Cultivo {

	private String nombre;
	protected List<Mineral> requerimientoDeMinerales;

	public Pastura() {

	}

	/**
	 * 
	 * @param nombre
	 */
	public Pastura(String nombre, List<Mineral> requerimientoDeMinerales) {
		this.nombre = nombre;
		this.requerimientoDeMinerales = requerimientoDeMinerales;
	}

	/**
	 * 
	 * @param lote
	 */
	@Override
	public boolean puedeSembrar(Lote lote) {
		if (lote.estaSembradoConPastura()) {
			return false;
		}

		for (Mineral mineral : requerimientoDeMinerales) {
			if (!lote.getMineral().contains(mineral)) {
				return false;
			}
		}

		return true;
	}

	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNombre(String newVal) {
		nombre = newVal;
	}

}