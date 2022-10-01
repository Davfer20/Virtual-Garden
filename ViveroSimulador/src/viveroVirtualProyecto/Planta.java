package viveroVirtualProyecto;

import jsonScanners.seasonScanner;

public class Planta {
	private String crecimiento;
	private String relacionMinutos;
	private String nombrePlanta;
	private int etapaPlanta;
	private int diasCrecer;
	private int minLife;
	private int maxLife;
	private int waterMin;
	private int waterMax;
	private int abonoMin;
	private int abonoMax;
	private int abonoEfect;
	private int efectoVida;
	private int aguaEfect;
	private String Urlmuerta;
	private String Urlviva;
	private String Urlahogada;
	
	public int getDiasCrecer() {
		return diasCrecer;
	}

	public int getAbonoMin() {
		return abonoMin;
	}

	public int getAbonoMax() {
		return abonoMax;
	}
	
	public int getAbonoEfect() {
		return abonoEfect;
	}

	public int getAguaEfect() {
		return aguaEfect;
	}

	public String getUrlmuerta() {
		return Urlmuerta;
	}

	public String getUrlviva() {
		return Urlviva;
	}

	public String getUrlahogada() {
		return Urlahogada;
	}

	public void setDiasCrecer(int diasCrecer) {
		this.diasCrecer = diasCrecer;
	}

	public void setAbonoMin(int abonoMin) {
		this.abonoMin = abonoMin;
	}

	public void setAbonoMax(int abonoMax) {
		this.abonoMax = abonoMax;
	}

	public void setAguaEfect(int aguaEfect) {
		this.aguaEfect = aguaEfect;
	}

	public void setUrlmuerta(String urlmuerta) {
		Urlmuerta = urlmuerta;
	}

	public void setUrlviva(String urlviva) {
		Urlviva = urlviva;
	}

	public void setUrlahogada(String urlahogada) {
		Urlahogada = urlahogada;
	}
	
	public String getCrecimiento() {
		return crecimiento;
	}

	public String getRelacionMinutos() {
		return relacionMinutos;
	}

	public String getNombrePlanta() {
		return nombrePlanta;
	}

	public int getEtapaPlanta() {
		return etapaPlanta;
	}

	public int getMinLife() {
		return minLife;
	}

	public int getMaxLife() {
		return maxLife;
	}

	public int getWaterMin() {
		return waterMin;
	}

	public int getWaterMax() {
		return waterMax;
	}

	public int getEfectoVida() {
		return efectoVida;
	}

	public String getUrlMuerta() {
		return Urlmuerta;
	}

	public void setNombrePlanta(String pNombre)
	{
		this.nombrePlanta = pNombre;
	}
	
	public void setCrecimiento(String pCrecimiento)
	{
		this.nombrePlanta = pCrecimiento;
	}
	
	public void setRelacionMinutos(String relacionMinutos) {
		this.relacionMinutos = relacionMinutos;
	}

	public void setEtapaPlanta(int etapaPlanta) {
		this.etapaPlanta = etapaPlanta;
	}

	public void setMinLife(int minLife) {
		this.minLife = minLife;
	}

	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}

	public void setWaterMin(int waterMin) {
		this.waterMin = waterMin;
	}

	public void setWaterMax(int waterMax) {
		this.waterMax = waterMax;
	}

	public void setEfectoVida(int efectoVida) {
		this.efectoVida = efectoVida;
	}
	public void setURLmuerta (String pUrl)
	{
		this.Urlmuerta = pUrl;
	}
	
	public void evaluate(int currentDays)
	{
		if(Urlmuerta == Urlviva)
		{
			waterMax +=1;
		}
	}
}
