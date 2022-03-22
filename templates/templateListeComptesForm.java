package templates;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class templateListeComptesForm extends JFrame {

	private JPanel background;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					templateListeComptesForm frame = new templateListeComptesForm();
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
	public templateListeComptesForm() {
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
		container.setBounds(91, 250, 615, 616);
		background.add(container);
		
		JLabel lblTitle = new JLabel("Liste des comptes");
		lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitle.setForeground(Color.CYAN);
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblTitle.setBounds(241, 163, 312, 36);
		background.add(lblTitle);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setAutoscrolls(true);
		btnValider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnValider.setForeground(Color.CYAN);
		btnValider.setFont(new Font("SansSerif", Font.BOLD, 30));
		btnValider.setBackground(Color.CYAN);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnValider.setBounds(307, 886, 200, 80);
		background.add(btnValider);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 794, 68);
		background.add(panel);
		
		JButton btnOpenAccount = new JButton("Ouvrir un compte");
		btnOpenAccount.setVerticalAlignment(SwingConstants.BOTTOM);
		btnOpenAccount.setForeground(new Color(0, 0, 102));
		btnOpenAccount.setBorderPainted(false);
		panel.add(btnOpenAccount);
		
		JButton btnCreditAccount = new JButton("Créditer un compte");
		btnCreditAccount.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCreditAccount.setForeground(new Color(0, 0, 102));
		btnCreditAccount.setBorderPainted(false);
		btnCreditAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnCreditAccount);
		
		JButton btnDebitAccount = new JButton("Débiter un compte");
		btnDebitAccount.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDebitAccount.setForeground(new Color(0, 0, 102));
		btnDebitAccount.setBorderPainted(false);
		btnDebitAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnDebitAccount);
		
		JButton btnTransfertAccount = new JButton("Créditer un compte");
		btnTransfertAccount.setForeground(new Color(0, 0, 102));
		btnTransfertAccount.setBorderPainted(false);
		panel.add(btnTransfertAccount);
		
		JButton btnOpenaccount = new JButton("Modifier un compte");
		btnOpenaccount.setForeground(new Color(0, 0, 102));
		btnOpenaccount.setVerticalAlignment(SwingConstants.BOTTOM);
		btnOpenAccount.setBorderPainted(false);
		panel.add(btnOpenaccount);
		
		JButton btnCloseAccount = new JButton("Clôturer un compte");
		btnCloseAccount.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCloseAccount.setBorderPainted(false);
		panel.add(btnCloseAccount);
		
	
	}
}
