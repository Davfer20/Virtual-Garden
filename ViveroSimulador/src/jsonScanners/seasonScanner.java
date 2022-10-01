package jsonScanners;

import java.io.*;


import java.util.ArrayList;

import org.json.simple.*;
import org.json.simple.parser.*;

public class seasonScanner {

public void escaneoSeasons()
{
	JSONParser parser = new JSONParser();
    try {
    	Object obj = parser.parse(new FileReader("/Users/Davfer/OneDrive/Documents/TEC 2 Semestre/garden.json"));	JSONObject jsonObject = (JSONObject)obj;
    	
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

     		
     		
     		//Se agregan los datos a la clase
     		
	        }
     }}
	catch(Exception e) {
		e.printStackTrace();
	}}
}




