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
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class TemplateModifierForm extends JFrame {

	private JPanel background;
	
	
	 // Launch the application.
	 
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

	
	 // Create the frame.
	
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
		container.setBounds(91, 144, 615, 522);
		container.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Modifier le compte ");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(223, 72, 426, 29);
		background.add(lblNewLabel);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setForeground(Color.CYAN);
		btnValider.setFont(new Font("SansSerif", Font.BOLD, 30));
		btnValider.setBounds(318, 722, 151, 65);
		background.add(btnValider);
		
	}
	
	}
	
	class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	




     