package gastoPublico03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Pais controlador = new Pais("Argentina");

		// Crear ciudades
		Ciudad ciudad1 = new Ciudad("Luján de Cuyo", 500000, 1000, 2000, 3000, 4000, 5000, 45000);
		Ciudad ciudad2 = new Ciudad("Godoy Cruz", 421000, 22222, 31000, 43000, 50100, 126000, 128000);
		Ciudad ciudad3 = new Ciudad("Maipú", 100000, 3000, 4000, 5000, 6000, 7000, 20000);

		List<Ciudad> ciudades = new ArrayList<Ciudad>();

		ciudades.add(ciudad1);
		ciudades.add(ciudad2);
		ciudades.add(ciudad3);

		for (Ciudad ciudad : ciudades) {
			System.out.println("deficit: " + ciudad.getNombre() + " " + ciudad.calcularDeficit());
		}

		Provincia provincia1 = new Provincia("Mendoza");
		Provincia provincia2 = new Provincia("Buenos Aires");
		Provincia provincia3 = new Provincia("Córdoba");

		provincia1.setCiudades(ciudades);
		
		System.out.println("Ciudades de " + provincia1.getNombre() + " son ");
		for(Ciudad ciudad : provincia1.getCiudades()) {			
			System.out.println(ciudad.getNombre());
		}
		
		List<Provincia> provincias = new ArrayList<Provincia>();
		provincias.add(provincia1);
		provincias.add(provincia2);
		provincias.add(provincia3);

		controlador.setProvincias(provincias);
		controlador.setCiudades(ciudades);

		// Encontrar ciudades con déficit
		List<Ciudad> ciudadesConDeficit = controlador.encotrarCiudadesConDeficit();
		for (Ciudad ciudad : ciudadesConDeficit) {
			System.out.println("\nCiudad con déficit: " + ciudad.getNombre());
		}
	}

}
