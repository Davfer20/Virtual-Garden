package viveroVirtualProyecto;

import jsonScanners.TimeThread;
import java.io.*;

import java.lang.reflect.Field;
import org.json.simple.*;
import org.json.simple.parser.*;



public class MainGarden {
	public static void main(String[] args) {		
		JSONParser parser = new JSONParser();
		TimeThread adminTread = new TimeThread();
		adminTread.run();
		try {
			
			Object obj = parser.parse(new FileReader("/Users/Davfer/OneDrive/Documents/TEC 2 Semestre/garden.json"));
			JSONObject jsonObject = (JSONObject)obj;
			
			String crecimiento = (String)jsonObject.get("VelocidadCrecimiento");
			String tiempoMin = (String)jsonObject.get("RelacionMinutos");
			
			System.out.println("Crecimiento: " + crecimiento);
	        System.out.println("Course: " + tiempoMin);
	        
	        
	        JSONArray plantArray=(JSONArray)jsonObject.get("Planta");
	        
	        for (int i=0 ; i<plantArray.size();i++)
	        {
	        	
	        	JSONObject address=(JSONObject) plantArray.get(i);
	                
	        	String nombrePlanta=(String) address.get("Nombre");
   		        	
	        	System.out.println("Nombre de planta: "+nombrePlanta);	        	

	        	
	        	JSONArray nivelArray=(JSONArray)address.get("Niveles");
	        	for (int f=0 ; f<nivelArray.size();f++)
		        {
	        		JSONObject niveles=(JSONObject) nivelArray.get(f);
	        		
	        		String estadoPlanta=(String) niveles.get("nombre");        		
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
	        		
	        		System.out.println("EstadoPlanta: "+estadoPlanta);
	        		System.out.println("Dias a crecer: "+diasPlanta);
	        		System.out.println("Min vida: "+minLife);
	        		System.out.println("MaxVida: "+maxLife);
	        		System.out.println("Water Min: "+waterMin);
	        		System.out.println("Water Max: "+waterMax);
	        		System.out.println("AbonoMin: "+abonoMin);
	        		System.out.println("AbonoMax: "+abonoMax);
	        		System.out.println("Abono efecto: "+abonoEfect);
	        		System.out.println("Efecto Vida: "+efectoVida);
	        		System.out.println("Efecto Agua: "+efectoAgua);
	        		System.out.println("URL vida: "+vidaURL);
	        		System.out.println("URL muerta: "+muertURL);
	        		System.out.println("URL ahogad: "+ahogadaURL);     	
		        }
	        }
	       System.out.println("Seasons------------------------------------");
	      	       
	       JSONArray seasonArray=(JSONArray)jsonObject.get("Season");
	       
	       for (int s=0 ; s<seasonArray.size();s++)
	        {
	        	JSONObject seasonAddress=(JSONObject) seasonArray.get(s);
	        	
	        	JSONArray arrayEstaciones = (JSONArray)seasonAddress.get("EstacionActual");
	        	
	        	for (int x=0 ; x<arrayEstaciones.size();x++)
	        		 
		        {
	        		JSONObject seasonType =(JSONObject) arrayEstaciones.get(x);
	        		        		
	        		String estacion=(String) seasonType.get("Nombre Estacion");
	        		String inicioEstacion=(String) seasonType.get("startDate");
	        		String finEstacion=(String) seasonType.get("endDate");
	        		String estacionActiva=(String) seasonType.get("isActive");
	        		String tempMinStr=(String) seasonType.get("Temperatura  Min");
	        		String tempMaxStr=(String) seasonType.get("Temperatura Max");
	        		String precipitacionStr=(String) seasonType.get("Precipitacion");
	        		String aguaEfectoStr=(String) seasonType.get("AguaEfecto");
	        		
	        		int tempMin = Integer.parseInt(tempMinStr);
	        		int tempMax = Integer.parseInt(tempMaxStr);
	        		int precipitacion = Integer.parseInt(precipitacionStr);
	        		int aguaEfecto = Integer.parseInt(aguaEfectoStr);

	        		System.out.println("Estacion: "+estacion);
	        		System.out.println("Unidad: "+inicioEstacion);
	        		System.out.println("Water Min: "+finEstacion);
	        		System.out.println("Water Max: "+estacionActiva);
	        		System.out.println("AbonoMin: "+tempMin);
	        		System.out.println("AbonoMax: "+tempMax);
	        		System.out.println("Abono efecto: "+precipitacion);
	        		System.out.println("Efecto Vida: "+aguaEfecto);
	        		System.out.println("-------------------------------");	        		
		        }
	        }

		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	}

