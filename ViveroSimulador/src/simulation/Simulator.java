package simulation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import utils.ConstantsEffects;
import utils.Observable;
import viveroVirtualProyecto.StatusManager;

public class Simulator extends Observable implements Runnable, ConstantsEffects {
	private LocalTime startedTime;
	private boolean running = false;
	private StatusManager plantManager;
	private int currentRain;
	private int currentTemperature;
	private int dayPass;
	private LocalTime weatherLastUpdate;
	
	public Simulator(StatusManager pManager) {
		this.plantManager = pManager;
	}


	@Override
	public void run() {
		startedTime = LocalTime.now();
		LocalDate currentTime;
		running = true;
		while (running) {
			try {

				//this.plantManager.evaluate(dayPass);				
				System.out.println("Han pasado "+dayPass+" dias");
				
				Thread.sleep(CHECKIN_TIME);
				dayPass = (int)ChronoUnit.MILLIS.between(startedTime, LocalTime.now()) / DAY_IN_MILLIS;
				
				SimulatorReport report = new SimulatorReport();
				report.action = UPDATE_DAYS;
				report.days = dayPass;
				
				this.notifyObservers(report);
				
			} catch (Exception ex) {
				ex.printStackTrace();
		}
	
	}
	}
	public void updateWeather(int pTemp, int pRain) {
		this.currentTemperature = pTemp;
		this.currentRain = pRain;
		this.weatherLastUpdate = LocalTime.now();
		
		SimulatorReport report = new SimulatorReport();
		report.action = UPDATE_WEATHER;
		report.rain = pRain;
		report.temperature = pTemp;
		report.days = dayPass;
		
		this.notifyObservers(report);
	}
}
