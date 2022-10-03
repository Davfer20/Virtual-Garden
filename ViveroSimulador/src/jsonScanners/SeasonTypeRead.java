package jsonScanners;

import java.util.ArrayList;

public class SeasonTypeRead {
	private String season;
	private String nomEstacion;
	private int diaLimite;
	private boolean isActive;
	private int tempMin;
	private int tempMax;
	private int precipitacion;
	private int aguaEfecto;
	
	public SeasonTypeRead()
	{}
	public String getNomEstacion() {
		return nomEstacion;
	}
	public int getDiaLimite() {
		return diaLimite;
	}
	public boolean isActive() {
		return isActive;
	}
	public int getTempMin() {
		return tempMin;
	}
	public int getTempMax() {
		return tempMax;
	}
	public int getPrecipitacion() {
		return precipitacion;
	}
	public int getAguaEfecto() {
		return aguaEfecto;
	}
	public void setNomEstacion(String nomEstacion) {
		this.nomEstacion = nomEstacion;
	}
	public void setDiaLimite(int diaLimite) {
		this.diaLimite = diaLimite;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}
	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}
	public void setPrecipitacion(int precipitacion) {
		this.precipitacion = precipitacion;
	}
	public void setAguaEfecto(int aguaEfecto) {
		this.aguaEfecto = aguaEfecto;
	}



}
