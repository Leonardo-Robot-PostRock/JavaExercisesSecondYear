package Figuras01;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 28-Apr-2024 5:26:50 PM
 */
public class Rectangulo extends Cuadrilatero {

	public Rectangulo(List<Lado> lados) {
		super(lados);

		if (lados.size() != 4) {
			throw new IllegalArgumentException("Un rectángulo debe tener exactamente cuatro lados");
		}

		double lado1 = lados.get(0).calcularLongitudEntre2Puntos();
		double lado2 = lados.get(1).calcularLongitudEntre2Puntos();
		double lado3 = lados.get(2).calcularLongitudEntre2Puntos();
		double lado4 = lados.get(3).calcularLongitudEntre2Puntos();

		if (!(lado1 == lado3 && lado2 == lado4) && !(lado1 == lado2 && lado3 == lado4)) {
			throw new IllegalArgumentException("Los lados opuestos de un rectángulo deben tener la misma longitud");
		}
	}

}