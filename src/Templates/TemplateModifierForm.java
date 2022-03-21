package Templates;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class TemplateModifierForm extends JFrame {

	private JPanel background;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemplateModifierForm frame = new TemplateModifierForm();
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
	public TemplateModifierForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 1000);
		background = new JPanel();
		background.setBackground(new Color(0, 0, 102));
		background.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(background);
		background.setLayout(null);
		
		JPanel container = new JPanel();
		container.setBackground(Color.CYAN);
		background.add(container);
		container.setBackground(new Color(204, 255, 255));
		container.setBounds(91, 144, 615, 722);
		container.setLayout(null);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setForeground(Color.CYAN);
		btnValider.setFont(new Font("SansSerif", Font.BOLD, 30));
		btnValider.setBackground(Color.CYAN);
		btnValider.setBounds(313, 878, 200, 80);
		background.add(btnValider);
		
		JLabel lblNewLabel = new JLabel(" Modifier le compte ");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(223, 72, 304, 29);
		background.add(lblNewLabel);
		
	}
}