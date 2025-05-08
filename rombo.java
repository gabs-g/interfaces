
public class rombo implements figuraGeométrica{
	private String nombre;
	private double diagonalMayor;
	private double diagonalMenor;
	private double lado;
	
	public rombo (String nombre, double diagonalMayor, double diagonalMenor, double lado) {
		this.nombre= nombre;
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor= diagonalMenor;
		this.lado= lado;
	}

	@Override
	public double calculateArea() {
		return (diagonalMayor * diagonalMenor)/2;
	}

	@Override
	public double calculatePerimetro() {
		return 4 * lado;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public double getDiagonalMayor() {
		return diagonalMayor;
	}

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
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
		return "rombo [nombre=" + nombre + ", diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor
				+ ", lado=" + lado + "]";
	}
	
	
	
}//main
