package gastoPublico03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 30-Apr-2024 5:42:58 PM
 */

public class ControladorGastoRecaudacion {
	List<Provincia> provincias;
	List<Ciudad> ciudades;

	public ControladorGastoRecaudacion() {
		this.provincias = new ArrayList<Provincia>();
	}

	public void agregarProvincia(Provincia provincia) {
		this.provincias.add(provincia);
	}

	public List<Ciudad> encotrarCiudadesConDeficit() {
		List<Ciudad> ciudadesConDeficit = new ArrayList<Ciudad>();

		for (Ciudad ciudad : ciudades) {
			if (ciudad.calcularDeficit() > 0) {
				if (ciudad.tieneMasDeCienMilHabitantes()) {
					ciudadesConDeficit.add(ciudad);
				}
			}
		}

		return ciudadesConDeficit;
	}

	/**
	 * Encuentra las provincias que tienen más de la mitad de las ciudades con
	 * déficit fiscal.
	 *
	 * @return Una lista de provincias que cumplen con el criterio especificado.
	 */

	public List<Provincia> encontrarProvinciasConProblemasDeDeficit() {
		List<Provincia> provinciasConMasDeLaMitad = new ArrayList<Provincia>();

		for (Provincia provincia : provincias) {
			int ciudadesEnDeficit = 0;
			for (Ciudad ciudad : provincia.getCiudades()) {
				if (ciudad.calcularDeficit() > 0) {
					ciudadesEnDeficit++;
				}
			}

			if (ciudadesEnDeficit > provincia.getCiudades().size() / 2) {
				provinciasConMasDeLaMitad.add(provincia);
			}

		}
		return provinciasConMasDeLaMitad;
	}

}