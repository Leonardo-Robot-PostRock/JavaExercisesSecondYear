package Figuras01;

/**
 * @author mrRobot
 * @version 1.0
 * @created 28-Apr-2024 5:26:51 PM
 */
public class Punto {

	private double x;
	private double y;

	public Punto(){

	}

	/**
	 * 
	 * @param y
	 * @param x
	 */
	public Punto(double y, double x){
		this.x = x;
		this.y = y;
	}

	public double getX(){
		return x;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setX(int newVal){
		x = newVal;
	}

	public double getY(){
		return y;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setY(int newVal){
		y = newVal;
	}

}