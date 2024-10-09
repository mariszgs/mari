package atv01;

public class retangulo {
	private double altura;
	private double largura;
	
	public retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
public double calcularArea() {
	return largura * altura;
  }
}
