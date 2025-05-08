
public class cuadrado implements figuraGeométrica{
	private String nombre;
	private double lado;

	
	public cuadrado (String nombre, double lado) {
		this.nombre = nombre;
		this.lado=lado;
	}


	@Override
	public double calculateArea() {
		return lado*lado;
	}


	@Override
	public double calculatePerimetro() {
		return 4 * lado;
	}


	@Override
	public String getNombre() {
		return nombre;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}

	
	
}//main
