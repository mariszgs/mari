package SistemadeVacinacao;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class InterfaceInicioFUNCIONARIO extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * SE O USUARIO DO LOGIN FOR FUNICONARIO (fulanodetal@func.com)
	 */
	public InterfaceInicioFUNCIONARIO(JFrame frame) {
		
		JButton btnNewButton = new JButton("cadastrar paciente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceCadastro painelCadastro = new InterfaceCadastro();
				frame.setContentPane(painelCadastro);
				frame.revalidate();
				frame.repaint();
			}
		});
		this.setLayout(null);
        btnNewButton.setBounds(150, 266, 150, 30);  
        this.add(btnNewButton);
        
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(148)
					.addComponent(btnNewButton)
					.addContainerGap(179, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(266, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		setLayout(groupLayout);
		
		
	}
	public static void main(String[] args) {
        JFrame frame = new JFrame("Tela Inicial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(694, 600);
        InterfaceInicioFUNCIONARIO painelFuncionario = new InterfaceInicioFUNCIONARIO(frame);
        frame.setContentPane(painelFuncionario);
        frame.setVisible(true);  
    }
}

