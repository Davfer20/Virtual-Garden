package viveroVirtualProyecto;

import viveroVirtualProyecto.Planta;
import java.util.ArrayList;

import jsonScanners.PlantTypeRead;

public class StatusManager {
	private ArrayList<Planta> garden;
	private ArrayList<PlantTypeRead> listPlants;
	
	public StatusManager (ArrayList<PlantTypeRead> pListPlants)
	{
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

}
