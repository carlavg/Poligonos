import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double lado1;
		double lado2;
		double lado3;
		Triangulo unTriangulo = new Triangulo();		
		System.out.println("Ingrese la longitud del primer lado del triangulo");
		lado1 = entrada.nextDouble();
		unTriangulo.setLado1(lado1);
		System.out.println("Ingrese la longitud del segundo lado del triangulo");
		lado2 = entrada.nextDouble();
		unTriangulo.setLado2(lado2);
		System.out.println("Ingrese la longitud del tercer lado del triangulo");
		lado3 = entrada.nextDouble();
		unTriangulo.setLado3(lado3);
		System.out.println("Esta figura tiene " + unTriangulo.getCantidadDeLados() + " lados");
		System.out.println("El area del triangulo es: " + unTriangulo.getArea());
		System.out.println("El perimetro del triangulo es: " + unTriangulo.getPerimetro());

		double altura;
		double base;
		Rectangulo unRectangulo = new Rectangulo();
		System.out.println("Ingrese el alto del rectangulo");
		altura = entrada.nextDouble();
		unRectangulo.setLado1(altura);
		System.out.println("Ingrese el ancho del rectangulo");
		base = entrada.nextDouble();
		unRectangulo.setLado2(base);
		System.out.println("Esta figura tiene: " + unRectangulo.getCantidadDeLados() + " lados");
		System.out.println("El area del rectangulo es: " + unRectangulo.getArea());
		System.out.println("El perimetro del rectangulo es: " + unRectangulo.getPerimetro());

		double radio;
		Circulo unCirculo = new Circulo();
		System.out.println("Ingrese el radio del circulo:");
		radio = entrada.nextDouble();
		unCirculo.setRadio(radio);
		System.out.println("El area del circulo es: " + unCirculo.getArea());
		System.out.println("El perimetro del circulo es: " + unCirculo.getPerimetro());

		Pentagono unPentagono = new Pentagono();
		System.out.println("Ingrese el primer lado del Pentagono");
//		unPentagono.lado1 = entrada.nextDouble(); A los atributos de instancia se debe acceder solo por medio sus métodos getters y setters.
		unPentagono.setLado1(entrada.nextDouble());
		System.out.println("Ingrese el segundo lado del Pentagono");
//		unPentagono.lado2 = entrada.nextDouble(); A los atributos de instancia se debe acceder solo por medio sus métodos getters y setters.
		unPentagono.setLado2(entrada.nextDouble());
		System.out.println("Ingrese el tercer lado del Pentagono");
//		unPentagono.lado3 = entrada.nextDouble(); A los atributos de instancia se debe acceder solo por medio sus métodos getters y setters.
		unPentagono.setLado3(entrada.nextDouble());
		System.out.println("Ingrese el cuarto lado del Pentagono");
//		unPentagono.lado4 = entrada.nextDouble(); A los atributos de instancia se debe acceder solo por medio sus métodos getters y setters.
		unPentagono.setLado4(entrada.nextDouble());
		System.out.println("Ingrese el quinto lado del Pentagono");
//		unPentagono.lado5 = entrada.nextDouble(); A los atributos de instancia se debe acceder solo por medio sus métodos getters y setters.  
		unPentagono.setLado5(entrada.nextDouble());
		System.out.println("El pentagono tiene " + unPentagono.getCantidadDeLados() + " lados");
		System.out.println("El área de un pentagono se obtiene con una fórmula muy complicada como para escribirla acá");
		System.out.println("El perimetro del pentágono es: " + unPentagono.getPerimetro());
//	    System.out.println("El area del poligono de cinco lados es: " + ((5* lado1 )/ 2)); Esta fórmula solo contempla pentágonos de lados iguales    

	}

}
