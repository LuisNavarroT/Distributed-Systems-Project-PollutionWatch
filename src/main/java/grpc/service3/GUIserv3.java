package grpc.service3;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import grpc.service3.GUIserv3;

public class GUIserv3 {
	private JFrame frame;
	private JTextField textRiverData; 
	private JTextField textWatStatValue;
	private JTextField textNeiStatValue;
	private JTextArea textResponseAreaStat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIserv3 window = new GUIserv3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public GUIserv3() {
		


		
		initialize();
	}
	
		
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Area Status Control GUI");
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		
		frame.getContentPane().setLayout(bl);
		//panel 1
		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);
		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		//panel 2
		JPanel panel_service_2 = new JPanel();
		frame.getContentPane().add(panel_service_2);
		panel_service_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("River Name");
		panel_service_2.add(lblNewLabel_2);
		
		textRiverData = new JTextField();
		panel_service_2.add(textRiverData);
		textRiverData.setColumns(10);
		//panel 3

		//panel 4
		JPanel panel_service_4 = new JPanel();
		frame.getContentPane().add(panel_service_4);
		panel_service_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("River Name 2");
		panel_service_4.add(lblNewLabel_4);
		
		textWatStatValue = new JTextField();
		panel_service_4.add(textWatStatValue);
		textWatStatValue.setColumns(10);
		//panel 5
		JPanel panel_service_5 = new JPanel();
		frame.getContentPane().add(panel_service_5);
		panel_service_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_5 = new JLabel("Neighbourhood Name");
		panel_service_5.add(lblNewLabel_5);
		
		textNeiStatValue = new JTextField();
		panel_service_5.add(textNeiStatValue);
		textNeiStatValue.setColumns(10);
		//panel 6

		//
		
		
		final JComboBox comboOperation = new JComboBox();
		comboOperation.setModel(new DefaultComboBoxModel(new String[] {"rpc1-neighbourhoodName", "rpc2-BidiOxygen", "rpc3-manyAirReadings"}));
		panel_service_1.add(comboOperation);
	
		
		JButton btnCalculate = new JButton("Send");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float num1 = Float.parseFloat(textRiverData.getText());
				float num2 = Float.parseFloat(textWatStatValue.getText());
				float num3 = Float.parseFloat(textNeiStatValue.getText());
				String name = textResponseAreaStat.getText();
				
				int index = comboOperation.getSelectedIndex();
				
				if (index == 0) {
					textResponseAreaStat.append("Result of Subtraction" + String.valueOf(num1 - num2)); 
					}
				if (index == 1) { 
					textResponseAreaStat.append("Result of Subtraction" + String.valueOf(num1 - num2)); 
					}
				if (index == 2) {
					textResponseAreaStat.append("Result of Multiplication" + String.valueOf(num1 * num2)); 
					}
				
			}
		});
		panel_service_1.add(btnCalculate);
		
		textResponseAreaStat = new JTextArea(3, 20);
		textResponseAreaStat .setLineWrap(true);
		textResponseAreaStat.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(textResponseAreaStat);
		
		//textResponse.setSize(new Dimension(15, 30));
		JPanel panel_service_7 = new JPanel();
		JLabel lblNewLabel_7 = new JLabel("Server Response");
		panel_service_7.add(lblNewLabel_7);
		frame.getContentPane().add(panel_service_7);
		panel_service_7.add(scrollPane);
		
		
		JPanel panel_service_8 = new JPanel();
		frame.getContentPane().add(panel_service_8);
		
		JPanel panel_service_9 = new JPanel();
		frame.getContentPane().add(panel_service_9);
		
	}
}
