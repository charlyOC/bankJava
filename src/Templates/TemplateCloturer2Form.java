package Templates;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;

public class TemplateCloturer2Form extends JFrame {

	private JPanel background;

	
	 //Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemplateCloturer2Form frame = new TemplateCloturer2Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 //Create the frame.
	 
	public  TemplateCloturer2Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 900);
		background = new JPanel();
		background.setBackground(new Color(0, 0, 102));
		background.setBorder (new LineBorder(new Color(0, 0, 0), 1, true));
		background.setLayout(null);
		setContentPane(background);
		
		JPanel container = new JPanel();
		container.setSize(615, 500);
		container.setLocation(91, 144);
		container.setForeground(new Color(0, 0, 139));
		container.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		container.setBackground(new Color(204, 255, 255));
		background.add(container, BorderLayout.CENTER);
		container.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cloturer le compte");
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
		
		JButton btnNewButton = new JButton("OUI");
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 30));
		btnNewButton.setBounds(150, 763, 123, 36);
		background.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NON");
		btnNewButton_1.setForeground(new Color(0, 255, 255));
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 30));
		btnNewButton_1.setBounds(564, 771, 99, 36);
		background.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Etes vous sur de cl\u00F4turer le compte ?");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 28));
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setBounds(169, 684, 511, 24);
		background.add(lblNewLabel_1);
		
	}
}