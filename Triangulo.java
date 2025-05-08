public class Triangulo implements figuraGeométrica{
    private String nombre;
    private double base;
    private double altura;
    private double lado;

    public Triangulo(String nombre, double base, double altura, double lado) {
        super();
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    } //constructor

    public double getBase() {
		return base;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double calculateArea() {	
		return (getBase() * getAltura()) / 2;
    } //calcularArea
    
    public double calculatePerimetro() {
    	return getLado()+ getLado () + getLado ();
    }//Calcular perimetro

  
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}
	
	
	
	
}// class Triangulo
