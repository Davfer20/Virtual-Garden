package jsonScanners;

import jsonScanners.SeasonTypeRead;
public class Season extends SeasonTypeRead{
	private String estacion;
	private int temperaturaTotal;
	private int precipitacionTotal;
	
	public Season (SeasonTypeRead estacionActual)
	{
		this.setEstacion(estacionActual.getNomEstacion());
		this.setNomEstacion(estacionActual.getNomEstacion());
		this.setDiaLimite(estacionActual.getDiaLimite());
		this.setActive(estacionActual.isActive());
		this.setTempMin(estacionActual.getTempMin());
		this.setTempMax(estacionActual.getTempMax());
		this.setPrecipitacion(estacionActual.getPrecipitacion());
		this.setAguaEfecto(estacionActual.getAguaEfecto());		
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	public int getTemperaturaTotal() {
		return temperaturaTotal;
	}

	public void setTemperaturaTotal(int temperaturaTotal) {
		this.temperaturaTotal = temperaturaTotal;
	}

	public int getPrecipitacionTotal() {
		return precipitacionTotal;
	}

	public void setPrecipitacionTotal(int precipitacionTotal) {
		this.precipitacionTotal = precipitacionTotal;
	}
}
