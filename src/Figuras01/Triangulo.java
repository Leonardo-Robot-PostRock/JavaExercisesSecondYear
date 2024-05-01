package Figuras01;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 28-Apr-2024 5:26:50 PM
 */
public class Triangulo extends Poligono {

	public Triangulo(List<Lado> lados) {
		if (lados.size() != 3) {
			throw new IllegalArgumentException("Un triángulo debe tener 3 lados");
		}

		this.lados = lados;
	}

}