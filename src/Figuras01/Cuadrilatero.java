package Figuras01;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 28-Apr-2024 5:26:51 PM
 */
public class Cuadrilatero extends Poligono {

	public Cuadrilatero(List<Lado> lados) {
		super();
		if (lados.size() != 4) {
			throw new IllegalArgumentException("No es un cuadrilatero");
		}
	}

	@Override
	public List<Double> getLados() {
		if (lados.size() != 4) {
			throw new IllegalArgumentException("No es un cuadrilatero");
		}
		return super.getLados();
	}

	@Override
	public void setLados(List<Lado> lados) {
		super.setLados(lados);
	}

}