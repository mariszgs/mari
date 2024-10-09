package TESTE;

public class Main {
    public static void main(String[] args) {
      
        Aluno aluno1 = new Aluno("Carlos", 20, 8.5, 7.0, 9.0);

        
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());

        
        System.out.println("Média: " + aluno1.calcularMedia());

        
        if (aluno1.passou()) {
            System.out.println("O aluno passou.");
        } else {
            System.out.println("O aluno não passou.");
        }

    
        aluno1.setNota1(9.0);
        aluno1.setNota2(8.0);
        aluno1.setNota3(9.5);

      
        System.out.println("Nova Média: " + aluno1.calcularMedia());

        if (aluno1.passou()) {
            System.out.println("O aluno passou.");
        } else {
            System.out.println("O aluno não passou.");
        }
    }
}

