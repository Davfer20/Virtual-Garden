package viveroVirtualProyecto;

import java.io.*;

import java.lang.reflect.Field;
import org.json.simple.*;
import org.json.simple.parser.*;



public class MainGarden {
	public static void main(String[] args) {		
		JSONParser parser = new JSONParser();
		
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
	        	String edadPlanta=(String) address.get("Edad");   	
	        	String vidaStr = (String) address.get("Vida");
	        	String aguaReqStr=(String) address.get("Puntos Agua");
	        	String solReqStr=(String) address.get("Sol");	        
	        	String fertilizanteStr=(String) address.get("Fertilizante");
	        	String fertilizantReqStr=(String) address.get("Fertilizante Req");
	        	String CrecimientoMaxStr = (String) address.get("Crecimiento Max");
	        	String CrecimientoStr = (String) address.get("Tasa Crecimiento");
	        	String Foto = (String) address.get("Foto");
	        	String Tipo = (String) address.get("Tipo");
	        	

	        	int vida = Integer.parseInt(vidaStr);
	        	int edad = Integer.parseInt(edadPlanta);
	        	int agua = Integer.parseInt(aguaReqStr);
	        	int sol = Integer.parseInt(solReqStr);
	        	int fertilizante = Integer.parseInt(fertilizanteStr);
	        	int fertilizanteReq = Integer.parseInt(fertilizantReqStr);
	        	int crecimientoMax = Integer.parseInt(CrecimientoMaxStr);
	        	int crecimientotasa = Integer.parseInt(CrecimientoStr);
	        
	        		        	
	        	System.out.println("Nombre de planta: "+nombrePlanta);	        	
	        	System.out.println("Edad: "+edadPlanta);
	        	System.out.println("Vida: "+vida);	        	
	        	System.out.println("Agua: "+agua);
	        	System.out.println("Sol "+sol);	        	
	        	System.out.println("Fertilizante Actual: "+fertilizante);
	        	System.out.println("Fertilizante Req: "+fertilizanteReq);	        	
	        	System.out.println("Crecimiento Maximo: "+crecimientoMax);
	        	System.out.println("Crecimiento Actual: "+crecimientotasa);	        	
	        	System.out.println("Foto: "+Foto);
	        	System.out.println("Tipo: "+Tipo);
	        	
	        	JSONArray nivelArray=(JSONArray)address.get("Niveles");
	        	for (int f=0 ; f<nivelArray.size();f++)
		        {
	        		JSONObject niveles=(JSONObject) nivelArray.get(f);
	        		
	        		String numeroStr=(String) niveles.get("Number");
	        		int numero = Integer.parseInt(numeroStr);
	        		
	        		String diasCrecer=(String) niveles.get("Dias Crecer");
	        		int diasPlanta = Integer.parseInt(diasCrecer);
	        		
	        		String vidaURL =(String) niveles.get("Vida");
	        			        		
	        		String muertURL=(String) niveles.get("Muerta");	        		
	        		
	        		String ahogadaURL=(String) niveles.get("Ahogada");
	        		
	        		System.out.println("Numero: "+numero);
	        		System.out.println("Dias para Crecer: "+diasPlanta);
	        		System.out.println("URL vida: "+vidaURL);
	        		System.out.println("URL muerta: "+muertURL);
	        		System.out.println("URL ahogad: "+ahogadaURL);
		        }
	        	
	        	JSONArray estadoArray=(JSONArray)address.get("Estado");
	        	for (int e=0 ; e<estadoArray.size();e++)
	 
		        {
	        		JSONObject estados=(JSONObject) estadoArray.get(e);
	        		        		
	        		String nombreEstado=(String) estados.get("nombre");	        		
	        		String minLifeStr=(String)estados.get("minLife");
	        		String maxLifeStr=(String)estados.get("maxLife");

        	
	        		int minLife = Integer.parseInt(minLifeStr);
	        		int maxLife = Integer.parseInt(maxLifeStr);

	        		System.out.println("Estado: "+nombreEstado);
	        		System.out.println("MinVida: "+minLife);
	        		System.out.println("MaxVida: "+maxLife);

	        		
	        		JSONArray rulesArray=(JSONArray)estados.get("rules");
		        	for (int r=0 ; r<rulesArray.size();r++)		 
			        {
		        		JSONObject rules=(JSONObject) rulesArray.get(r);
		        		
		        		String tiempoStr=(String) rules.get("tiempo");
		        		String unidad=(String) rules.get("unidad");
		        		String waterMinStr=(String) rules.get("waterMinReq");
		        		String waterMaxStr=(String) rules.get("waterMaxReq");
		        		String abonoMinStr=(String) rules.get("abonoMinReq");
		        		String abonoMaxStr=(String) rules.get("waterMaxReq");
		        		String abonoEfectStr=(String) rules.get("abonoEfect");
		        		String efectoVidaStr=(String) rules.get("efectoVida");
		        		
		        		int tiempoDias = Integer.parseInt(tiempoStr);
		        		int waterMin = Integer.parseInt(waterMinStr);
		        		int waterMax = Integer.parseInt(waterMaxStr);
		        		int abonoMin = Integer.parseInt(abonoMinStr);
		        		int abonoMax = Integer.parseInt(abonoMaxStr);
		        		int abonoEfect = Integer.parseInt(abonoEfectStr);
		        		int efectoVida = Integer.parseInt(efectoVidaStr);
		        		
		        		System.out.println("Tiempo Dias: "+tiempoDias);
		        		System.out.println("Unidad: "+unidad);
		        		System.out.println("Water Min: "+waterMin);
		        		System.out.println("Water Max: "+waterMax);
		        		System.out.println("AbonoMin: "+abonoMin);
		        		System.out.println("AbonoMax: "+abonoMax);
		        		System.out.println("Abono efecto: "+abonoEfect);
		        		System.out.println("Efecto Vida: "+efectoVida);
		        		
			        }
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
