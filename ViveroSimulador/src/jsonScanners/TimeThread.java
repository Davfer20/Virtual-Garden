package jsonScanners;

import java.util.ArrayList;

import utils.ConstantsEffects;
import viveroVirtualProyecto.Planta;
import viveroVirtualProyecto.StatusManager;

public class TimeThread implements Runnable, ConstantsEffects{
	private int diasSimulacion;
	private int diasActuales;
	private int porcentajeReviso;
	private ArrayList<Planta> gardenTime;
	private Boolean runStatus = false;
	private StatusManager manager;
	
	
	public TimeThread(StatusManager pManager)
	{
		this.manager = pManager;
		this.diasSimulacion = DAYS_IN_YEARS;
		this.porcentajeReviso = 5;
		this.diasActuales = 0;
	}
	

	
	public void setRunStaus(boolean pStatus)
	{
		this.runStatus = pStatus;
		
	}
	public boolean getRunStaus()
	{
		return runStatus;
		
	}

	
	public void run() { 
		//Solo empieza a correr cuando tenga una planta 
		setRunStaus(true);
		gardenTime = manager.accesGarden(); //Puede borrarse
		int indexTread = 1; 		
		try {
			while (indexTread != CHECKIN_TIME) //Se puede hacer con una bandera
			{

			System.out.println("Dias: "+diasActuales);
			manager.update(diasActuales);
			//manager.updateTemperature(diasActuales);
			//manager.updateAbono(0);
			//manager.updateWater(0);
			//manager.evaluatePlant(0);
			//manager.updateEtapaPlanta(0);
			//manager.updateDaysOfPlant(0);
			diasActuales = diasActuales+TASA_REVISO;				
			Thread.sleep(200);
			indexTread ++;							
			}
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	
}
