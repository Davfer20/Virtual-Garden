package viveroVirtualProyecto;

import viveroVirtualProyecto.Planta;
import uiModel.GardenMainFrame;
import simulation.SimulatorReport;
import utils.ConstantsEffects;
import utils.IObserver;
import utils.Observable;
import jsonScanners.PlantTypeRead;
import java.util.ArrayList;


public class StatusManager implements IObserver, ConstantsEffects{
	private ArrayList<Planta> garden;
	private ArrayList<PlantTypeRead> listPlants;
	
	public StatusManager (ArrayList<PlantTypeRead> pListPlants)
	{
		garden = new ArrayList<Planta>();//No se como meter las plantas
		this.listPlants = pListPlants;
	}
	
	public void evaluateState(int pcurrentDays) //Guarda un nuevo state
	{
		for (int i=0 ; i<listPlants.size();i++){
			int index = 0;
			Planta planta = new Planta(listPlants.get(i));
			while (index != 100)
			{
				if (planta.getIndexEstados(index).getDias() < pcurrentDays )
				{
					index++;										
				}
				else 
				{
					System.out.println(planta.getIndexEstados(index).getDias());	
					break;
				}
			}
		}
	}
	
	public void updateTemperature(int days, int tempeture)
	{

	}
	
	public void updateWater(int days, int agua)
	{
		//Se actualiza el agua
	}
	
	public void updateAbono(int days, int abono)
	{
		//Se actualiza el abono
	}
	public void pruebaDias () {
		
		for (int i=0 ; i<listPlants.size();i++) 
		{
			Planta x = new Planta(listPlants.get(i));
			ArrayList<Estado> estados = x.getEstados();
			System.out.println(x.getNombrePlanta());
			for (int c=0 ; c<estados.size();c++) 
			{
				Estado estado = x.getIndexEstados(c);
				System.out.println(estado.getDias());
			}				
		}
	}
	//Se hace el overRide de update

	@Override
	public void update(Observable pObservable, Object arg) {
		SimulatorReport simRepo = (SimulatorReport)arg;
		if (simRepo.action.compareTo(UPDATE_DAYS)==0) {
			//evaluate(simRepo.days);
		}
		
	}

}
