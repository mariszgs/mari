package TESTE;

public class Aluno {
    
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double nota3;

    
    public Aluno(String nome, int idade, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

   
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    
    public boolean passou() {
        return calcularMedia() >= 7.0;
    }
}
