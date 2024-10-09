package SistemaBancario;

public class ContaPoupanca implements ContaBancaria {
	private double saldo;
	private double taxaRendimento;
	
public ContaPoupanca(double taxaRendimento) {
	this.saldo = 0.0;
	this.taxaRendimento = taxaRendimento;
}

@Override
public void depositar(double valor) {
	saldo += valor;
	System.out.println("Depósito realizado na Conta Poupança. Novo Saldo: " + saldo);
}

@Override
public void sacar(double valor) {
	if(valor<= saldo) {
		saldo-= valor;
		System.out.println("Saque realizado na Conta Poupança. Novo Saldo: " + saldo);
	} else { 
		System.out.println("Saldo insuficiente na Conta Poupança");
	}	
}

@Override
public double consultarSaldo() {
	return saldo;}

public void aplicarRendimento() {
	saldo += saldo * taxaRendimento;
	System.out.println("Rendimento aplicado. Novo Saldo na Conta Poupança: " + saldo);}

}
