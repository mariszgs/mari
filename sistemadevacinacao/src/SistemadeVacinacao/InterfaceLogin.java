package SistemadeVacinacao;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceLogin extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;
	
	public InterfaceLogin() {
		 
		JLabel lblNewLabelLOGIN = new JLabel("LOGIN:");
		lblNewLabelLOGIN.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabelLOGIN.setBounds(138, 82, 54, 34);
		
		textField = new JTextField();
		textField.setBounds(185, 90, 86, 20);
		textField.setColumns(10);
		setLayout(null);
		
		JLabel lblNewLabel_SENHA = new JLabel("SENHA:");
		lblNewLabel_SENHA.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_SENHA.setBounds(138, 119, 54, 34);
		add(lblNewLabel_SENHA);
		add(lblNewLabelLOGIN);
		add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(185, 127, 86, 20);
		add(passwordField);
		
		JLabel lblNewLabelTITULO = new JLabel("SISTEMA DE VACINAÇÃO");
		lblNewLabelTITULO.setForeground(new Color(0, 0, 0));
		lblNewLabelTITULO.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblNewLabelTITULO.setBounds(125, 0, 216, 64);
		add(lblNewLabelTITULO);
		
		JButton btnNewButtonentrar = new JButton("entrar");
		btnNewButtonentrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
/**
* se usuario for @adm, levara pra InterfaceInicioADM, se for @func, levara pra InterfaceInicioFUNCIONARIO
*/
			}
		});
		btnNewButtonentrar.setBackground(new Color(255, 255, 255));
		btnNewButtonentrar.setForeground(new Color(0, 0, 0));
		btnNewButtonentrar.setBounds(182, 193, 89, 23);
		add(btnNewButtonentrar);
		
		
		JLabel lblNewLabel = new JLabel("recuperar");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel.setBounds(202, 227, 54, 14);
		add(lblNewLabel);
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Sistema de Vacinação - Login");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(400, 300);  

				InterfaceLogin painelLogin = new InterfaceLogin();
				frame.setContentPane(painelLogin);

				frame.setVisible(true);
			}
		});
	}
}
