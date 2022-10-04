package uiModel;

import viveroVirtualProyecto.Planta;

public class GardenController {
	private GardenMainFrame controlledFrame;
	private Planta planta;
	
	public GardenController(Planta pPlant)
	{
		this.planta = pPlant;
	}


	public void setWindow(GardenMainFrame pGardenMainFrame) {
		controlledFrame = pGardenMainFrame;	
	}

}
