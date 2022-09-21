package viveroVirtual;
import java.io.*;
import java.util.*;
import org.json.JSONObject;
import org.json.JSONArray;


public class Jsonfile {
	public static void main(String []args) 
	{
		String str = "[{\"Garden\":[\"Plant\",{\"Edad\":0,\"LifePoints\":10,\"MaxLifePoints\":100,\"Waterpoints\":0,\"WaterReqMin\":60,\"WaterReqMax\":80,\"Sunpoints\":0,\"SunReqMin\":20,\"SunReqMax\":40,\"Fertlilizerpoints\":0,\"FertilizerReq\":40,\"GrowRate\":0,\"Picture\":\"url\",\"Type\":\"Default\",\"Status\":[{\"nombre\":\"Almacigo\",\"minLife\":70,\"maxLife\":100,\"foto\":\"url\",\"rules\":[{\"tiempo\":3,\"unidad\":\"dias\",\"watermin\":0,\"watermax\":40,\"abonomin\":0,\"abonomax\":20,\"efecto\":-5}]}]}],\"Season\":[{\"Summer\":{\"startDate\":\"8/8/2022\",\"endDate\":\"8/8/2022\",\"isActive\":true,\"TemperaturaMin\":20,\"TemperaturaMax\":40,\"Precipitacion\":2},\"Spring\":{\"startDate\":\"3/4/2022\",\"endDate\":\"5/4/2022\",\"isActive\":true,\"TemperaturaMin\":10,\"TemperaturaMax\":30,\"Precipitacion\":4},\"Fall\":{\"startDate\":\"3/7/2022\",\"endDate\":\"3-7/2022\",\"isActive\":true,\"TemperaturaMin\":15,\"TemperaturaMax\":30,\"Precipitacion\":6},\"Winter\":{\"startDate\":\"1/8/2022\",\"endDate\":\"1/8/2022\",\"isActive\":true,\"TemperaturaMin\":5,\"TemperaturaMax\":15,\"Precipitacion\":8}}]}]";
		
		JSONArray jsonArray = new JSONArray(str);
		JSONObject jsonObject = new JSONObject(0);
		
		System.out.println(jsonObject.get("Edad"));
			
		
	}

}
