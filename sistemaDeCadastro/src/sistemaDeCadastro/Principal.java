package sistemaDeCadastro;

public class Principal {
public static void main(String[] args) {

javax.swing.SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {

LoginUI loginUI = new LoginUI();
loginUI.setVisible(true);
}
});
}
}