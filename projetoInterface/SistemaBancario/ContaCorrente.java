package SistemaBancario;

public class ContaCorrente implements ContaBancaria {
	private double saldo;
	private double limiteChequeEspecial;
	
public ContaCorrente(double limiteChequeEspecial) {
	this.saldo = 0.0;
	this.limiteChequeEspecial = limiteChequeEspecial;}
@Override
public void depositar(double valor) {
	saldo += valor;
	System.out.println("Depósito realizado na Conta Corrente. Novo Saldo: " + saldo);
}

@Override
public void sacar(double valor) {
	if(valor<=saldo + limiteChequeEspecial) {
		saldo-= valor;
		System.out.println("Saque realizado na Conta Corrente. Novo Saldo: " + saldo);
	} else {
		System.out.println("Saldo insuficiente na Conta Corrente");
	}	
}
@Override
public double consultarSaldo() {
	return saldo;
}

}
