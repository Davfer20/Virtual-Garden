package viveroVirtualProyecto;

import java.util.ArrayList;

public class Estado {
	private int estado;
	private int dias;
	private int minLife;
	private int maxLife;
	private int waterMin;
	private int waterMax;
	private int abonoMin;
	private int abonoMax;
	private int abonoEfect;
	private int vidaEfect;
	private int waterEfect;
	private ArrayList<?>URLs;
	
	public int getEstado()
	{
		return estado;
	}
	public int getDias()
	{
		return dias;
	}
	public int getMinLife() {
		return minLife;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public int getWaterMin() {
		return waterMin;
	}
	public int getWaterMax() {
		return waterMax;
	}
	public int getAbonoMin() {
		return abonoMin;
	}
	public int getAbonoMax() {
		return abonoMax;
	}
	public int getAbonoEfect() {
		return abonoEfect;
	}
	public int getVidaEfect() {
		return vidaEfect;
	}
	public int getWaterEfect() {
		return waterEfect;
	}
	public ArrayList<?> getURls() {
		return URLs;
	}
	public void setEstadoID(int pEstado)
	{
		this.estado = pEstado;
	}
	public void setDiasEnCreces(int pDias)
	{
		this.dias= pDias;
	}
	public void setminLife(int minLife) {
		this.minLife = minLife;
	}
	public void setmaxlife(int maxLife) {
		this.maxLife = maxLife;
	}
	public void setminWater(int waterMin) {
		this.waterMin = waterMin;
	}
	public void setmaxWater(int waterMax) {
		this.waterMax = waterMax;
	}
	public void setminabono(int abonoMin) {
		this.abonoMin = abonoMin;
	}
	public void setmaxabono(int abonoMax) {
		this.abonoMax = abonoMax;
	}
	public void setAbonoEfect(int abonoEfect) {
		this.abonoEfect = abonoEfect;
	}
	public void setVidaEfect(int vidaEfect) {
		this.vidaEfect = vidaEfect;
	}
	public void setAguaEfect(int waterEfect) {
		this.waterEfect = waterEfect;
	}
	public void setURls(ArrayList<?> uRls) {
		URLs = uRls;
	}
	public void ShowData()
	{
		System.out.println("Prueba sobre tener URL"+ URLs);
		System.out.println("Prueba sobre tener vidaEfect"+ abonoMin);
		System.out.println("Prueba sobre dias"+dias);
	}
}
