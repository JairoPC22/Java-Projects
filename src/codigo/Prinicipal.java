package codigo;

import java.util.Scanner;
import java.math.*;

public class Prinicipal {

	public static void main(String[]args){
		System.out.println("Programa para resolver ecuaciones cuadraticas");
		calcular();
	}
	
	public static void calcular() {
		
		Solucion solucion = new Solucion ();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese los valores de la ecuacion cuadratica a solucionar");
		
		System.out.println("Ingrese el coeficiente de 'ax°2': ");
		float a = teclado.nextFloat();
		solucion.setA(a);
		
		System.out.println("Ingrese el coeficiente de 'bx': ");
		float b = teclado.nextFloat();
		solucion.setB(b);
		
		System.out.println("Ingrese el coeficiente de 'c': ");
		float c = teclado.nextFloat();
		solucion.setC(c);
		/*
		System.out.println("\n\na: " + solucion.getA()+ "\nb: "  + solucion.getB() + "\nc: " + solucion.getC());
		*/
		
		double dis = 0;
		
		dis = Math.sqrt((Math.pow(solucion.getB(),2)) - (4*solucion.getA()*solucion.getC()));
		
		System.out.println(dis);
		
		double x1 = ((-b + dis) / (2 * a));
		double x2 = ((-b - dis) / (2 * a));
		
		// Si condicional para validar el discriminante
		
		if (dis >0) {
			System.out.println("La ecuacion tiene dos soluciones");
			System.out.println("\nx1 = " + x1 + "\nx2= "+ x2);
		} else  if (dis == 0){
			System.out.println("La ecuacion tiene una solucion");
			System.out.println("\nx1 = " + x1);
		} else {
			System.out.println("No tiene solucion (El discriminante es menor que cero)");
		}
		While mientras = new While();
		mientras.acceso();

		
		
				
	}

}