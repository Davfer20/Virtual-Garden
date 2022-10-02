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
	

}
