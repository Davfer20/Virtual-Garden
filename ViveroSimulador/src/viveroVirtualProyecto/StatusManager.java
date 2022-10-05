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

public class StatusManager implements IObserver, ConstantsEffects{
	private ArrayList<Planta> garden;
	private ArrayList<PlantTypeRead> listPlants;
	private SeasonScanner seasonScaner;
	private ArrayList<SeasonTypeRead> season;
	private SeasonTypeRead currentSeason;
	private ScanerPlant scanner;
	private TimeThread time;
	private SimulatorReport dataReport;
	
	public StatusManager ()
	{		
		
		this.garden = new ArrayList<Planta>();
		this.scanner = new ScanerPlant();
		this.listPlants = scanner.escaneoPlanta();
		this.seasonScaner = new SeasonScanner();
		this.season = seasonScaner.getSeassonRules();
		this.time = new TimeThread(this);
		this.dataReport = new SimulatorReport();
	}
	
	public void createPlant (int pIndex)//Index de la planta
	{
		PlantTypeRead plantaJson = listPlants.get(pIndex);
		Planta plant = new Planta(plantaJson);
		garden.add(plant);
		if (time.getRunStaus()!=true)
		{
			time.run();
		}
	}
	
	public void updateTemperature(int days)
	{
		days = (days%365);
		updateSeason (days);
		int random_int = (int)Math.floor(Math.random()*(currentSeason.getTempMax()-currentSeason.getTempMin()+1)+currentSeason.getTempMin());
		dataReport.temperature = random_int;
		System.out.println("Temperatra:" +dataReport.temperature);		
		System.out.println("Dia limite:" +currentSeason.getDiaLimite());	
	}
		
	
	public void updateWater(int pIndex) //Se agrega agua a planta
	{
		garden.get(pIndex).getAgua();
		int agua = currentSeason.getAguaEfecto();
	}
	
	public void updateAbono(int pIndex)
	{
		//metodo para aumentar abono
		//get abono y despues se le sume lo que se aumenta por click
		int abono = garden.get(pIndex).getAbono();
		garden.get(pIndex).setAbono(abono+1);
		System.out.println("Abono:" +garden.get(pIndex).getAbono());	
		
	}

	public void setCurrentSeason(int pIndex) //Sirve
	{
		this.currentSeason = season.get(pIndex);
	}
	public void updateSeason (int days) //Sirve
	{
		setCurrentSeason(0);
		days = (days%365);
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
				bandera = true;
			}
			setCurrentSeason(index);
		}
	}

	@Override
	public void update(Observable pObservable, Object arg) {
		SimulatorReport simRepo = (SimulatorReport)arg;
		if (simRepo.action.compareTo(UPDATE_DAYS)==0) {
			//evaluate(simRepo.days);
		}
		
	}

}
