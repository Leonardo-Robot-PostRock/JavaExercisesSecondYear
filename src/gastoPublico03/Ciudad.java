package gastoPublico03;

/**
 * @author mrRobot
 * @version 1.0
 * @created 30-Apr-2024 5:28:21 PM
 */
public class Ciudad {
	
	private String nombre;
	private int habitantes;
	private double montoRecaudado;
	private double gastoMantenimiento;

	public Ciudad(){

	}

	/**
	 * 
	 * @param nombre
	 * @param impuesto1
	 * @param impuesto2
	 * @param impuesto3
	 * @param impuesto4
	 * @param impuesto5
	 */
	public Ciudad(String nombre, double impuesto1, double impuesto2, double impuesto3, double impuesto4, double impuesto5, double gastoMantenimiento){
		this.nombre = nombre;
		this.montoRecaudado = impuesto1 + impuesto2 + impuesto3 + impuesto4 + impuesto5;
		this.gastoMantenimiento = gastoMantenimiento;
	}

	public boolean tieneMasDeCienMilHabitantes(){
		if(this.habitantes > 100000) {
			return true;
		}
		
		return false;
	}

	/**
	 * 
	 * @param gastoMantenimiento
	 * @param montoRecaudado
	 */
	public double calcularDeficit(){	
		return this.gastoMantenimiento - this.montoRecaudado;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	
	public double getMontoRecaudamiento() {
		return montoRecaudado;
	}

	public double getGastoMantenimiento() {
		return gastoMantenimiento;
	}

}