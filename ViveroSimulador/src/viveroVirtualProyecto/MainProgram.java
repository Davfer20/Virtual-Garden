package viveroVirtualProyecto;

import uiModel.GardenController;

import uiModel.GardenMainFrame;
import jsonScanners.Season;
import java.util.ArrayList;


import jsonScanners.SeasonScanner;
import jsonScanners.SeasonTypeRead;
import jsonScanners.PlantTypeRead;
import jsonScanners.ScanerPlant;
import viveroVirtualProyecto.Planta;

public class MainProgram {//for (PlantTypeRead planta: plantArray)
	public static void main(String[] args) {	


		StatusManager manager = new StatusManager();
		manager.createPlant(0);
		
		//managerPlant.evaluateState(21);
		
		/*
		SeasonScanner seasonScanner = new SeasonScanner();
		ArrayList<SeasonTypeRead> seasons = seasonScanner.getSeassonRules();
		for (int i=0 ; i<seasons.size();i++){
			Season estacion = new Season(seasons.get(i));
			
			System.out.println(estacion.getEstacion());
			System.out.println(estacion.getDiaLimite());			
		*/	
		//GardenController controller = new GardenController();
		//GardenMainFrame interfaz = new GardenMainFrame(controller);
}}
