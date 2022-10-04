package uiModel;

import uiModel.GardenController;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	public GardenMainFrame(GardenController pController) {
		
		controller = pController; // frame ve al controller
		controller.setWindow(this); // controller ve al frame

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(0, 0, 1000, 650);
		this.setLocationRelativeTo(null);
		this.setLayout(null); // this allows this frame to locate the components with freedom in the screen
		this.setBackground(Color.white);
		this.initComponents();
		this.setVisible(true);	
	}
	
	private void initComponents ()
	{
		JLabel captionAmount = new JLabel("ViveroPlantas");
    	captionAmount.setBounds(10, 20, 160, 20);
    	this.add(captionAmount);
    	
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
		addPlant.setBounds(160, 150, 300,20);
    	this.add(addPlant);
    	addPlant.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){
    			txtAmount.setText("Churrumi");
    		}  
    	});
    	
		culantro = new JButton("Culantro");  
    	this.add(addPlant);
    	culantro.setVerticalAlignment(JButton.TOP);
    	addPlant.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){
    		}  
    	});
    	
    	
		
		gardenSide = new JPanel();
		gardenSide.setBackground(Color.white);
		gardenSide.setBounds(0, 0, 750, 650);
		this.add(gardenSide);
		
		commandSide = new JPanel();
		commandSide.setBackground(Color.gray);
		commandSide.setBounds(750, 0, 250, 650);
		this.add(commandSide);
		
		commandSide.add(addPlant);
	
		

    }
}
