package jsonScanners;

import viveroVirtualProyecto.Estado;
import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

import org.json.simple.*;
import org.json.simple.parser.*;

public class ScanerPlant {
	private JSONObject jsonObject;
	public ScanerPlant() {
		JSONParser parser = new JSONParser();
		try {			
			this.jsonObject = (JSONObject) parser.parse(new FileReader("/Users/Davfer/OneDrive/Documents/TEC 2 Semestre/garden.json"));
		}catch(Exception e) {
    		e.printStackTrace();
		}
		
	}
	public ArrayList<Estado> getNiveles(JSONArray pNiveles) {
		
		ArrayList<Estado> niveles = new ArrayList<Estado>();
    	for (int f=0 ; f<pNiveles.size();f++){
    		JSONObject currentEstado = (JSONObject) pNiveles.get(f);
    		Estado currentNiveles = new Estado();       
    		ArrayList<String> stringURL = new ArrayList<String>();
  
    		currentNiveles.setEstadoID(Integer.parseInt((String) currentEstado.get("Estado")));
    		currentNiveles.setDiasEnCreces(Integer.parseInt((String) currentEstado.get("Dias Crecer")));
    		currentNiveles.setminLife(Integer.parseInt((String)currentEstado.get("minLife")));
    		currentNiveles.setmaxlife(Integer.parseInt((String)currentEstado.get("maxLife")));
    		
    		currentNiveles.setminWater(Integer.parseInt((String)currentEstado.get("waterMinReq")));
    		currentNiveles.setmaxWater(Integer.parseInt((String)currentEstado.get("waterMaxReq")));
    		
    		currentNiveles.setminabono(Integer.parseInt((String)currentEstado.get("abonoMinReq")));
    		currentNiveles.setmaxabono(Integer.parseInt((String)currentEstado.get("abonoMaxReq")));
    		
    		
    		currentNiveles.setAbonoEfect(Integer.parseInt((String) currentEstado.get("abonoEfect")));
    		currentNiveles.setVidaEfect(Integer.parseInt((String) currentEstado.get("efectoVida")));
    		currentNiveles.setAguaEfect(Integer.parseInt((String) currentEstado.get("AguaEfecto")));

    		String vidaURL =(String) currentEstado.get("Vida");
    		String muertURL=(String) currentEstado.get("Muerta");	        		
    		String ahogadaURL=(String) currentEstado.get("Ahogada");
    		
    		stringURL.add(vidaURL);
    		stringURL.add(muertURL);
    		stringURL.add(ahogadaURL);
    		
    		currentNiveles.setURls(stringURL);
    		niveles.add(currentNiveles);
    	}
    	return niveles;
	}
	public ArrayList<PlantTypeRead> escaneoPlanta (){

        JSONArray plantArray = (JSONArray) jsonObject.get("Planta");
        ArrayList<PlantTypeRead> listPlantas = new ArrayList<PlantTypeRead>();
        for (int i=0 ; i<plantArray.size();i++) //for (PlantTypeRead planta: plantArray)
        {
        	JSONObject address=(JSONObject) plantArray.get(i);
        	PlantTypeRead tipoPlanta = new PlantTypeRead();	              
        	tipoPlanta.setNombre((String) address.get("Nombre"));
        	tipoPlanta.setEstados(getNiveles((JSONArray) address.get("Niveles")));
        	listPlantas.add(tipoPlanta);

	    }
        return listPlantas;				     		
	}		 
}
