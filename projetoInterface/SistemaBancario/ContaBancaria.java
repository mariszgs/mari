package SistemaBancario;

public interface ContaBancaria {
	void depositar(double valor);
	void sacar(double valor);
	double consultarSaldo();
}
