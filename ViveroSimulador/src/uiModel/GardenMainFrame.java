package uiModel;

import uiModel.GardenController;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GardenMainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GardenController controller;
	private JLabel lblLastNumber;
	private JLabel lblHistory;
	private JTextField txtAmount;
	private JTextField txtNumbers;
	
	public static void main(String[] args)
	{
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GardenMainFrame().setVisible(true);
            }
        });

	}
	
	public GardenMainFrame() {
		
		//controller = pController; // frame ve al controller
		//controller.setWindow(this); // controller ve al frame

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(0, 0, 1080, 780);
		this.setLocationRelativeTo(null);
		this.setLayout(null); // this allows this frame to locate the components with freedom in the screen
		this.setBackground(Color.white);
		this.initComponents();
		this.setVisible(true);
		
	}
	
	private void initComponents ()
	{
		
		JLabel captionAmount = new JLabel("Amount: ");
    	captionAmount.setBounds(10, 20, 160, 20);
    	this.add(captionAmount);
    	
  
	}}
