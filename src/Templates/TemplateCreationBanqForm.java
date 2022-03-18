package Templates;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class TemplateCreationBanqForm extends JFrame {

//	private Image img_logo  = new ImageIcon(FrameLogin.class.getResource("img/bank.webp")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
//	private Image img_password  = new ImageIcon(FrameLogin.class.getResource("img/key.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
//	private Image img_username  = new ImageIcon(FrameLogin.class.getResource("img/user.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
//	private Image img_LogIn  = new ImageIcon(FrameLogin.class.getResource("img/padlock.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPanel pnlBtnLogin;
	private JLabel lblX;
	private JLabel lblIconLogo;
	private JLabel lblIconUsername;
	private JLabel lblIconPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemplateCreationBanqForm frame = new TemplateCreationBanqForm();
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
	public TemplateCreationBanqForm() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 205)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(178, 380, 250, 40);
		contentPane.add(panel);
		
		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(txtUsername);
		txtUsername.setAutoscrolls(false);
		txtUsername.setText("Username");
		txtUsername.setColumns(18);
		
		JLabel label = new JLabel("New label");
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(178, 484, 250, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.setBorder(null);
		txtPassword.setText("Password");
		txtPassword.setBounds(6, 6, 225, 28);
		panel_1.add(txtPassword);
		
		pnlBtnLogin = new JPanel();
		pnlBtnLogin.setBackground(new Color(0, 255, 255));
		pnlBtnLogin.setBounds(171, 583, 257, 40);
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 6, 141, 28);
		pnlBtnLogin.add(lblNewLabel);
		
		JLabel lblIconLogin = new JLabel("");
		lblIconLogin.setBounds(0, 0, 60, 40);
		lblIconLogin.setIcon(new ImageIcon(TemplateCreationBanqForm.class.getResource("/img/key.png")));;
		pnlBtnLogin.add(lblIconLogin);
		
		lblX = new JLabel("X");
		lblX.setBackground(new Color(255, 255, 255));
		lblX.setForeground(new Color(255, 0, 0));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(562, 6, 32, 16);
		contentPane.add(lblX);
		
		lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setIconTextGap(2);
		lblIconLogo.setBounds(133, 17, 329, 196);
		contentPane.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon(TemplateCreationBanqForm.class.getResource("/img/banq.png")));
		
		lblIconUsername = new JLabel("");
		lblIconUsername.setIcon(new ImageIcon(TemplateCreationBanqForm.class.getResource("/img/user.png")));
		lblIconUsername.setBounds(105, 371, 61, 60);
		contentPane.add(lblIconUsername);
		
		lblIconPassword = new JLabel("");
		lblIconPassword.setIcon(new ImageIcon(TemplateCreationBanqForm.class.getResource("/img/padlock.png")));
		lblIconPassword.setBounds(105, 484, 61, 52);
		contentPane.add(lblIconPassword);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_1.setBounds(218, 276, 153, 40);
		contentPane.add(lblNewLabel_1);
		setLocationRelativeTo(null);
	}
}
