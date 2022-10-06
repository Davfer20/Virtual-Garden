package viveroVirtualProyecto;

import jsonScanners.PlantTypeRead;

public class Planta extends PlantTypeRead{
	private String nombrePlanta;
	private int etapaPlanta;
	private int diasVida;
	private int puntosVida;
	private int abono;
	private int agua;
	
	public Planta (PlantTypeRead plantaActual)
	{
		this.nombrePlanta = plantaActual.getNamePlant(); 	
		this.setEstados(plantaActual.getEstados());
		this.diasVida = 0;
		this.puntosVida = 100;
	}
	
	public String getNombrePlanta() {
		return nombrePlanta;
	}


	public int getEtapaPlanta() {
		return etapaPlanta;
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

	public void setAbono(int pAbono) {
		int abonoRule = this.getAbonoFromSate(etapaPlanta) *pAbono;
		this.abono = (abonoRule+abono);		
	}

	public void setDecreaseLifePoints(int pPuntoVida) {
		int decVida = this.getEfectoVidaFromState(etapaPlanta) *pPuntoVida;
		this.puntosVida = (decVida+puntosVida);		
		System.out.println("TotalPuntosVida:"+puntosVida);
	}

	public void setAgua(int pAgua) {
		int aguaRule = this.getAguaFromState(etapaPlanta) *pAgua;
		this.agua = (aguaRule + agua);
	}

	public void evaluate(int pIndexPlant)
	{
		if (this.getAbonoMaxFromState(etapaPlanta) < abono || this.getAbonoMinFromState(etapaPlanta) > abono)
		{
			setDecreaseLifePoints(1);
		}
		if (this.getMaxAguaFromState(etapaPlanta) < agua || this.getMinAguaFromState(etapaPlanta) > agua)
		{
			setDecreaseLifePoints(1);
		}
		if (this.getDiasLimFromState(etapaPlanta) < diasVida)
		{
			
		}
	}
}
