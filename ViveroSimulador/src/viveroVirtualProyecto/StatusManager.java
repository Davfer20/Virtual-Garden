package viveroVirtualProyecto;

import java.util.ArrayList;

public class StatusManager {
	private ArrayList<Planta> jardin;
	
	public void evaluate()
	{
		for (Planta currentPlant : jardin)
		{
			currentPlant.evaluate();
		}
	}
}
