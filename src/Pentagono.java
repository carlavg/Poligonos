public class Pentagono extends Poligono {

//	public double lado1;
//	public double lado2;
//	public double lado3;
//	public double lado4;
//	public double lado5; Los atributos de instancia deben ser private, solo accesibles desde los metodos getter y setter, que si serán public

	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double lado5;

	public Pentagono() {
		super(5);
	}

	public Pentagono(double lado1, double lado2, double lado3, double lado4, double lado5) {
		super(5);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.lado5 = lado5;
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getPerimetro() {
		return this.lado1 + this.lado2 + this.lado3 + this.lado4 + this.lado5;
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

	public double getLado5() {
		return lado5;
	}

	public void setLado5(double lado5) {
		this.lado5 = lado5;
	}

}
