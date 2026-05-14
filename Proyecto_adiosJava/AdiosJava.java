;
import java.util.Scanner;
public class AdiosJava {
    public static void main(String[] args){
        int numero1, numero2;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el primer numero:");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2 = scanner.nextInt();
        System.out.println("La suma de los dos numeros es:" + (numero1 + numero2));

    
       System.out.println("La resta de los dos numeros es: " + restar(numero1, numero2));
    }

    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }
}
