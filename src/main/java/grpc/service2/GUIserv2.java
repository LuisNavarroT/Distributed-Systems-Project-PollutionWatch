package grpc.service2;

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

import grpc.service2.GUIserv2;

public class GUIserv2 {
	private JFrame frame;
	private JTextField textNeigStatus;
	private JTextField textOxiBefValue;
	private JTextField textOxiAftValue;
	private JTextField textDataMonValue;
	private JTextField textDataOzValue;
	private JTextArea textResponseAirQuality;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIserv2 window = new GUIserv2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public GUIserv2() {
		


		
		initialize();
	}
	
		
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Air quality check GUI");
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
		
		JLabel lblNewLabel_2 = new JLabel("Neighbourhood name");
		panel_service_2.add(lblNewLabel_2);
		
		textNeigStatus = new JTextField();
		panel_service_2.add(textNeigStatus);
		textNeigStatus.setColumns(10);
		//panel 3
		JPanel panel_service_3 = new JPanel();
		frame.getContentPane().add(panel_service_3);
		panel_service_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("Oxigen level Before");
		panel_service_3.add(lblNewLabel_3);
		
		textDataOzValue = new JTextField();
		panel_service_3.add(textDataOzValue);
		textDataOzValue.setColumns(10);
		//panel 4
		JPanel panel_service_4 = new JPanel();
		frame.getContentPane().add(panel_service_4);
		panel_service_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("Oxigen level After");
		panel_service_4.add(lblNewLabel_4);
		
		textOxiBefValue = new JTextField();
		panel_service_4.add(textOxiBefValue);
		textOxiBefValue.setColumns(10);
		//panel 5
		JPanel panel_service_5 = new JPanel();
		frame.getContentPane().add(panel_service_5);
		panel_service_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_5 = new JLabel("Carbon monoxide value");
		panel_service_5.add(lblNewLabel_5);
		
		textOxiAftValue = new JTextField();
		panel_service_5.add(textOxiAftValue);
		textOxiAftValue.setColumns(10);
		//panel 6
		JPanel panel_service_6 = new JPanel();
		frame.getContentPane().add(panel_service_6);
		panel_service_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_6 = new JLabel("ground level ozone value");
		panel_service_6.add(lblNewLabel_6);
		
		textDataMonValue = new JTextField();
		panel_service_6.add(textDataMonValue);
		textDataMonValue.setColumns(10);
		//
		
		
		final JComboBox comboOperation = new JComboBox();
		comboOperation.setModel(new DefaultComboBoxModel(new String[] {"rpc1-neighbourhoodName", "rpc2-BidiOxygen", "rpc3-manyAirReadings"}));
		panel_service_1.add(comboOperation);
	
		
		JButton btnCalculate = new JButton("Send");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float num1 = Float.parseFloat(textNeigStatus.getText());
				float num2 = Float.parseFloat(textOxiBefValue.getText());
				float num3 = Float.parseFloat(textOxiAftValue.getText());
				float num4 = Float.parseFloat(textDataMonValue.getText());
				float num5 = Float.parseFloat(textDataOzValue.getText());
				String name = textResponseAirQuality.getText();
				
				int index = comboOperation.getSelectedIndex();
				
				if (index == 0) {
					textResponseAirQuality.append("Result of Subtraction" + String.valueOf(num1 - num2)); 
					}
				if (index == 1) { 
					textResponseAirQuality.append("Result of Subtraction" + String.valueOf(num1 - num2)); 
					}
				if (index == 2) {
					textResponseAirQuality.append("Result of Multiplication" + String.valueOf(num1 * num2)); 
					}
				
			}
		});
		panel_service_1.add(btnCalculate);
		
		textResponseAirQuality = new JTextArea(3, 20);
		textResponseAirQuality .setLineWrap(true);
		textResponseAirQuality.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(textResponseAirQuality);
		
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
