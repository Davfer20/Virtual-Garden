package viveroVirtualProyecto;

import viveroVirtualProyecto.Planta;
import java.util.ArrayList;

public class StatusManager {
	private ArrayList<Planta> garden;
	
	public StatusManager ()
	{
		garden = new ArrayList<Planta>();
		garden.add(new Planta());//Profe le puso un 1
	}
	public void evaluate(int pcurrentDays)
	{
		//Se evaluan los dias
	}
	
	public void updateTemperature(int days, int tempeture)
	{
		//Se actualiza la temperatura
	}
	
	public void updateWater(int days, int agua)
	{
		//Se actualiza el agua
	}
	
	public void updateAbono(int days, int abono)
	{
		//Se actualiza el abono
	}
	
	//Se hace el overRide de update

}
