package atv01;

public class pessoa {
	private String nome;
	private int idade;
	
public pessoa(String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
}

public void apresentar() {
	System.out.println("Olá, meu nome é " + nome + "e eu tenho " + idade + "anos");}

}
