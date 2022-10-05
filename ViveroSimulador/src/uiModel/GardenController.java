package uiModel;

import viveroVirtualProyecto.Planta;
import viveroVirtualProyecto.StatusManager;

public class GardenController{
	private GardenMainFrame controlledFrame;
	private Planta planta;
	private StatusManager managerPlant;
	
	public GardenController()
	{
		this.managerPlant = new StatusManager();//Se inicializa el tiempo al crear planta
	}

	public void setWindow(GardenMainFrame pGardenMainFrame) {
		controlledFrame = pGardenMainFrame;	
	}
	
	public void crearPlanta(int pDato) {
		managerPlant.createPlant(pDato);
		//Se le agrega para crear la planta con el boton	
	}
	
	public void updateAbono(int pDato)
	{
		managerPlant.updateAbono(pDato);
	}
	//Con los botones estos deben pasar los datos al controler. De la planta ya creada y que le de la imagen
	//Ademas los valores del abono y que se pueden imprimir
	//Se debe trabajar lo de pociciones
	//Obtener el x maximo y el y maximo
	//Se debe tener en cuenta el tamaño de la imagen
	//Donde se crean botones si para arriba, abaoj, izquierda o derecha
}
