package jsonScanners;

import java.util.ArrayList;
import viveroVirtualProyecto.EstadoPlanta;

public class PlantTypeRead {
	EstadoPlanta estado;
	private String NamePlant;
	private int IdPlant;
	private ArrayList<?> urls;
	
	public PlantTypeRead()
	{
		this.estado = new EstadoPlanta();
	}

	public String getNamePlant() {
		return NamePlant;
	}

	public Integer getIdPlant() {
		return IdPlant;
	}

	public ArrayList<?> getUrls() {
		return urls;
	}
	

	public void setNamePlant(String namePlant) {
		NamePlant = namePlant;
	}

	public void setIdPlant(Integer idPlant) {
		IdPlant = idPlant;
	}
	
	public void setUrls(ArrayList<?> urls) {
		this.urls = urls;
		estado.setURls(urls);
	}
	public void setEstadosPlanta (int pDias, int pMinLife, int pMaxLife, int pWaterMin, 
			int pWaterMax, int pAbonoMin, int pAbonoMax, int pAbonoEfect, int pVdaEfect,
			int pAguaEfect)
	{
		estado.setDias(pDias);
		estado.setMinLife(pMinLife);
		estado.setMaxLife(pMaxLife);
		estado.setWaterMin(pWaterMin);
		estado.setWaterMax(pWaterMax);
		estado.setAbonoMin(pAbonoMin);
		estado.setAbonoMax(pAbonoMax);
		estado.setAbonoEfect(pAbonoEfect);
		estado.setWaterEfect(pAguaEfect);
		estado.setVidaEfect(pVdaEfect);
	}
	public void ShowInfo ()
	{
		estado.ShowData(); 
	}
	
}
