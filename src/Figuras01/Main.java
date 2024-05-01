package Figuras01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Punto punto1 = new Punto(1, 5);
		Punto punto2 = new Punto(2, 5);
		Punto punto3 = new Punto(-10, 5);

		Lado lado = new Lado(punto1, punto2);
		Lado lado2 = new Lado(punto1, punto3);
		Lado lado3 = new Lado(punto2, punto3);
		
		List<Lado> lados = new ArrayList<Lado>();

		lados.add(lado);
		lados.add(lado2);
		lados.add(lado3);
		
		Triangulo triangulo = new Triangulo(lados);
		
		double perimetro = triangulo.calcularPerimetro();
		double area = triangulo.calcularArea();
		
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
	}

}
