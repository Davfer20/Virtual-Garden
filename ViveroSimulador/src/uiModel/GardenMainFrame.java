package uiModel;

import uiModel.GardenController;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import jsonScanners.PlantTypeRead;

public class GardenMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GardenController controller;
	private ArrayList<PlantTypeRead> plantListJSON;
	private JPanel panelG, panelC, panelP;
	private int panel2xMax, panel2yMax;
	private JTextField txtAmount;

	private JButton plantTypeButton;
	
	private JButton btn;
	
	public GardenMainFrame(GardenController pController) {
		
		controller = pController; // frame ve al controller
		controller.setWindow(this); // controller ve al frame
		getJSONPlantList();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(0, 0, 1000, 650);
		this.setLocationRelativeTo(null);
		this.setLayout(null); //Un metodo para acomodar automaticamente
		this.setBackground(Color.white);
		this.initComponents();
		this.setVisible(true);	
	}
	
	private void getJSONPlantList() //Obtiene lista con valores
	{
		this.plantListJSON = controller.accesPlantType();
	}
	
	private void crearNuevoPanelController() {//Crea panel con planta
		JPanel panelc = new JPanel();
		panelc.setBackground(Color.gray);
		panelc.setBounds(750, 0, 250, 650);
		panelc.setMaximumSize(new Dimension (60,50));
		int x = (int) panelc.getBounds().getMaxX();
		int y = (int) panelc.getBounds().getMaxY();
		this.panel2xMax = x -750;
		this.panel2yMax = y;
		panelc.setLayout(null);
		this.panelC = panelc;
	}
	
	private void crearGardenPanel() {//Crea panel con planta
		JPanel panelg = new JPanel();
		panelg.setBackground(Color.GRAY);
		panelg.setBounds(0, 0, 750, 650);
		panelg.setLayout(null);
		this.panelG = panelg;
	}
	
	private void createPanel()
	{
		JPanel panelPlant = new JPanel();
		panelPlant.setBounds(20, 20, 250, 200);
		panelPlant.setBackground(Color.green);
		panelPlant.setLayout(null);
		
		JLabel nombrePlanta = new JLabel("HOLA");
		nombrePlanta.setBounds(10, 10, 100,20);
    	panelPlant.add(nombrePlanta);
    	////C:\RepositoriosTEC2\POO\Virtual-Garden\ViveroSimulador
    	JLabel img = new JLabel (new ImageIcon("../ViveroSimulador/src/photos/almacigoCulantro.png"));
    	img.setBounds(10, 20, 240,140);
    	panelPlant.add(img);

		this.panelG = panelPlant;
	}
	

	private void plantasInicio() {
		panelC.setVisible(false);
		int x = 20;
		int y = 10;
		for (int i=0 ; i< controller.sizeArrayJsonPlants();i++)
		{
			String nomPlanta = plantListJSON.get(i).getNamePlant();
			
			this.plantTypeButton = new JButton (nomPlanta);
			this.plantTypeButton.setBounds(x, y, 180, 30);
			panelC.add(plantTypeButton);
			y += 45;
		}
		panelC.setVisible(true);
	}

	
	private void initComponents ()
	{   		
		crearNuevoPanelController();
		crearGardenPanel();
		
		plantasInicio();
		createPanel();
    
		this.add(panelC);
		this.add(panelG);
		

    }
	
}
