package uiModel;

import uiModel.GardenController;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GardenMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GardenController controller;
	
	private JTextField txtAmount;
	
	private JPanel gardenSide;
	private JPanel commandSide;
	
	private JButton buttonPrueba;
	private JButton addPlant;
	private JButton culantro;
	private JButton btn;
	
	public GardenMainFrame(GardenController pController) {
		
		controller = pController; // frame ve al controller
		controller.setWindow(this); // controller ve al frame

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(0, 0, 1000, 650);
		this.setLocationRelativeTo(null);
		this.setLayout(null); //Un metodo para acomodar automaticamente
		this.setBackground(Color.white);
		this.initComponents();
		this.setVisible(true);	
	}

	private void prueba() {
		gardenSide.setVisible(false);
		JButton btn = new JButton ("Prueba btn");
		btn.setBounds(0, 0, 300,20);
		gardenSide.add(btn);
		gardenSide.setVisible(true);
		//Los visible sirven para que se actualize
	}
	private void initComponents ()
	{   			
    	txtAmount = new JTextField();
    	txtAmount.setBounds(230, 20, 160, 20);
    	this.add(txtAmount);
    	
    	buttonPrueba = new JButton("Prueba");  
    	buttonPrueba.setBounds(100, 50, 100,20);
    	this.add(buttonPrueba);
    	buttonPrueba.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){
    			txtAmount.setText("Churrumi");
    		}  
    	});

		addPlant = new JButton("Add Plant");  
    	this.add(addPlant);
    	addPlant.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){
    			prueba();
    		}  
    	});
    	
		culantro = new JButton("Culantro");
		//culantro.setVerticalAlignment(JButton.TOP);
		//culantro.setHorizontalAlignment(JButton.LEFT);
    	//culantro.setBounds(50, 20, 10,40);
    	culantro.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){   			
    		}  
    	});      	
    	
		gardenSide = new JPanel();
		gardenSide.setBackground(Color.white);
		gardenSide.setBounds(0, 0, 750, 650);
		this.add(gardenSide);
		//this.gardenSide.setLayout(null);
		
	 	
		commandSide = new JPanel();
		commandSide.setBackground(Color.gray);
		commandSide.setBounds(750, 0, 250, 650);
		
		commandSide.add(culantro);
		commandSide.add(addPlant);
		this.add(commandSide);
		
	

    }
	
}
