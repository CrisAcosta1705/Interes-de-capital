package InteresDeCapital;
import java.util.Scanner;
public class InteresDeCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner tc = new Scanner(System.in);
		
		// Pedimos al usuario que ingrese el capital prestado
        System.out.println("Ingrese el capital prestado:");
        double capital = tc.nextDouble();
        
        // Verificamos si el capital es mayor que 10,000 dólares
        double tasa;
        if (capital > 10000) {
            // Si es mayor que 10,000 dólares, la tasa es del 7%
            tasa = 0.07;
        } else {
            // Si es menor o igual a 10,000 dólares, la tasa es del 6%
            tasa = 0.06;
        }
        
        // Calculamos el interés
        double interes = capital * tasa;
        
        // Imprimimos el capital y su interés
        System.out.println("El capital prestado es: $" + capital);
        System.out.println("El interés correspondiente es: $" + interes);
        
        // Cerramos el objeto Scanner
        tc.close();
	}

}
