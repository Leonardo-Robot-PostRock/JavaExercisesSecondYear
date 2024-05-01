package Figuras01;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 28-Apr-2024 5:26:51 PM
 */
public class Cuadrado extends Rectangulo {

	public Cuadrado(List<Lado> lados) {
		super(lados);

		double primerLado = lados.get(0).calcularLongitudEntre2Puntos();
		for (Lado lado : lados) {
			if (lado.calcularLongitudEntre2Puntos() != primerLado) {
				throw new IllegalArgumentException("Los lados de un cuadrado deben ser iguales");
			}
		}
	}

}