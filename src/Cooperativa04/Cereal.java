package Cooperativa04;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 06-May-2024 1:04:47 AM
 */
public abstract class Cereal implements Cultivo {

	protected String nombre;
	protected List<Mineral> requerimientoDeMinerales;

	/**
	 * 
	 * @param nombre
	 */
	public Cereal(String nombre, List<Mineral> requerimientoDeMinerales) {
		this.nombre = nombre;
		this.requerimientoDeMinerales = requerimientoDeMinerales;
	}

	@Override
	public boolean puedeSembrar(Lote lote) {
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

	public List<Mineral> getRequerimientoDeMinerales() {
		return requerimientoDeMinerales;
	}

	public void setRequerimientoDeMinerales(List<Mineral> requerimientoDeMinerales) {
		this.requerimientoDeMinerales = requerimientoDeMinerales;
	}

}