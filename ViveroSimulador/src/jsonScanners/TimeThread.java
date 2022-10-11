package jsonScanners;

import java.util.ArrayList;

import utils.ConstantsEffects;
import viveroVirtualProyecto.Planta;
import viveroVirtualProyecto.StatusManager;

public class TimeThread implements Runnable, ConstantsEffects{
	private int diasActuales;
	private Boolean runStatus = false;
	private StatusManager manager;
	
	
	public TimeThread(StatusManager pManager)
	{
		this.manager = pManager;
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
		int indexTread = 1; 		
		try {
			while (indexTread != CHECKIN_TIME) //Se puede hacer con una bandera
			{

			System.out.println("Dias: "+diasActuales);
			manager.update(diasActuales);
			diasActuales = diasActuales+TASA_REVISO;				
			Thread.sleep(2000);
			indexTread ++;							
			}
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	
}
