package Templates;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import client.GetClient;

import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JSpinner;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;



public class TemplateListeClientsForm extends JFrame {

	private JPanel background;
	
	

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
//	public static void main(String[] args) throws SQLException {
//		
//
//		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TemplateListeClientsForm frame = new TemplateListeClientsForm();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	


	public TemplateListeClientsForm() throws SQLException {  
		
		GetClient clients = new GetClient();
		clients.getClientFromIdConseiller(2); 

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 1000);
		background = new JPanel();
		background.setBackground(new Color(0, 0, 102));
		background.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(background);
		background.setLayout(null);
		

		JPanel panel = new JPanel();
		panel.setBounds(new Rectangle(20, 20, 300, 300));
		panel.setBounds(67, 114, 665, 728);
		background.add(panel);
	
		
		for(int i = 0; i < clients.getClientFromIdConseiller(2).size(); i++) {
			JButton buttonClient = new JButton(clients.getClientFromIdConseiller(2).get(i).getNameClient());
			panel.add(buttonClient);
			buttonClient.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}
				

		JLabel lblTitle = new JLabel("Liste des clients");
		lblTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitle.setForeground(Color.CYAN);
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblTitle.setBounds(241, 56, 312, 36);
		background.add(lblTitle);
	
		
		JButton btnValider = new JButton("valider");
		btnValider.setAutoscrolls(true);
		btnValider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnValider.setForeground(Color.WHITE);
		btnValider.setFont(new Font("SansSerif", Font.BOLD, 30));
		btnValider.setBackground(Color.CYAN);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnValider.setBounds(308, 853, 200, 80);
		background.add(btnValider);
		

		
	}
}
