package viveroVirtualProyecto;


import simulation.SimulatorReport;
import utils.ConstantsEffects;

import jsonScanners.PlantTypeRead;
import jsonScanners.SeasonScanner;
import jsonScanners.SeasonTypeRead;
import java.util.ArrayList;
import jsonScanners.TimeThread;


public class StatusManager implements ConstantsEffects{
	private ArrayList<Planta> garden;
	private ArrayList<PlantTypeRead> listPlants;
	private SeasonScanner seasonScaner;
	private ArrayList<SeasonTypeRead> season;
	private SeasonTypeRead currentSeason;
	
	private TimeThread time;
	private SimulatorReport dataReport;
	
	public StatusManager (ArrayList<PlantTypeRead> pListPlants) //Constructor con datos nesesarios
	{		
		this.garden = new ArrayList<Planta>();
		this.listPlants = pListPlants; //Antes era pScanner.escaneoPlanta();
		this.seasonScaner = new SeasonScanner();
		this.season = seasonScaner.getSeassonRules();
		this.time = new TimeThread(this);
		this.dataReport = new SimulatorReport();
		this.currentSeason = season.get(0); //Guarda la season inicial
	}
	
	public void createPlant (ArrayList<Integer> pListaEnteros)//Index de la planta y la crea
	{
		 for (int i=0 ; i <= pListaEnteros.size();i++)
		 {
			Planta plant = new Planta(listPlants.get(pListaEnteros.get(i)));
			garden.add(plant);
			System.out.println("GARDENSIZE:" +garden.size());		

		if (time.getRunStaus()!=true)//Comienza el thread hasta que haya una planta
		{
			time.run();
		}
		 }
	}
	public ArrayList <Planta> accesGarden(){
		return this.garden;
	}
	
	public void updateTemperature(int days)//Depende de los dias cambia la temp
	{
		if (days > 364 && currentSeason.getDiaLimite() == 365) {
			setCurrentSeason(0);
		}
		days = days%365;
		updateSeason (days);
		int random_int = (int)Math.floor(Math.random()*(currentSeason.getTempMax()-currentSeason.getTempMin()+1)+currentSeason.getTempMin());
		dataReport.temperature = random_int;
		System.out.println("Temperatura:" +dataReport.temperature);		
		System.out.println("Limite dia estacion:" +currentSeason.getDiaLimite());	
		System.out.println("Estacion Actual:" +currentSeason.getNomEstacion());
	}
		
	public void updateWater(int pIndex) //Se agrega agua a planta con indice de la planta
	{
		garden.get(pIndex).setAgua(1);
		//System.out.println("Agua:" +garden.get(pIndex).getAgua());
		System.out.println("Limte Dias de etapa:" +garden.get(pIndex).getDiasLimFromState(garden.get(pIndex).getEtapaPlanta()));
	}
	
	public void updateAbono(int pIndex)
	{
		garden.get(pIndex).setAbono(1);
		System.out.println("Planta:" +garden.get(pIndex).getNombrePlanta());
		//System.out.println("Abono1 :" +garden.get(pIndex).getAbono());		
	}

	public void setCurrentSeason(int pIndex) //Sirve
	{
		this.currentSeason = season.get(pIndex);
	}
	public void updateSeason (int days) //Error con año
	{	
		if (currentSeason.getDiaLimite()< days)
		{
			int index = 0;
			boolean bandera = false;
			while (bandera == false)
			{
				if (season.get(index).getDiaLimite() <= days);
				{
					index++;
				} 
				if (season.get(index).getDiaLimite() > days)
				{
					bandera = true;
				} 
				if(days >365){
					index = 0;
					bandera = true;	
				}

			}
			setCurrentSeason(index);
		}
	}	
	public void updateEtapaPlanta(int pIndex)
	{
		int size = garden.get(pIndex).getEstados().size();
		int etapaPlanta = garden.get(pIndex).getEtapaPlanta();
		System.out.println("Etapa Planta: "+etapaPlanta);
		if (garden.get(pIndex).getDiasLimFromState(etapaPlanta) < garden.get(pIndex).getDiasVida())
			{
				if (garden.get(pIndex).getEtapaPlanta() == (size-1)){
					System.out.println("Se va a borrar la planta ");
					}
				else {
					garden.get(pIndex).setEtapaPlanta(etapaPlanta+1);
					System.out.println("Se cambio de estado ");
				}
			}	
	}
	
	public void updateDaysOfPlant(int pIndex)
	{
		garden.get(pIndex).updateDiasVida();
		System.out.println("Nombre de Planta: "+garden.get(pIndex).getNombrePlanta());
	}
	
	public void evaluatePlant(int pIndex)
	{
		garden.get(pIndex).evaluate(pIndex);
		
	}
	
	public void update(int pIndex) {
		int f = 0;
	while (f != garden.size())
	{
		System.out.println("UPDATE----------------------------");
		updateDaysOfPlant(f);
		updateWater(f);
		updateAbono(f);
		updateEtapaPlanta(f);
		f++;
		}
	updateSeason (pIndex);
	}


}
