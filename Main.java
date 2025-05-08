
public class Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo ("Triángulo", 20, 10, 15);
		cuadrado c1 = new cuadrado ("Cuadrado",10);
		rectangulo r1= new rectangulo ("Rectángulo", 10, 5);
		rombo ro1= new rombo ("Rombo", 10, 5, 8);
		romboide romb1= new romboide ("Romboide", 10, 8, 7);
		trapecio trap1=new trapecio ("Trapecio", 10.0, 5.0, 3.0, 4.0, 9.0);

	Main.imprimirCalculos(t1);
    Main.imprimirCalculos(c1);
	Main.imprimirCalculos(r1);
	Main.imprimirCalculos(ro1);
	Main.imprimirCalculos(romb1);
	Main.imprimirCalculos(trap1);

	
	}//main
	
	public static void imprimirCalculos(figuraGeométrica fg) {
		  System.out.println(fg);
	        System.out.println("+--------------------------------------------+");
	        System.out.println("| El área de [" + fg.getNombre() + "]");
	        System.out.println("| es " + fg.calculateArea());
	        System.out.println("| El perímetro de [" + fg.getNombre() + "]");
	        System.out.println("| es " + fg.calculatePerimetro());
	        System.out.println("+--------------------------------------------+");

		
	}//imprimirTriangulo

}//class mAIN
