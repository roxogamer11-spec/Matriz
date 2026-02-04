import java.util.Scanner;
public class tarea2 {
    public static void main(String[] args) {
        int salirio, añosTrabajados, aumento1, aumento2, aumento3, aumento4, aumento5, aumento6, aumento7;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su salario:");
        salirio = entrada.nextInt();
        System.out.println("Ingrese sus años trabajados:");
        añosTrabajados = entrada.nextInt();
        entrada.close();

        if (añosTrabajados < 5) {
            aumento1= (int)(salirio * 0.05);
           System.out.println("Su aumento es de: " + aumento1);}
         if (añosTrabajados >= 5 && añosTrabajados <= 10) {
            aumento2= (int)(salirio * 0.10);
        System.out.println("Su aumento es de: " + aumento2);}
         if (añosTrabajados >= 10 && añosTrabajados <= 15) {
            aumento3= (int)(salirio * 0.15);
        System.out.println("Su aumento es de: " + aumento3);}
         if (añosTrabajados >= 15 && añosTrabajados <= 20) {
            aumento4= (int)(salirio * 0.20);
        System.out.println("Su aumento es de: " + aumento4);}
         if (añosTrabajados >= 20 && añosTrabajados <= 25) {
            aumento5= (int)(salirio * 0.25);
        System.out.println("Su aumento es de: " + aumento5);}
         if (añosTrabajados >= 25 && añosTrabajados <= 30) {
            aumento6= (int)(salirio * 0.35);
        System.out.println("Su aumento es de: " + aumento6);}
         if (añosTrabajados >= 30) {
            aumento6= (int)(salirio * 0.35);
        System.out.println("Su aumento es de: " + aumento6);}
         if (añosTrabajados >= 30) {
            aumento7= (int)(salirio * 0.50);
        System.out.println("Su aumento es de: " + aumento7);}
    }
}