package viveroVirtualProyecto;

import jsonScanners.PlantTypeRead;

public class Planta extends PlantTypeRead{
	private String nombrePlanta;
	private int etapaPlanta;
	private int tiempoVida;
	private int abono;
	private int agua;
	
	public Planta (PlantTypeRead plantaActual)
	{
		this.nombrePlanta = plantaActual.getNamePlant(); 	
		this.setEstados(plantaActual.getEstados());
	}
	
	public String getNombrePlanta() {
		return nombrePlanta;
	}


	public int getEtapaPlanta() {
		return etapaPlanta;
	}


	public int getTiempoVida() {
		return tiempoVida;
	}


	public int getAbono() {
		return abono;
	}


	public int getAgua() {
		return agua;
	}


	public void setNombrePlanta(String nombrePlanta) {
		this.nombrePlanta = nombrePlanta;
	}


	public void setEtapaPlanta(int etapaPlanta) {
		this.etapaPlanta = etapaPlanta;
	}


	public void setTiempoVida(int tiempoVida) {
		this.tiempoVida = tiempoVida;
	}


	public void setAbono(int abono) {
		this.abono = abono;
	}


	public void setAgua(int agua) {
		this.agua = agua;
	}

	public void evaluate(int currentDays)
	{
	}
}
