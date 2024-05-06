package Cooperativa04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mrRobot
 * @version 1.0
 * @created 06-May-2024 1:04:50 AM
 */
public class Lote {
	private String tipo;
	private boolean estaSembradoConPastura;
	public List<Mineral> m_Mineral;
	public List<Mineral> mineralPrimario;
	public List<Mineral> mineralSecundario;

	public Lote() {

	}

	/**
	 * 
	 * @param mineral
	 * @param estaSembradoConPastura
	 */
	public Lote(List<Mineral> minerales, boolean estaSembradoConPastura) {
		this.m_Mineral = minerales;
		this.estaSembradoConPastura = estaSembradoConPastura;
		this.mineralPrimario = new ArrayList<Mineral>();
		this.mineralSecundario = new ArrayList<Mineral>();
	}

	public void clasificarLote() {
		int contadorMineralPrimario = 0;
		int contadorMineralSecundario = 0;

		if (m_Mineral.isEmpty()) {
			this.tipo = "Comun";
			return;
		}

		for (Mineral mineral : m_Mineral) {
			if (mineral.getTipoDeMineral().contains("primario")) {
				this.mineralPrimario.add(mineral);
				contadorMineralPrimario++;
			}

			if (mineral.getTipoDeMineral().contains("secundario")) {
				this.mineralSecundario.add(mineral);
				contadorMineralSecundario++;
			}

			if (contadorMineralPrimario > contadorMineralSecundario) {
				this.tipo = "Especial";
			} else {
				this.tipo = "Comun";
			}

		}
	}

	public String getTipo() {
		return this.tipo;
	}

	public boolean estaSembradoConPastura() {
		return estaSembradoConPastura;
	}

	public void setEstaSembradoConPastura(boolean estaSembradoConPastura) {
		this.estaSembradoConPastura = estaSembradoConPastura;
	}

	public List<Mineral> getMineral() {
		return this.m_Mineral;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setMineral(List<Mineral> mineral) {
		this.m_Mineral = mineral;
	}

}