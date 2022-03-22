package Templates;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TransfertokForm extends JFrame {

	private JPanel background;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransfertokForm frame = new TransfertokForm();
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
	public TransfertokForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 1000);
		background = new JPanel();
		background.setBackground(new Color(0, 0, 102));
		background.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(background);
		background.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Le Transfert a été effectué  ");
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(5, 5, 774, 904);
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		background.add(lblNewLabel);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setForeground(Color.CYAN);
		btnValider.setFont(new Font("SansSerif", Font.BOLD, 30));
		btnValider.setBounds(340, 892, 198, 47);
		background.add(btnValider);
	}
	
}