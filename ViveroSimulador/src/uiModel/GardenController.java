package uiModel;

import java.util.ArrayList;

import jsonScanners.PlantTypeRead;
import jsonScanners.ScanerPlant;
import viveroVirtualProyecto.Planta;
import viveroVirtualProyecto.StatusManager;

public class GardenController{
	private GardenMainFrame controlledFrame;
	private ScanerPlant scanner;
	private ArrayList<PlantTypeRead> listaPlantas;
	private StatusManager manager;
	private Planta planta;

	
	public GardenController()
	{
		this.scanner = new ScanerPlant();
		this.listaPlantas = scanner.escaneoPlanta();
		this.manager = new StatusManager(listaPlantas);//Se inicializa el tiempo al crear planta
		
	}

	public void setWindow(GardenMainFrame pGardenMainFrame) { //Para interfaz
		controlledFrame = pGardenMainFrame;	
	}
	public int sizeArrayJsonPlants ()
	{
		return listaPlantas.size();
	}
	
	public ArrayList<PlantTypeRead> accesPlantType () //Guarda lista del json
	{
		return listaPlantas;
	}
	
	public void crearPlanta(ArrayList<Integer> plistaEnteros) { //crea planta para garden
		manager.createPlant(plistaEnteros);
		//Se le agrega para crear la planta con el boton	
	}
	
	
	public void updateAbono(int pDato)
	{
		manager.updateAbono(pDato);
	}
	
	public void updateWater(int pDato)
	{
		//Update water
	}

}