package viveroVirtualProyecto;

import java.io.*;


import jsonScanners.PlantTypeRead;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.json.simple.*;
import org.json.simple.parser.*;

public class scanerPlant {
	
	private ArrayList<PlantTypeRead> listaPlantas;//[[manzano, estado, min etc...]

	public void escaneoPlanta ()
	{
		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader("/Users/Davfer/OneDrive/Documents/TEC 2 Semestre/garden.json"));
			JSONObject jsonObject = (JSONObject)obj;
			
			
			String crecimiento = (String)jsonObject.get("VelocidadCrecimiento");
			String tiempoMin = (String)jsonObject.get("RelacionMinutos");
			
			System.out.println("Se va a scanear la planta");
			System.out.println("Crecimiento: " + crecimiento);
	        System.out.println("Course: " + tiempoMin);
	        
	        
	        JSONArray plantArray=(JSONArray)jsonObject.get("Planta");
	        ArrayList<PlantTypeRead> listPlantas = new ArrayList<PlantTypeRead>();
	        for (int i=0 ; i<plantArray.size();i++)
	        {
	        	
	        	JSONObject address=(JSONObject) plantArray.get(i);	              
	        	String nombrePlanta=(String) address.get("Nombre");      	
	        	System.out.println("Nombre de planta: "+nombrePlanta);	        		
	        	JSONArray nivelArray=(JSONArray)address.get("Niveles");
	        	for (int f=0 ; f<nivelArray.size();f++)
		        {
	        		//ArrayList<PlantTypeRead> plantaList = new ArrayList<PlantTypeRead>();	        
	        		ArrayList<String> stringURL = new ArrayList<String>();

	        		JSONObject niveles=(JSONObject) nivelArray.get(f);
	        		
	        		String estadoPlanta=(String) niveles.get("Estado");        		
	        		String diasCrecer=(String) niveles.get("Dias Crecer");
	        		String minLifeStr=(String)niveles.get("minLife");
	        		String maxLifeStr=(String)niveles.get("maxLife");
	        		String waterMinStr=(String) niveles.get("waterMinReq");
	        		String waterMaxStr=(String) niveles.get("waterMaxReq");
	        		String abonoMinStr=(String) niveles.get("abonoMinReq");
	        		String abonoMaxStr=(String) niveles.get("abonoMaxReq");
	        		String abonoEfectStr=(String) niveles.get("abonoEfect");
	        		String efectoVidaStr=(String) niveles.get("efectoVida");
	        		String efectoAguaStr=(String) niveles.get("AguaEfecto");
	        		String vidaURL =(String) niveles.get("Vida");
	        		String muertURL=(String) niveles.get("Muerta");	        		
	        		String ahogadaURL=(String) niveles.get("Ahogada");
	        		
	        		int estado = Integer.parseInt(estadoPlanta);
	        		int diasPlanta = Integer.parseInt(diasCrecer);
	        		int minLife = Integer.parseInt(minLifeStr);
	        		int maxLife = Integer.parseInt(maxLifeStr);
	        		int waterMin = Integer.parseInt(waterMinStr);
	        		int waterMax = Integer.parseInt(waterMaxStr);
	        		int abonoMin = Integer.parseInt(abonoMinStr);
	        		int abonoMax = Integer.parseInt(abonoMaxStr);
	        		int abonoEfect = Integer.parseInt(abonoEfectStr);
	        		int efectoVida = Integer.parseInt(efectoVidaStr);
	        		int efectoAgua = Integer.parseInt(efectoAguaStr);
	        		
	        		PlantTypeRead tipoPlanta = new PlantTypeRead();
	        		tipoPlanta.setNamePlant(nombrePlanta);
	        		tipoPlanta.setIdPlant(estado);
	        	
	        		stringURL.add(vidaURL);
	        		stringURL.add(muertURL);
	        		stringURL.add(ahogadaURL);
	        		
	        		tipoPlanta.setUrls(stringURL);
	        		
	        		tipoPlanta.setEstadosPlanta(diasPlanta, minLife, maxLife, waterMin, waterMax,
	        				abonoMin, abonoMax, abonoEfect, efectoVida, efectoAgua);
	        			        			        		       
	        		
	        		listPlantas.add(tipoPlanta);
	        		tipoPlanta.ShowInfo();
	        	
		        }
	        		     	
	        }}catch(Exception e) {
		    		e.printStackTrace();
		    }
		
	}	
	public void ListPlants() {	
	}
		 
	}

