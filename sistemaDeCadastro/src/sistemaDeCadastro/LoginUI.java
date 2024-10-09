package sistemaDeCadastro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame {
private JTextField loginField;
private JPasswordField senhaField;

public LoginUI() {

setTitle("Tela de Login");
setSize(300, 150);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new GridLayout(3, 2, 5, 5));

add(new JLabel("Login:"));
loginField = new JTextField();
add(loginField);

add(new JLabel("Senha:"));
senhaField = new JPasswordField();
add(senhaField);

JButton entrarButton = new JButton("Entrar");
entrarButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
verificarCredenciais();
}
});
add(entrarButton);

JButton sairButton = new JButton("Sair");
sairButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
System.exit(0); 
}
});
add(sairButton);
}

private void verificarCredenciais() {
String login = loginField.getText();
String senha = new String(senhaField.getPassword());

if (login.equals("miguel") && senha.equals("123456")) {


JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
abrirTelaCadastro();
} else {

JOptionPane.showMessageDialog(this, "Login ou senha incorretos!", "Erro",
JOptionPane.ERROR_MESSAGE);
}
}

private void abrirTelaCadastro() {
CadastroAlunoUI cadastroUI = new CadastroAlunoUI();
cadastroUI.setVisible(true);
dispose();
}
}