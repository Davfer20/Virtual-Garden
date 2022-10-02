package jsonScanners;

import java.util.ArrayList;

public class SeasonTypeRead {
	private String season;
	private ArrayList<?> reglasSeason;
	
	public SeasonTypeRead ()
	{}
	public String getSeason ()
	{
		return season;
	}
	public void setSeason (String pSeason)
	{
		this.season = pSeason;
	}
	public ArrayList<?> getRules() {
		return reglasSeason;
	}
	
	public void setRules(ArrayList<?> rules) {
		this.reglasSeason = rules;
	}
	public void getRulesVariable ()
	{
		
	}
}
