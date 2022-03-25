package Templates;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class templateOuvrirCompteForm extends JFrame {

	private JPanel background;
	private JTextField txtChoisissezLeType;
	private JTextField banqField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public templateOuvrirCompteForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 1000);
        background = new JPanel();
        background.setBackground(new Color(0, 0, 102));
        background.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        setContentPane(background);
        background.setLayout(null);
        
        JPanel container = new JPanel();
        container.setSize(615, 722);
		container.setLocation(91, 144);
		container.setForeground(new Color(0, 0, 139));
		container.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		container.setBackground(new Color(204, 255, 255));
		background.add(container, BorderLayout.CENTER);
		container.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("compte courant");
		rdbtnNewRadioButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton.setBounds(214, 150, 195, 23);
		container.add(rdbtnNewRadioButton);
		
		txtChoisissezLeType = new JTextField();
		txtChoisissezLeType.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtChoisissezLeType.setBorder(null);
		txtChoisissezLeType.setBackground(new Color(204, 255, 255));
		txtChoisissezLeType.setForeground(new Color(0, 0, 102));
		txtChoisissezLeType.setHorizontalAlignment(SwingConstants.CENTER);
		txtChoisissezLeType.setText("choisissez le type de compte");
		txtChoisissezLeType.setBounds(102, 54, 418, 26);
		container.add(txtChoisissezLeType);
		txtChoisissezLeType.setColumns(10);
		
		JRadioButton rdbtnCompteEpargne = new JRadioButton("compte épargne");
		rdbtnCompteEpargne.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtnCompteEpargne.setForeground(new Color(0, 0, 102));
		rdbtnCompteEpargne.setBounds(214, 194, 195, 23);
		container.add(rdbtnCompteEpargne);
		
		banqField = new JTextField();
		banqField.setForeground(new Color(0, 0, 102));
		banqField.setBounds(145, 325, 354, 78);
		container.add(banqField);
		banqField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ouvrir un compte");
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
		
		JButton btnNewButton_1 = new JButton("<<<<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TemplateListeClientsForm tcform = new TemplateListeClientsForm();
				tcform.show();
				dispose();	
			}
		});
		btnNewButton_1.setBounds(35, 115, 89, 23);
		background.add(btnNewButton_1);

}
}
