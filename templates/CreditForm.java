package templates;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;

public class CreditForm extends JFrame {

    private JPanel background;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CreditForm frame = new CreditForm();
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
        
        JButton btnValider = new JButton("Valider");
        btnValider.setBounds(178, 511, 200, 80);
        container.add(btnValider);
        btnValider.setBackground(Color.CYAN);
        btnValider.setForeground(Color.LIGHT_GRAY);
        btnValider.setFont(new Font("SansSerif", Font.BOLD, 30));
        
        JLabel lblNewLabel = new JLabel("Créditer un compte");
        lblNewLabel.setForeground(new Color(0, 255, 255));
        lblNewLabel.setBounds(241, 56, 312, 36);
        background.add(lblNewLabel);
        lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
        
    }
}