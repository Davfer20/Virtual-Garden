package jsonScanners;

import viveroVirtualProyecto.StatusManager;

public class TimeThread implements Runnable{
	private int diasSimulacion;
	private int diasActuales;
	private int porcentajeReviso;
	private int threadValue;
	private Boolean runStatus = false;
	private StatusManager manager;
	
	
	public TimeThread(StatusManager pManager)
	{
		this.manager = pManager;
		this.diasSimulacion = 400;
		this.porcentajeReviso = 5;
		this.diasActuales = 0;
	}
	
	public void tiempoPrograma () {
		float div = diasSimulacion / porcentajeReviso;
		int y = Math.round(div);
		this.threadValue = y;
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
		tiempoPrograma (); //Se llena el threadValue
		int indexTread = 1; 		
		try {
			while (indexTread != threadValue) //Se puede hacer con una bandera
			{
				System.out.println("Dias: "+diasActuales);
				manager.updateTemperature(diasActuales);
				manager.updateAbono(0);
				diasActuales = diasActuales+porcentajeReviso;				
				Thread.sleep(2000);
				indexTread ++;
				
			}
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	
}
