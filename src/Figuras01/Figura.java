package Figuras01;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @param <E>
 * @created 28-Apr-2024 5:26:51 PM
 */
public interface Figura {
	
	public void agregarLados(List<Lado> lado);
	
	public double calcularArea();
	
	public double calcularPerimetro();
}