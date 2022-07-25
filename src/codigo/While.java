package codigo;

import java.security.Principal;
import java.util.Scanner;
public class While {
	public void acceso() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Es correcto el resultado?: " 
		+ "\n0. Si" 
		+ "\n1. No, quiero volver a iniciar");
		int opcion = scanner.nextInt();

		while (opcion != 0 || opcion != 0) {
			Prinicipal.calcular();

			opcion = scanner.nextInt();
		}
		System.out.println("Gracias por usarme, ten un buen dia"
				+"\n:)"
				+"\nEl programa ha finalizado....");
	}

}
