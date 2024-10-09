package atv01;

public class livro {
	private String titulo;
	private String autor;
	
public livro(String titulo, String autor) {
	this.titulo = titulo;
	this.autor = autor;
	
}

public void exibirInfo() {
	System.out.println("Título: " + titulo + ", Autor: " + autor);
  }
}
