package Figuras01;

/**
 * @author mrRobot
 * @version 1.0
 * @created 28-Apr-2024 5:26:52 PM
 */
public class Lado {

	private Punto a;
	private Punto b;

	/**
	 * 
	 * @param b
	 * @param a
	 */
	public Lado(Punto b, Punto a){
		this.a = a;
		this.b = b;
	}

	public Punto getA(){
		return a;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setA(Punto newVal){
		a = newVal;
	}

	public Punto getB(){
		return b;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setB(Punto newVal){
		b = newVal;
	}
	
    public double calcularLongitudEntre2Puntos() {
        double dx = ((b.getX()) - (a.getX()));
        double dy = ((b.getY()) - (a.getY()));
        double result = Math.pow(dx, 2) + Math.pow(dy, 2);
        return Math.sqrt(result);
    }
}