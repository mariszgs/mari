package SistemadeVacinacao;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class InterfaceCadastro2 extends JPanel {
	
	private JTextField nomeField;

	private static final long serialVersionUID = 1L;

	public InterfaceCadastro2(JFrame frame, JPanel painelCadastro) {
		
		JLabel lblVacinas = new JLabel("Painel de Vacinas");
        add(lblVacinas);
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		setBorder(BorderFactory.createTitledBorder("Cadastro de Pacientes"));
		setLayout(null);
		
		add(new JLabel("Nome:"));
		nomeField = new JTextField();
		add(nomeField);
		
		JLabel lblNewLabel = new JLabel("Vacinas:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblNewLabel.setBounds(30, 34, 117, 38);
		add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("BCG");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox.setBounds(30, 79, 136, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Hepatite B");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_1.setBounds(30, 105, 97, 23);
		add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Varicela");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_2.setBounds(30, 133, 97, 23);
		add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("DTPa");
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_3.setBounds(30, 159, 97, 23);
		add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("HIB");
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_4.setBounds(30, 185, 97, 23);
		add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Poliomielite");
		chckbxNewCheckBox_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_5.setBounds(30, 211, 97, 23);
		add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Pneumocócica ");
		chckbxNewCheckBox_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_6.setBounds(30, 237, 117, 18);
		add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Hepatite A");
		chckbxNewCheckBox_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_7.setBounds(30, 258, 97, 23);
		add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Rubéola, Sarampo e Caxumba");
		chckbxNewCheckBox_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_8.setBounds(195, 79, 207, 23);
		add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Meningocócica C");
		chckbxNewCheckBox_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_9.setBounds(195, 105, 136, 23);
		add(chckbxNewCheckBox_9);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(painelCadastro);
				frame.revalidate();
				frame.repaint();
			}
		});
		btnNewButton.setBounds(505, 509, 89, 23);
		add(btnNewButton);
	
		   frame.setVisible(true);
		 
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("CoronaVac");
		chckbxNewCheckBox_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox_10.setBounds(195, 131, 136, 23);
		add(chckbxNewCheckBox_10);



	}

	

}
