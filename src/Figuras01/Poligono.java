package Figuras01;

import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 28-Apr-2024 5:26:50 PM
 */
public class Poligono implements Figura {
	protected List<Lado> lados;

	public List<Lado> getLados() {
		return lados;
	}

	public void setLados(List<Lado> lados) {
		this.lados = lados;
	}


	@Override
	public void agregarLados(List<Lado> lado) {
		// TODO Auto-generated method stub
		
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