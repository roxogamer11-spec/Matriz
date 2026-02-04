import java.util.Scanner;

public class Tareapor{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int i, num;
        float edad, prom=0;
        System.out.println("De cuantos estudiantes desea calcular el promedio de notas?");
        num= teclado.nextInt();

        for(i=1; i<=num; i++ ){
            System.out.println("============== Estudiante"+" "+ i + " "+"==============");
            do {
                System.out.println("Ingrese la nota del estudiante"+" "+ i +" "+ "(en números)");
                edad= teclado.nextFloat();
                if(edad < 0 || edad > 10){
                    System.out.println("La nota ingresada es incorrecta, Ingrese nuevamente:");   
                }
            } while(edad < 0 || edad > 10);
            prom= prom + edad;
        }
        System.out.println("El promedio de las notas de los "+" "+ num +" "+ "estudiantes es " + prom / num);
    }
}