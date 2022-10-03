package distanciaEuclidea;

public class Punto implements IPunto {

	private double x, y;

	public Punto(double x, double y) {

		this.x = x;
		this.y = y;
	}

	@Override
	public double getX() {

		return x;
	}

	@Override
	public double getY() {

		return y;
	}

	@Override
	public double distanciaEuclidea(IPunto p) {

		double distanciaEuclidea = Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + (Math.pow(this.getY() - p.getY(), 2)));

		return distanciaEuclidea;
	}

	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}

}
