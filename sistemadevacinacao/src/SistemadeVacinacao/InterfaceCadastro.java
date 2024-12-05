package SistemadeVacinacao;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceCadastro extends JPanel {
	private JCheckBox infsaude1;
	private JCheckBox infsaude2;
	private JCheckBox infsaude3;
	private JCheckBox infsaude4;
	private JCheckBox infsaude5;
	private JTextField nomeField, CPFfield;
	private JTextField datadenascField;
	private JCheckBox mascBox;
	private JCheckBox femBox;
	private JCheckBox outroBox;
	private InterfaceCadastro2 painelVacinas;
	

	private static final long serialVersionUID = 1L;

	public InterfaceCadastro() {
		
		JFrame frame;
		frame = new JFrame("Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(694, 600);
        frame.getContentPane().setLayout(new CardLayout());

		JPanel painelCadastro = new JPanel();
		painelCadastro.setBorder(BorderFactory.createTitledBorder("Cadastro de Pacientes"));
		painelCadastro.setLayout(null);

		JLabel label_1 = new JLabel("Nome:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(141, 60, 53, 20);
		painelCadastro.add(label_1);
		nomeField = new JTextField();
		nomeField.setBounds(208, 56, 334, 33);
		painelCadastro.add(nomeField);
		
		JLabel label_2 = new JLabel("CPF (11 dígitos):");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(88, 106, 106, 18);
		painelCadastro.add(label_2);
		CPFfield = new JTextField();
		CPFfield.setBounds(208, 100, 334, 33);
		painelCadastro.add(CPFfield);
		
		JLabel label_3 = new JLabel("Data de Nascimento:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(59, 149, 139, 20);
		painelCadastro.add(label_3);
		datadenascField = new JTextField();
		datadenascField.setBounds(208, 144, 334, 33);
		painelCadastro.add(datadenascField);
		JPanel painelSexo = new JPanel();
		painelSexo.setBounds(208, 200, 224, 33);
		painelSexo.setLayout(new FlowLayout());
		mascBox = new JCheckBox("Masculino");
		femBox = new JCheckBox("Feminino");
		outroBox = new JCheckBox("Outro");
		
		painelSexo.add(mascBox);
		painelSexo.add(femBox);
		painelSexo.add(outroBox);
		painelCadastro.add(painelSexo);
		

		JLabel lblInformaesDeSade = new JLabel("Informações de Saúde:");
		lblInformaesDeSade.setBounds(10, 281, 187, 20);
		lblInformaesDeSade.setFont(new Font("Tahoma", Font.BOLD, 16));
		painelCadastro.add(lblInformaesDeSade);
		JPanel painelInfo = new JPanel();
		painelInfo.setBounds(208, 264, 334, 144);
		infsaude1 = new JCheckBox("Você possui alguma alergia?");
		infsaude1.setBounds(23, 5, 263, 23);
		infsaude2 = new JCheckBox("Você está grávida?");
		infsaude2.setBounds(23, 107, 236, 23);
		infsaude3 = new JCheckBox("Você tem algum problema de saúde crônico?");
		infsaude3.setBounds(23, 29, 343, 23);
		infsaude4 = new JCheckBox("Você está tomando algum medicamento?");
		infsaude4.setBounds(23, 81, 324, 23);
		infsaude5 = new JCheckBox("Você já foi vacinado recentemente?");
		infsaude5.setBounds(23, 55, 308, 23);
		painelInfo.setLayout(null);

		painelInfo.add(infsaude1);
		painelInfo.add(infsaude2);
		painelInfo.add(infsaude3);
		painelInfo.add(infsaude4);
		painelInfo.add(infsaude5);
		painelCadastro.add(painelInfo);
		
		JLabel labeL = new JLabel("Sexo:");
		labeL.setBounds(122, 200, 56, 20);
		labeL.setFont(new Font("Tahoma", Font.BOLD, 20));
		painelCadastro.add(labeL);
		
		JButton btnNewButton_1 = new JButton("Próximo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(painelVacinas);
                frame.revalidate();
                frame.repaint();
			}
		});
		btnNewButton_1.setBounds(505, 509, 89, 23);
		painelCadastro.add(btnNewButton_1);
		 painelVacinas = new InterfaceCadastro2(frame, painelCadastro);
		 
	frame.setContentPane(painelCadastro);
	   frame.setVisible(true);
	}
	 public static void main(String[] args) {
	        SwingUtilities.invokeLater(InterfaceCadastro::new);}

	public String getInfoSaude() {
		if(infsaude1.isSelected()) {
			return "Você possui alguma alergia?";
		} else if (infsaude2.isSelected()) {
			return "Você está grávida?";
		} else if (infsaude3.isSelected()) {
			return "Você tem algum problema de saúde crônico?";
		} else if (infsaude4.isSelected()) {
			return "Você está tomando algum medicamento?";
		} else if (infsaude5.isSelected()) {
			return "Você já foi vacinado recentemente?";
		} else {
		return null;}
	}
	
}
