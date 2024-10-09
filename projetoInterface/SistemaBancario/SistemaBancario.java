package SistemaBancario;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class SistemaBancario {
    private JFrame frame;
    private ContaCorrente contaCorrente; 
    private ContaPoupanca contaPoupanca; 

    public SistemaBancario() {
        contaCorrente = new ContaCorrente(500.0);
        contaPoupanca = new ContaPoupanca(0.02); }

 
	private void prepararInterface() {
        frame = new JFrame("Sistema Bancário Solidário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setLayout(new GridLayout(3, 2, 10, 10)); 

        JButton btnDepositarCorrente = new JButton("Depositar na Conta Corrente");
        btnDepositarCorrente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valorStr = JOptionPane.showInputDialog("Digite o valor a depositar na Conta Corrente:");
                double valor = Double.parseDouble(valorStr);
                contaCorrente.depositar(valor);
            }
        });}}

