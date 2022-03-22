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

public class TemplateCloturerForm extends JFrame {

	private JPanel background;

	
	 //Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemplateCloturerForm frame = new TemplateCloturerForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 //Create the frame.
	 
	public  TemplateCloturerForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 900);
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
		
	}
}