package jsonScanners;

public class TimeThread{
	private float diasSimulacion;
	private float porcentajeReviso;
	private float threadValue = 0.00f;
	
	
	public void TimeThread()
	{
		this.diasSimulacion = 365.00f;
		this.porcentajeReviso = 5.00f;
	}
	
	public void tiempoPrograma () {
		float div = diasSimulacion / porcentajeReviso;
		this.threadValue = div;
	}
	
	public void run () {
		TimeThread();
		tiempoPrograma (); //Se llena el threadValue
		float indexTread = 1.00f; 
		try {
			while (indexTread != threadValue)
			{
				
				System.out.println("Thread Actual: "+ indexTread);
				Thread.sleep(2000);
				indexTread ++;
				
			}
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	
		
		
	}
	
}
