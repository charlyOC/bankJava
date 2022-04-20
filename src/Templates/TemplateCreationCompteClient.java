package Templates;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import conseiller.AddClientFromIdConseiller;
import conseiller.GetCurrentConseiller;

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
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Rectangle;


public class TemplateCreationCompteClient extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	GetCurrentConseiller session = new GetCurrentConseiller(); 

	AddClientFromIdConseiller addClient = new AddClientFromIdConseiller();
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	

	
	



	

	/**
	 * Create the frame.
	 */
	public TemplateCreationCompteClient() {
		getContentPane().setBounds(new Rectangle(0, 0, 750, 12));
		getContentPane().setBackground(Color.BLUE);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(130, 174, 491, 56);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Création d'un Compte Client");
		lblNewLabel.setBounds(173, 20, 423, 75);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setMaximumSize(new Dimension(200, 75));
		lblNewLabel.setPreferredSize(new Dimension(200, 75));
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(331, 761, 133, 56);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 28));
		getContentPane().add(btnNewButton);
		

		
		JLabel name = new JLabel("Nom de Famille");
		name.setBounds(269, 127, 202, 37);
		name.setFont(new Font("SansSerif", Font.BOLD, 26));
		getContentPane().add(name);
		
		JLabel firstName = new JLabel("Pr\u00E9nom");
		firstName.setBounds(296, 252, 187, 37);
		firstName.setVerticalAlignment(SwingConstants.BOTTOM);
		firstName.setFont(new Font("SansSerif", Font.BOLD, 26));
		getContentPane().add(firstName);
		
		JLabel raisonSociale = new JLabel("Raison Sociale");
		raisonSociale.setBounds(281, 379, 202, 48);
		raisonSociale.setFont(new Font("SansSerif", Font.BOLD, 26));
		getContentPane().add(raisonSociale);
		
		JLabel numeroClient = new JLabel("Num\u00E9ro de client");
		numeroClient.setBounds(416, 507, 248, 43);
		numeroClient.setFont(new Font("SansSerif", Font.BOLD, 26));
		getContentPane().add(numeroClient);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 299, 491, 56);
		textField_1.setColumns(10);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 428, 491, 56);
		textField_2.setColumns(10);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(437, 557, 178, 56);
		textField_3.setColumns(10);
		getContentPane().add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(143, 557, 210, 56);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel numeroClient_1 = new JLabel("Id Client");
		numeroClient_1.setBounds(183, 507, 133, 43);
		numeroClient_1.setFont(new Font("SansSerif", Font.BOLD, 26));
		getContentPane().add(numeroClient_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setForeground(Color.CYAN);
		panel.setBounds(45, 30, 686, 721);
		getContentPane().add(panel);

		setBackground(Color.BLUE);
		setBounds(100, 100, 798, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameValue = textField.getText();
				String firstNameValue = textField_1.getText();
				String raisonSocialeValue = textField_2.getText();
				String numeroClientValue = textField_3.getText();
				int idClient = Integer.parseInt(textField_5.getText());
				
				try {
					addClient.addClientFromIdConseiller(idClient, nameValue, firstNameValue, raisonSocialeValue, numeroClientValue, session.getIdConseiller());
					System.out.println("name" + nameValue);
					System.out.println("prenom" + firstNameValue);
					System.out.println("rs" + raisonSocialeValue);
					System.out.println("Num" + numeroClientValue);
//					System.out.println("Conseiller" + referenceConseillerValue);
					TemplateListeClientsForm tlcf = new TemplateListeClientsForm(); 
					tlcf.show(); 
					dispose(); 
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				System.out.println(nameValue);
				
			}
		});
	}

	public Color getThisBackground() {
		return getBackground();
	}
	public void setThisBackground(Color background) {
		setBackground(background);
	}
}