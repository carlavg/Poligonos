import java.io.Serializable;

public abstract class Poligono {
	
	private int cantidadDeLados;

	public Poligono() {
	}

	public Poligono(int cantidadDeLados) {
		this.setCantidadDeLados(cantidadDeLados);
	}
	
	@Override
	public String toString() {
		return "CantidadDeLados: " + this.getCantidadDeLados();
	}

	abstract public double getArea();
	
	abstract public double getPerimetro();
	
	public int getCantidadDeLados() {
		return cantidadDeLados;
	}

	public void setCantidadDeLados(int cantidadDeLados) {
		this.cantidadDeLados = cantidadDeLados;
	}
}