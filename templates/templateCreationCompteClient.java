package templates;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
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
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class templateCreationCompteClient extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					templateCreationCompteClient frame = new templateCreationCompteClient();
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
	public templateCreationCompteClient() {
		getContentPane().setBackground(Color.BLUE);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(130, 199, 491, 56);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cr\u00E9ation d'un Compte Client");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setMaximumSize(new Dimension(200, 75));
		lblNewLabel.setPreferredSize(new Dimension(200, 75));
		lblNewLabel.setBounds(142, 40, 423, 75);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 28));
		btnNewButton.setBounds(307, 834, 133, 56);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Nom de Famille");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblNewLabel_1.setBounds(269, 152, 202, 37);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pr\u00E9nom");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblNewLabel_2.setBounds(297, 281, 187, 37);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Raison Sociale");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblNewLabel_3.setBounds(281, 394, 202, 48);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Num\u00E9ro de client");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblNewLabel_4.setBounds(281, 531, 248, 43);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("R\u00E9f\u00E9rence Conseiller");
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblNewLabel_5.setBounds(258, 671, 278, 47);
		getContentPane().add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 328, 491, 56);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 452, 491, 56);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 584, 491, 56);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 730, 491, 56);
		getContentPane().add(textField_4);
		setBackground(Color.BLUE);
		setBounds(100, 100, 798, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public Color getThisBackground() {
		return getBackground();
	}
	public void setThisBackground(Color background) {
		setBackground(background);
	}
}
