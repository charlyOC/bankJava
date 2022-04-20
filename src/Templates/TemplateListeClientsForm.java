package Templates;

import java.awt.Color;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import org.postgresql.shaded.com.ongres.scram.client.ScramSession;

import client.Client;
import client.GetClient;
import conseiller.GetCurrentConseiller;
import client.GetCurrentClient;

public class TemplateListeClientsForm extends JFrame {
	
	GetClient getClient = new GetClient();
	GetCurrentConseiller session = new GetCurrentConseiller(); 

	private JPanel background;

	public TemplateListeClientsForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 1000);
		background = new JPanel();
		background.setBackground(new Color(0, 0, 102));
		background.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(background);
		background.setLayout(null);
		
		JPanel container = new JPanel();
		container.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		container.setBackground(new Color(204, 255, 255));
		container.setBounds(91, 144, 615, 722);
		background.add(container);
		

		for(Client client : getClient.getClientFromIdConseiller(GetCurrentConseiller.getIdConseiller())) {
			JButton clients = new JButton(client.getFirstNameClient() + " " + client.getNameClient()); 
			container.add(clients);
			clients.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GetCurrentClient.setIdClient(client.getIdClient()); 
				    templateListeComptesForm tlcf = new templateListeComptesForm();
				    tlcf.show();
				    dispose();
				}
			});
		}
		
//		JButton btnAddClient = new JButton("Ajouter un client");
//		btnAddClient.setForeground(Color.CYAN);
//		
//		background.add(btnAddClient); 
		
		JLabel lblTitle = new JLabel("Listes des clients");
		lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitle.setForeground(Color.CYAN);
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblTitle.setBounds(241, 56, 312, 36);
		background.add(lblTitle);
		
		
		JButton btnValider = new JButton("valider");
		btnValider.setAutoscrolls(true);
		btnValider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnValider.setForeground(Color.CYAN);
		btnValider.setFont(new Font("SansSerif", Font.BOLD, 30));
		btnValider.setBackground(Color.CYAN);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnValider.setBounds(313, 878, 200, 80);
		background.add(btnValider);
		
		JButton btnNewButton = new JButton("Ajouter un client");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    TemplateCreationCompteClient tcc = new TemplateCreationCompteClient();
			    tcc.show();
			    dispose();
			}
		});
		btnNewButton.setBounds(586, 33, 152, 23);
		background.add(btnNewButton);
		
	}
}
