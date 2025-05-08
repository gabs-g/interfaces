
public class romboide implements figuraGeométrica {

	private String nombre;
	private double ladoA;
	private double ladoB;
	private double altura;
	
	public romboide (String nombre, double ladoA, double ladoB, double altura) {
		this.nombre= nombre;
		this.ladoA= ladoA;
		this.ladoB= ladoB;
		this.altura=altura;
	}

	@Override
	public double calculateArea() {
		return ladoA * altura;
	}

	@Override
	public double calculatePerimetro() {
		return 2 * (ladoA + ladoB);
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "romboide [nombre=" + nombre + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", altura=" + altura + "]";
	}
	
	
}//class romboide
