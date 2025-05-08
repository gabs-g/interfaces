
public class trapecio implements figuraGeométrica {
	private String nombre;
	private  double baseMayor;
	private  double baseMenor;
	private  double altura;
	private  double ladoIzquierdo;
	private  double ladoDerecho;

	public trapecio (String nombre, double baseMayor, double baseMenor, double altura, double ladoIzquierdo, double ladoDerecho) {
		this.nombre= nombre;
		this.baseMayor= baseMayor;
		this.baseMenor = baseMenor;
		this.altura= altura;
		this.ladoIzquierdo= ladoIzquierdo;
		this.ladoDerecho= ladoDerecho;
	}

	@Override
	public double calculateArea() {
		return ((baseMayor + baseMenor)/2)*altura;
	}

	@Override
	public double calculatePerimetro() {
		return baseMayor + baseMenor + ladoIzquierdo + ladoDerecho;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public double getBaseMayor() {
		return baseMayor;
	}

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLadoIzquierdo() {
		return ladoIzquierdo;
	}

	public void setLadoIzquierdo(double ladoIzquierdo) {
		this.ladoIzquierdo = ladoIzquierdo;
	}

	public double getLadoDerecho() {
		return ladoDerecho;
	}

	public void setLadoDerecho(double ladoDerecho) {
		this.ladoDerecho = ladoDerecho;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "trapecio [nombre=" + nombre + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura="
				+ altura + ", ladoIzquierdo=" + ladoIzquierdo + ", ladoDerecho=" + ladoDerecho + "]";
	}
	
	
	
	
}//class trapecio
