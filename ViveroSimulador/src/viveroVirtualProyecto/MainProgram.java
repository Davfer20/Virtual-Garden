package viveroVirtualProyecto;

import java.util.ArrayList;

import jsonScanners.SeasonScanner;
import jsonScanners.SeasonTypeRead;
import jsonScanners.PlantTypeRead;
import jsonScanners.ScanerPlant;
import viveroVirtualProyecto.Planta;

public class MainProgram {//for (PlantTypeRead planta: plantArray)
	public static void main(String[] args) {		
		ScanerPlant scanner = new ScanerPlant();
		ArrayList<PlantTypeRead> plantas = scanner.escaneoPlanta();
		
		
		for (int i=0 ; i<plantas.size();i++) 
		{
			Planta x = new Planta(plantas.get(i));
			ArrayList<Estado> estados = x.getEstados();
			System.out.println(x.getNombrePlanta());
			for (int c=0 ; c<estados.size();c++) 
			{
				Estado estado = x.getIndexEstados(c);
				System.out.println(estado.getDias());
			}				
		}
	
}}
