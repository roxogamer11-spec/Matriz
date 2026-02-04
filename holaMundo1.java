import java.util.Scanner;
public class holaMundo1 {
    
    public static void main (String[] args){
    String nombresCompletos;
    boolean flag = true;
    
    Scanner entrada = new Scanner(System.in);
    nombresCompletos = entrada.nextLine();

    System.out.println("1 Hola Mundo " + nombresCompletos);
    System.out.println("2 Hola Mundo ");
    System.out.println(nombresCompletos);
    System.out.println("3 Hola Mundo " + nombresCompletos);
    
    if (flag) {
        System.out.println("Ingreso al if");
    } else {
        System.out.println("Ingreso al else");
        
    }
}
}