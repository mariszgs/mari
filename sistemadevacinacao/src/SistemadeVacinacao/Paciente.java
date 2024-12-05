package SistemadeVacinacao;

public class Paciente {
	private String nome;
	private String CPF;
	private String datadenasc;
	private String sexo;
	
public Paciente(String nome, String CPF, String datadenasc, String sexo) throws IllegalArgumentException {
	this.nome = nome;
	this.datadenasc = datadenasc;
	setCPF(CPF);
}

public void setCPF(String CPF) throws IllegalArgumentException {
	if(CPF.length() !=11 || !CPF.matches("\\d+")) {
		throw new IllegalArgumentException("O CPF deve conter exatamente 11 dígitos numéricos"); }
	this.CPF = CPF; }

public String getCPF() {
	return CPF;
}

public String getNome() {
	return nome;
}

public String getDatadenasc() {
	return datadenasc;
}

public String getSexo() {
	return sexo;
}


}
