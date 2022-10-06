package jsonScanners;

import viveroVirtualProyecto.Estado;
import java.util.ArrayList;


public class PlantTypeRead {
	private String NamePlant;
	private ArrayList<Estado> estados;
	
	public PlantTypeRead(){}

	public String getNamePlant() {
		return NamePlant;
	}

	public void setNombre(String namePlant) {
		NamePlant = namePlant;
	}

	public void setEstados(ArrayList<Estado> pEstado) {
		estados = pEstado;
	}	
	
	public ArrayList<Estado> getEstados() {
		return estados;	
	}
	
	public Estado getIndexEstados(int pId)
	{
		return estados.get(pId);
	}
	
	public int getEfectoVidaFromState(int pIndexEstado) {
		return estados.get(pIndexEstado).getVidaEfect();
	}
	
	public int getAbonoFromSate(int pIndexEstado) {
		return estados.get(pIndexEstado).getAbonoEfect();
	}
	
	public int getAguaFromState(int pIndexEstado) {		
		return estados.get(pIndexEstado).getWaterEfect();
	}
	
	public int getMaxAguaFromState(int pIndexEstado) {		
		return estados.get(pIndexEstado).getWaterMax();
	}

	public int getMinAguaFromState(int pIndexEstado) {		
		return estados.get(pIndexEstado).getWaterMin();
	}
	
	public int getAbonoMinFromState(int pIndexEstado) {		
		return estados.get(pIndexEstado).getAbonoMin();
	}
	
	public int getAbonoMaxFromState(int pIndexEstado) {		
		return estados.get(pIndexEstado).getAbonoMax();
	}
	
	public int getDiasLimFromState(int pIndexEstado) {		
		return estados.get(pIndexEstado).getDias();
	}
	
	public int getMinLifeFromState(int pIndexEstado) {		
		return estados.get(pIndexEstado).getMinLife();
	}
	
	public int getMaxLifeFromState(int pIndexEstado) {		
		return estados.get(pIndexEstado).getMaxLife();
	}	
}
