package sistemaDeCadastro;

public class Aluno {
	private static int contadorMatricula = 1000;
	private String nome;
	private String matricula;
	private String curso;
	private String cpf;
	private boolean cursoAtivo;
	private boolean cursoTrancado;
	
public Aluno(String nome, String cpf, String curso) throws IllegalArgumentException {
	this.nome = nome;
	this.matricula = gerarMatricula();
	this.curso = curso;
	setCpf(cpf);
	this.cursoAtivo = true;
	this.cursoTrancado = false; }

private String gerarMatricula() {
	return String.valueOf(contadorMatricula++);}

public void setCpf(String cpf) throws IllegalArgumentException {
	if(cpf.length() !=11 || !cpf.matches("\\d+")) {
		throw new IllegalArgumentException("O CPF deve conter exatamente 11 dígitos numéricos"); }
	this.cpf = cpf; }

public String getCpf() {
	return cpf;
}

public String getNome() {
	return nome;
}

public String getMatricula() {
	return matricula;
}

public String getCurso() {
	return curso;
}

public boolean isCursoAtivo() {
	return cursoAtivo;
}

public void ativarCurso() {
	this.cursoAtivo = true;
	this.cursoTrancado = false;
}

public boolean isCursoTrancado() {
	return cursoTrancado;
}

public void trancarCurso() {
	this.cursoTrancado = true;
	this.cursoAtivo = false;
}

@Override
public String toString() {
	String statusCurso = cursoAtivo ? "Ativo" : cursoTrancado ? "Trancado" : "Indefinido";
	return "Aluno[Nome: " + nome + ", Matrícula: " + matricula + ", CPF: " + cpf + ", Curso: " + curso +
			", Status do Curso: " + statusCurso + "]";
}
}
