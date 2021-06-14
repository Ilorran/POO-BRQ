
public class exercicio {
	static int deci;
	private double Raio;
	private double Base;
	private double Altura;
	private double Perimetro;
	private double Area;
	
	public double getRaio() {
		return Raio;
	}
	public double getBase() {
		return Base;
	}
	public double getAltura() {
		return Altura;
	}
	public void setRaio(double raio) {
		this.Raio = raio;
	}
	public void setBase(int base) {
		this.Base = base;
	}
	public void setAltura(int altura) {
		this.Altura = altura;
	}
	public double getPerimetro() {
		if(deci == 2){
		return Perimetro = Base + Altura + Math.sqrt(((Base * Base) + (Altura * Altura)));
		}
		else {
			return Perimetro = 2 * 3.14 * Raio;
		}
	}
	public double getArea() {
		if(deci == 1) {
			return Area = 3.14 * Raio * Raio;
		}
		return Area = (Base * Altura) / 2;
	}
	public void setPerimetro(double perimetro) {
		this.Perimetro = perimetro;
	}
	public void setArea(double area) {
		this.Area = area;
	}
	
	
}
