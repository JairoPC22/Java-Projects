package codigo;
import java.util.Scanner;

public class Solucion {
	

		
	float a, b, c;
	double x1, x2, dis;
	
	public Solucion() {}
	
	public Solucion(float a, float b, float c, double x1, double x2, double dis) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.x1 = x1;
		this.x2 = x2;
		this.dis = dis;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getDis() {
		return dis;
	}

	public void setDis(double dis) {
		this.dis = dis;
	}

	@Override
	public String toString() {
		return "Solucion [a=" + a + ", b=" + b + ", c=" + c + ", x1=" + x1 + ", x2=" + x2 + ", dis=" + dis + "]";
	}
	
	
	

}
