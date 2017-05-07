package pack;

public class Corredor {

	private int edad;
	private char sexo;
	private int numeroCorredor;
	private int numerocategoria;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public int getNumeroCorredor() {
		return numeroCorredor;
	}
	public void setNumeroCorredor(int numeroCorredor) {
		this.numeroCorredor = numeroCorredor;
	}
	
	public int getNumerocategoria() {
		return numerocategoria;
	}
	public void setNumerocategoria(int numerocategoria) {
		this.numerocategoria = numerocategoria;
	}
	
	public Corredor(int edad, char sexo, int numeroCorredor, int numerocategoria) {
		super();
		this.edad = edad;
		this.sexo = sexo;
		this.numeroCorredor = numeroCorredor;
		this.numerocategoria = numerocategoria;
	}
	
}
