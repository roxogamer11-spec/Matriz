import java.util.Scanner;

public class parimpar {
    public static void main (String[] args){
        int numero;
        
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese un numero entero: ");
        numero = entrada.nextInt();
        entrada.close();
        
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
    }
}
