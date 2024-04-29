package Figuras01;

import java.util.Iterator;
import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 28-Apr-2024 5:26:50 PM
 */
public class Triangulo extends Poligono {

	private double perimetro;
	private double area;

	public Triangulo(List<Lado> lados) {
		if (lados.size() != 3) {
			throw new IllegalArgumentException("Un triángulo debe tener 3 lados");
		}

		this.lados = lados;
	}

	@Override
	public void agregarLados(List<Lado> lado) {
		this.lados.add((Lado) lado);
	}

	@Override
	public double calcularArea() {
	    double semiperimetro = calcularPerimetro() / 2;
	    double productoSemiperimetro = semiperimetro;
	    
	    for (Lado lado : lados) {
	        double longitud = lado.calcularLongitudEntre2Puntos();
	        productoSemiperimetro *= (semiperimetro - longitud);
	    }

	    this.area = Math.sqrt(productoSemiperimetro);

	    return this.area;
	}


	@Override
	public double calcularPerimetro() {
		for (Lado lado : lados) {
			this.perimetro += lado.calcularLongitudEntre2Puntos();
		}
		return this.perimetro;
	}

}