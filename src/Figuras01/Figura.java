package Figuras01;

import java.util.List;

/**
 * @param <E>
 * @author mrRobot
 * @version 1.0
 * @updated 01-May-2024 3:30:43 AM
 */
public class Figura {
	private List<Poligono> m_Poligono;
	private List<Elipse> m_Elipse;
	private List<Triangulo> m_Triangulo;
	private List<Cuadrilatero> m_Cuadrilatero;
	
	public Figura(List<Poligono> m_Poligono, List<Elipse> m_Elipse, List<Triangulo> m_Triangulo,
			List<Cuadrilatero> m_Cuadrilatero) {
		super();
		this.m_Poligono = m_Poligono;
		this.m_Elipse = m_Elipse;
		this.m_Triangulo = m_Triangulo;
		this.m_Cuadrilatero = m_Cuadrilatero;
	}

	public List<Poligono> getM_Poligono() {
		return m_Poligono;
	}

	public void setM_Poligono(Poligono m_Poligono) {
		this.m_Poligono.add(m_Poligono);
	}

	public List<Elipse> getM_Elipse() {
		return m_Elipse;
	}

	public void setM_Elipse(Elipse m_Elipse) {
		this.m_Elipse.add(m_Elipse);
	}

	public List<Triangulo> getM_Triangulo() {
		return m_Triangulo;
	}

	public void setM_Triangulo(List<Triangulo> m_Triangulo) {
		this.m_Triangulo = m_Triangulo;
	}

	public List<Cuadrilatero> getM_Cuadrilatero() {
		return m_Cuadrilatero;
	}

	public void setM_Cuadrilatero(List<Cuadrilatero> m_Cuadrilatero) {
		this.m_Cuadrilatero = m_Cuadrilatero;
	}
	
}