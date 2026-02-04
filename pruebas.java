import java.util.Scanner;
public class pruebas {

public static void main(String[] args) {
    System.out.println("Operaciones con matrices 2x3");
    int[][] matrizA = new int[2][3];
    int[][] matrizB = new int[2][3];

    completarMatrices(matrizA, matrizB);
    procesos(matrizA, matrizB);
   
}

public static void completarMatrices(int[][] A, int[][] B){
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese los valores de la matriz A:");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("A[" + i + "][" + j + "]: ");
            A[i][j] = sc.nextInt();
        }
    }

    System.out.println("Ingrese los valores de la matriz B:");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("B[" + i + "][" + j + "]: ");
            B[i][j] = sc.nextInt();
        }
    }
}


public static void procesos(int[][] A, int[][] B) {
    int[][] sumaMatriz = new int[2][3];
    int[][] restaMatriz = new int[2][3];
    int[][] multiplicacionMatriz = new int[2][3];

    int i, j;
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 3; j++) {
            sumaMatriz[i][j] = A[i][j] + B[i][j];
            restaMatriz[i][j] = A[i][j] - B[i][j];
            multiplicacionMatriz[i][j] = A[i][j] * B[i][j];
        }
    }
     System.out.println("Resultado de la suma:");
    mostrarResultado(sumaMatriz);
    System.out.println("Resultado de la resta:");
    mostrarResultado(restaMatriz);
    System.out.println("Resultado de la multiplicación:");
    mostrarResultado(multiplicacionMatriz);
}

public static void mostrarResultado(int[][] matriz) {
    int i, j;
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
}
}
