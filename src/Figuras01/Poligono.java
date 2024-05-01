package Figuras01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 28-Apr-2024 5:26:50 PM
 */
public class Poligono extends Figura {
	protected List<Double> lados;

	public Poligono() {
		this.lados = new ArrayList<>();
	}

	public List<Double> getLados() {
		return lados;
	}

	public void setLados(List<Lado> lados) {
		for (Lado lado : lados) {
			this.lados.add(lado.calcularLongitudEntre2Puntos());
		}
	}

}