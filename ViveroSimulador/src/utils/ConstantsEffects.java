package utils;

public interface ConstantsEffects {
	public static final int DAYS_IN_YEARS = 700;
	public static final int TASA_REVISO = 5;
	public static final int CHECKIN_TIME = Math.round(DAYS_IN_YEARS / TASA_REVISO);
	
	public static String UPDATE_DAYS = "DAYS";
	public static String UPDATE_WEATHER = "WEATHER";
	
	public static final int THREAD_POOL_SIZE = 5;
}
