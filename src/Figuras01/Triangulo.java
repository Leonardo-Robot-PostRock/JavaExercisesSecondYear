package Figuras01;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 28-Apr-2024 5:26:50 PM
 */
public class Triangulo extends Poligono {

	public Triangulo() {
		super();
	}

	@Override
	public List<Double> getLados() {
		return super.getLados();
	}

	@Override
	public void setLados(List<Lado> lados) {
		if (lados.size() != 3) {
			throw new IllegalArgumentException("Un triángulo debe tener exactamente tres lados");
		}
		super.setLados(lados);
	}

}