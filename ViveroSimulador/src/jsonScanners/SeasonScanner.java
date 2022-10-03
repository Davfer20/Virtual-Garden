package jsonScanners;

import jsonScanners.SeasonTypeRead;

import java.io.*;
import java.util.ArrayList;
import org.json.simple.*;
import org.json.simple.parser.*;

public class SeasonScanner {
	private JSONObject jsonObject;
	public SeasonScanner() {
		JSONParser parser = new JSONParser();
		try {			
			this.jsonObject = (JSONObject) parser.parse(new FileReader("/Users/Davfer/OneDrive/Documents/TEC 2 Semestre/garden.json"));
		}catch(Exception e) {
    		e.printStackTrace();
		}
		
	}
	public ArrayList<SeasonTypeRead> getSeassonRules() {
		
		JSONArray seassonArray = (JSONArray) jsonObject.get("Season");
        ArrayList<SeasonTypeRead> arrayEstaciones = new ArrayList<SeasonTypeRead>();

		 for (int i=0 ; i<seassonArray.size();i++)
	        {
	        	JSONObject address=(JSONObject) seassonArray.get(i);
	        	SeasonTypeRead estacionActual = new SeasonTypeRead();	              
	        	estacionActual.setNomEstacion((String) address.get("Nombre Estacion"));
	        	estacionActual.setDiaLimite(Integer.parseInt((String) address.get("diasLimites")));
	        	estacionActual.setActive(Boolean.parseBoolean((String) address.get("isActive")));
	        	estacionActual.setTempMin(Integer.parseInt((String) address.get("Temperatura  Min")));
	        	estacionActual.setTempMax(Integer.parseInt((String) address.get("Temperatura Max")));
	        	estacionActual.setPrecipitacion(Integer.parseInt((String) address.get("Precipitacion")));
	        	estacionActual.setAguaEfecto(Integer.parseInt((String) address.get("AguaEfecto")));
	        	
	        	arrayEstaciones.add(estacionActual);

		    }
	        return arrayEstaciones;	
}
}




