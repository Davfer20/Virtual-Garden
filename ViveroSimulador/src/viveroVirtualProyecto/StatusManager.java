package viveroVirtualProyecto;

import viveroVirtualProyecto.Planta;
import uiModel.GardenMainFrame;
import simulation.SimulatorReport;
import utils.ConstantsEffects;
import utils.IObserver;
import utils.Observable;
import jsonScanners.PlantTypeRead;
import jsonScanners.ScanerPlant;
import jsonScanners.SeasonScanner;
import jsonScanners.SeasonTypeRead;
import java.util.ArrayList;
import jsonScanners.TimeThread;
import java.util.Random;

public class StatusManager implements ConstantsEffects{
	private ArrayList<Planta> garden;
	private ArrayList<PlantTypeRead> listPlants;
	private SeasonScanner seasonScaner;
	private ArrayList<SeasonTypeRead> season;
	private SeasonTypeRead currentSeason;
	private ScanerPlant scanner;
	private TimeThread time;
	private SimulatorReport dataReport;
	
	public StatusManager () //Constructor con datos nesesarios
	{		
		this.garden = new ArrayList<Planta>();
		this.scanner = new ScanerPlant();
		this.listPlants = scanner.escaneoPlanta();
		this.seasonScaner = new SeasonScanner();
		this.season = seasonScaner.getSeassonRules();
		this.time = new TimeThread(this);
		this.dataReport = new SimulatorReport();
		this.currentSeason = season.get(0);
	}
	
	public void createPlant (int pIndex)//Index de la planta y la crea
	{
		PlantTypeRead plantaJson = listPlants.get(pIndex);
		Planta plant = new Planta(plantaJson);
		garden.add(plant);
		if (time.getRunStaus()!=true)
		{
			time.run();
		}
	}
	
	public void updateTemperature(int days)//Depende de los dias cambia la temp
	{
		days = (days%365);
		updateSeason (days);
		int random_int = (int)Math.floor(Math.random()*(currentSeason.getTempMax()-currentSeason.getTempMin()+1)+currentSeason.getTempMin());
		dataReport.temperature = random_int;
		//System.out.println("Temperatra:" +dataReport.temperature);		
		System.out.println("Dia limite:" +currentSeason.getDiaLimite());	
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
					System.out.println("Correcto");
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
	}
	
	public void removePlant(int pIndex)
	{
		
	}
	
	public void evaluatePlant(int pIndex)
	{
		garden.get(pIndex).evaluate(pIndex);
		
	}


}
