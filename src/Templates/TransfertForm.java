package Templates;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class TransfertForm extends JFrame {

	private JPanel background;
	private JTextField MoneyDrop;

	
	 //Launch the application.
	

	
	 //Create the frame.
	 
	public TransfertForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 1000);
		background = new JPanel();
		background.setBackground(new Color(0, 0, 102));
		background.setBorder (new LineBorder(new Color(0, 0, 0), 1, true));
		background.setLayout(null);
		setContentPane(background);
		
		
		JPanel container = new JPanel();
		container.setSize(615, 722);
		container.setLocation(91, 144);
		container.setForeground(new Color(0, 0, 139));
		container.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		container.setBackground(new Color(204, 255, 255));
		background.add(container, BorderLayout.CENTER);
		container.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Compte à débiter");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_1.setBounds(194, 30, 184, 27);
		container.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Compte à débiter");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_1_1.setBounds(194, 376, 184, 27);
		container.add(lblNewLabel_1_1);
		
		JLabel lblMontant = new JLabel("Montant :");
		lblMontant.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMontant.setForeground(new Color(0, 0, 102));
		lblMontant.setBackground(Color.CYAN);
		lblMontant.setBounds(146, 252, 109, 27);
		container.add(lblMontant);
		
		MoneyDrop = new JTextField();
		MoneyDrop.setBounds(288, 235, 150, 62);
		container.add(MoneyDrop);
		MoneyDrop.setColumns(10);
		
		JLabel lblNumroDeCompte = new JLabel("numéro de compte :");
		lblNumroDeCompte.setForeground(new Color(0, 0, 102));
		lblNumroDeCompte.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNumroDeCompte.setBackground(Color.CYAN);
		lblNumroDeCompte.setBounds(84, 100, 223, 27);
		container.add(lblNumroDeCompte);
		
		JLabel lblNumroDeCompte_1 = new JLabel("numéro de compte :");
		lblNumroDeCompte_1.setForeground(new Color(0, 0, 102));
		lblNumroDeCompte_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNumroDeCompte_1.setBackground(Color.CYAN);
		lblNumroDeCompte_1.setBounds(84, 449, 223, 27);
		container.add(lblNumroDeCompte_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(319, 94, 131, 46);
		container.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(319, 440, 131, 46);
		container.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Transferts");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setBounds(241, 56, 312, 36);
		background.add(lblNewLabel);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBackground(Color.CYAN);
		btnValider.setForeground(Color.CYAN);
		btnValider.setFont(new Font("SansSerif", Font.BOLD, 30));
		btnValider.setBounds(313, 878, 200, 80);
		background.add(btnValider);
		
	}
}