package Templates;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

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
		
		JPanel navBackground = new JPanel();
		navBackground.setBackground(Color.CYAN);
		navBackground.setBounds(0, 0, 794, 68);
		background.add(navBackground);
		
		JButton btnOpenAccount = new JButton("Ouvrir un compte");
		btnOpenAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				templateOuvrirCompteForm tocf = new templateOuvrirCompteForm();
				tocf.show();
				dispose();
			}
		});
		btnOpenAccount.setVerticalAlignment(SwingConstants.BOTTOM);
		btnOpenAccount.setForeground(new Color(0, 0, 102));
		btnOpenAccount.setBorderPainted(false);
		navBackground.add(btnOpenAccount);
		
		JButton btnCreditAccount = new JButton("Créditer un compte");
		btnCreditAccount.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCreditAccount.setForeground(new Color(0, 0, 102));
		btnCreditAccount.setBorderPainted(false);
		btnCreditAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreditForm cf = new CreditForm();
				cf.show();
				dispose();
			}
		});
		navBackground.add(btnCreditAccount);
		
		JButton btnDebitAccount = new JButton("Débiter un compte");
		btnDebitAccount.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDebitAccount.setForeground(new Color(0, 0, 102));
		btnDebitAccount.setBorderPainted(false);
		btnDebitAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DebitForm df = new DebitForm();
				df.show();
				dispose();
					
			}
		});
		navBackground.add(btnDebitAccount);
		
		JButton btnTransfertAccount = new JButton("Transferts");
		btnTransfertAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransfertForm tff = new TransfertForm();
				tff.show();
				dispose();
			}
		});
		btnTransfertAccount.setVerticalAlignment(SwingConstants.BOTTOM);
		btnTransfertAccount.setForeground(new Color(0, 0, 102));
		btnTransfertAccount.setBorderPainted(false);
		navBackground.add(btnTransfertAccount);
		
		JButton btnOpenaccount = new JButton("Modifier un compte");
		btnOpenaccount.setBackground(Color.CYAN);
		btnOpenaccount.setBorder(null);
		btnOpenaccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TemplateModifierForm tmform = new TemplateModifierForm();
				tmform.show();
				dispose();
			}
		});
		btnOpenaccount.setForeground(new Color(0, 0, 102));
		btnOpenaccount.setVerticalAlignment(SwingConstants.BOTTOM);
		btnOpenAccount.setBorderPainted(false);
		navBackground.add(btnOpenaccount);
		
		JButton btnCloseAccount = new JButton("Clôturer un compte");
		btnCloseAccount.setBackground(Color.CYAN);
		btnCloseAccount.setBorder(null);
		btnCloseAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TemplateCloturerForm tcform = new TemplateCloturerForm();
				tcform.show();
				dispose();			}
		});
		btnCloseAccount.setForeground(new Color(0, 0, 102));
		btnCloseAccount.setVerticalAlignment(SwingConstants.BOTTOM);
		navBackground.add(btnCloseAccount);
		
	
	}
}
