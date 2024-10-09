package atv01;

public class carro {
	private String marca;
	private String modelo;
	
public carro(String marca, String modelo) {
	this.marca = marca;
	this.modelo = modelo;
}

public void mostrarDados() { 
System.out.println("Marca: " + marca + ", Modelo: " + modelo); } 

}
