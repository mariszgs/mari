package atv01;

public class produto {
	private String nome;
	private double preco;
	
public produto(String nome, double preco) {
   this.nome = nome;
   this.preco = preco;
   }

public void exibirInfo() {
	System.out.println("Produto: " + nome + "Preço: " + preco);
  }
}
