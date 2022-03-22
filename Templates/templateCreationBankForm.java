package Templates;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class templateCreationBankForm extends JFrame {

	private JPanel template;
	private JTextField txtNom;
	private JTextField textField;
	private JPanel panel_2;
	private JTextField txtRaisonSociale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					templateCreationBankForm frame = new templateCreationBankForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public templateCreationBankForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 1000);
		template = new JPanel();
		template.setBackground(new Color(0, 0, 102));
		template.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(template);
		template.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(244, 497, 350, 40);
		template.add(panel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setText("Prenom");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(18);
		textField.setAutoscrolls(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(244, 374, 350, 40);
		template.add(panel_1);
		
		txtNom = new JTextField();
		panel_1.add(txtNom);
		txtNom.setText("Nom");
		txtNom.setHorizontalAlignment(SwingConstants.LEFT);
		txtNom.setColumns(18);
		txtNom.setAutoscrolls(false);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(244, 608, 350, 40);
		template.add(panel_2);
		
		txtRaisonSociale = new JTextField();
		txtRaisonSociale.setText("Raison sociale");
		txtRaisonSociale.setHorizontalAlignment(SwingConstants.LEFT);
		txtRaisonSociale.setColumns(18);
		txtRaisonSociale.setAutoscrolls(false);
		panel_2.add(txtRaisonSociale);
		
		JLabel lblNewLabel_1 = new JLabel("Creation fichier client");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_1.setBounds(202, 157, 425, 40);
		template.add(lblNewLabel_1);
		
		JButton btnValider = new JButton("valider");
		btnValider.setForeground(Color.BLACK);
		btnValider.setFont(new Font("SansSerif", Font.BOLD, 30));
		btnValider.setBackground(Color.CYAN);
		btnValider.setAutoscrolls(true);
		btnValider.setBounds(314, 769, 200, 80);
		template.add(btnValider);
		
		
		
		
	}
}
