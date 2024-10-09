package atv01;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
public ContaBancaria(String titular, double saldo) {
	this.titular = titular;
	this.saldo = saldo;
  }

public void sacar(double valor) {
	if(saldo>=valor) {
		saldo-=valor;
	} else {
		System.out.println("Saldo Insuficiente");}
 }

public void depositar(double valor) {
	saldo+=valor;
}
 
public void exibirsaldo() {
	System.out.println("Titular: " + titular + ", Saldo: " + saldo); } 
}