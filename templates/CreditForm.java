package templates;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import compte.Compte;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.JTextField;

public class CreditForm extends JFrame {

    private JPanel background;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
// Il y a un probleme avec cette frame car il n'y a aucun getContentPane
    // On ne peut donc pas intéragir avec...

    /**
     * Create the frame.
     */
    public CreditForm() {
    	background = new JPanel();
    	background.setBounds(new Rectangle(100, 100, 800, 1000));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 1000);
     
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
        
        // J'ai du modifier le nom de ce bouton pour que la méthode marche
        JButton btnNewButton = new JButton("Valider");
        btnNewButton.setBounds(221, 502, 200, 80);
        btnNewButton.setBackground(Color.CYAN);
        btnNewButton.setForeground(Color.LIGHT_GRAY);
        btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 30));
        getContentPane().add(btnNewButton);
        
        textField = new JTextField();
        textField.setBounds(141, 482, 361, 57);
        container.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Montant \u00E0 cr\u00E9diter");
        lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 28));
        lblNewLabel_1.setBounds(197, 399, 248, 44);
        container.add(lblNewLabel_1);
        
        textField_1 = new JTextField();
        textField_1.setBounds(141, 200, 353, 57);
        container.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Compte \u00E0 cr\u00E9diter");
        lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 28));
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setBounds(197, 104, 241, 44);
        container.add(lblNewLabel_2);
        
        JLabel lblNewLabel = new JLabel("Créditer un compte");
        lblNewLabel.setForeground(new Color(0, 255, 255));
        lblNewLabel.setBounds(255, 54, 312, 36);
        background.add(lblNewLabel);
        lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
        
//        btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//        	
//				Num Montant = Number parse(textField.getText());
//				
//        	try {
//        		CreditCourant.CrediterCourant(double montant, Compte compte)
//        			
//        		}catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//        	}
//        	
//        })
//        
//    }

    }
}