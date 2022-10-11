package utils;
import utils.IObserver;
import viveroVirtualProyecto.StatusManager;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Observable { //Hace un thread separado para mantener fluidez
	private ArrayList<IObserver> observers;
	private IObserver observer;
	private ExecutorService executorPool;
	private static Observable self; //Para que se vea a el mismo
	
	public Observable() {
		//this observer = new IObserver(this,0);
		self = this;
		observers = new ArrayList<IObserver>();
		executorPool = Executors.newFixedThreadPool(5);
	}
	
	public void addObserver(IObserver pObservable) {
		observers.add(pObservable);
	}
	
	public void removeObserver(IObserver pObservable) {
		observers.remove(pObservable);
	}
	
	public void notifyObservers(Object pValue) {
		int pIndex = 0;
		for(IObserver observer : observers) {
			//observer.update(this, pValue,pIndex);
		}
	}
	
	public void updatePlants ()
	{
		observer.update(self, 0);
	}
	
	public void notify(Object pValue) {//Recibe valor de lo que recibe
		Observable thisInstance = this;
		int pIndex = 0;
		
		for(IObserver observer : observers) {
			
			Runnable task = new Runnable() {
				@Override
				public void run() {
					//observer.update(thisInstance, pValue, pIndex);//Lo que se toma es el runner
				}
			};
			
			executorPool.execute(task);
		}
	}
	
}
