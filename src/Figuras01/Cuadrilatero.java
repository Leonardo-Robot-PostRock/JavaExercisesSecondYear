package Figuras01;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 28-Apr-2024 5:26:51 PM
 */
public class Cuadrilatero extends Poligono {

	List<Lado> lados;

	public Cuadrilatero(List<Lado> lados) {
		super();
		if (lados.size() != 4) {
			throw new IllegalArgumentException("No es un cuadrilatero");
		}
	}

	@Override
	public void agregarLados(List<Lado> lado) {

	}

	@Override
	public double calcularArea() {
		return 0;
	}

	@Override
	public double calcularPerimetro() {
		return 0;
	}

}