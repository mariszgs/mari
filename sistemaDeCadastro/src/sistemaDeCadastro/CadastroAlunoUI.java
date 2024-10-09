package sistemaDeCadastro;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroAlunoUI extends JFrame {
private AlunoDAO alunoDAO;
private JTextField nomeField, cpfField;
private JComboBox<String> cursoComboBox;
private JTextField buscaField;
private JTextArea areaAlunosCadastrados; 

private JCheckBox masculinoBox;
private JCheckBox femininoBox;
private JCheckBox outroBox;

private String caminhoImagemFundo = "/imagens/Alex_and_Jader_Magical_Forest.jpg";

public CadastroAlunoUI() {

alunoDAO = new AlunoDAO();

setTitle("Sistema de Cadastro de Alunos");
setSize(600, 700);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new BorderLayout(10, 10)); 

JPanel painelCadastro = new JPanel();
painelCadastro.setBorder(BorderFactory.createTitledBorder("Cadastro de Alunos"));
painelCadastro.setLayout(new GridLayout(6, 2, 5, 5));

painelCadastro.add(new JLabel("Nome:"));
nomeField = new JTextField();
painelCadastro.add(nomeField);

painelCadastro.add(new JLabel("CPF (11 dígitos):"));
cpfField = new JTextField();
painelCadastro.add(cpfField);

painelCadastro.add(new JLabel("Sexo:"));
JPanel painelSexo = new JPanel();
painelSexo.setLayout(new FlowLayout());
masculinoBox = new JCheckBox("Masculino");
femininoBox = new JCheckBox("Feminino");
outroBox = new JCheckBox("Outro");

painelSexo.add(masculinoBox);
painelSexo.add(femininoBox);
painelSexo.add(outroBox);
painelCadastro.add(painelSexo);

painelCadastro.add(new JLabel("Curso:"));
cursoComboBox = new JComboBox<>(getCursos());
painelCadastro.add(cursoComboBox);

JButton cadastrarButton = new JButton("Cadastrar Aluno");
cadastrarButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
cadastrarAluno();
}
});
painelCadastro.add(cadastrarButton);

add(painelCadastro, BorderLayout.NORTH);

areaAlunosCadastrados = new JTextArea();
areaAlunosCadastrados.setEditable(false);
JScrollPane scrollPane = new JScrollPane(areaAlunosCadastrados);
scrollPane.setBorder(BorderFactory.createTitledBorder("Alunos Cadastrados"));
add(scrollPane, BorderLayout.CENTER);

JPanel painelAcoes = new JPanel();
painelAcoes.setBorder(BorderFactory.createTitledBorder("Ações"));
painelAcoes.setLayout(new GridLayout(3, 2, 5, 5));

painelAcoes.add(new JLabel("Buscar por Matrícula ou CPF:"));
buscaField = new JTextField();
painelAcoes.add(buscaField);

JButton pesquisarButton = new JButton("Pesquisar");
pesquisarButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
localizarAluno(); 
}
});
painelAcoes.add(pesquisarButton);

JButton listarButton = new JButton("Listar Alunos Cadastrados");
listarButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
listarAlunos(); 
}
});
painelAcoes.add(listarButton);


JButton sairButton = new JButton("Sair");
sairButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
System.exit(0); 
}
});
painelAcoes.add(sairButton);

add(painelAcoes, BorderLayout.SOUTH);

((JComponent) getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));
}

private void cadastrarAluno() {
String nome = nomeField.getText();
String cpf = cpfField.getText();
String curso = (String) cursoComboBox.getSelectedItem();

String sexo = getSexoSelecionado();
if (sexo == null) {
JOptionPane.showMessageDialog(this, "Por favor, selecione uma opção de sexo!", "Erro",
JOptionPane.ERROR_MESSAGE);
return;
}
try {

Aluno aluno = new Aluno(nome, cpf, curso);
alunoDAO.adicionarAluno(aluno);

nomeField.setText("");
cpfField.setText("");
cursoComboBox.setSelectedIndex(0); 

masculinoBox.setSelected(false);
femininoBox.setSelected(false);
outroBox.setSelected(false);
JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
} catch (IllegalArgumentException e) {

JOptionPane.showMessageDialog(this, e.getMessage(), "Erro",
JOptionPane.ERROR_MESSAGE);
}
}

private String getSexoSelecionado() {
if (masculinoBox.isSelected()) {
return "Masculino";
} else if (femininoBox.isSelected()) {
return "Feminino";
} else if (outroBox.isSelected()) {
return "Outro";

} else {
return null; 
}
}

private void localizarAluno() {
String busca = buscaField.getText();
Aluno aluno = null;

if (busca.matches("\\d+")) {
aluno = buscarAlunoPorMatricula(busca);
}

if (aluno == null && busca.length() == 11) {
aluno = buscarAlunoPorCpf(busca);
}

if (aluno != null) {
JOptionPane.showMessageDialog(this, aluno.toString(), "Aluno Encontrado",
JOptionPane.INFORMATION_MESSAGE);
} else {
JOptionPane.showMessageDialog(this, "Aluno não encontrado!", "Erro",
JOptionPane.ERROR_MESSAGE);
}
}

private Aluno buscarAlunoPorMatricula(String matricula) {
for (Aluno aluno : alunoDAO.listarAlunos()) {
if (aluno.getMatricula().equals(matricula)) {
return aluno;
}
}
return null;
}

private Aluno buscarAlunoPorCpf(String cpf) {
for (Aluno aluno : alunoDAO.listarAlunos()) {
if (aluno.getCpf().equals(cpf)) {
return aluno;
}
}
return null;
}

private void listarAlunos() {
areaAlunosCadastrados.setText(""); 
for (Aluno aluno : alunoDAO.listarAlunos()) {
areaAlunosCadastrados.append(aluno.toString() + "\n"); 
}
}

private String[] getCursos() {

return new String[]{
"Ciência da Computação",
"Engenharia de Software",
"Sistemas de Informação",
"Análise e Desenvolvimento de Sistemas",
"Engenharia Elétrica",
"Engenharia Civil",
"Administração",
"Direito",
"Medicina",
"Enfermagem"
};
}

class PainelComImagem extends JPanel {
private Image imagemFundo;

public PainelComImagem() {
try {

imagemFundo = new
ImageIcon(getClass().getResource(caminhoImagemFundo)).getImage();
} catch (Exception e) {

System.err.println("Erro ao carregar a imagem de fundo: " + e.getMessage());
imagemFundo = null; 
}
}
@Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);
if (imagemFundo != null) {

g.drawImage(imagemFundo, 0, 0, getWidth(), getHeight(), this);
}
}
}
}
