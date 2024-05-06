package Cooperativa04;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 06-May-2024 1:04:53 AM
 */
public class GranosCosechaGruesa extends Cereal {

	public GranosCosechaGruesa(String nombre, List<Mineral> requerimientoDeMinerales) {
		super(nombre, requerimientoDeMinerales);
	}

	@Override
	public boolean puedeSembrar(Lote lote) {
		return super.puedeSembrar(lote);
	}

	@Override
	public String getNombre() {
		return super.getNombre();
	}

	@Override
	public void setNombre(String newVal) {
		super.setNombre(newVal);
	}

	@Override
	public List<Mineral> getRequerimientoDeMinerales() {
		return super.getRequerimientoDeMinerales();
	}

	@Override
	public void setRequerimientoDeMinerales(List<Mineral> requerimientoDeMinerales) {
		super.setRequerimientoDeMinerales(requerimientoDeMinerales);
	}
	
	

}