
public class rectangulo implements figuraGeométrica {
	
	private String nombre;
	private double base;
	private double altura;
	
	public rectangulo (String nombre, double base, double altura) {
		this.nombre =nombre;
		this.base=base;
		this.altura=altura;
	}

	@Override
	public double calculateArea() {
		return base * altura;
	}

	@Override
	public double calculatePerimetro() {
		return 2 * (base + altura);
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
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
		return "rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
	}
	
	
	

}//main
