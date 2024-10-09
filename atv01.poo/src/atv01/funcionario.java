package atv01;

public class funcionario {
	private String nome;
	private double salario;

public funcionario(String nome, double salario) {
	this.nome = nome;
	this.salario = salario;
}

public void aumentarSalario(double percentual) {
	salario += salario * percentual / 100;
	}

public void exibirDados() {
	System.out.println("Nome: " + nome + "Salário: " + salario);
    }
}
