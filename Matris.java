import java.util.Scanner;
public class Matris {

public static void main(String[] args) {
    System.out.println("Operaciones con matrices 2x3");
    int[][] matrizA = new int[2][3];
    int[][] matrizB = new int[2][3];

    completarMatrices(matrizA, matrizB);


    int[][] suma = sumaMatriz(matrizA, matrizB);
    int[][] resta = restaMatriz(matrizA, matrizB);
    int[][] multiplicacion = multiplicacionMatriz(matrizA, matrizB);

    System.out.println("Resultado de la suma:");
    mostrarResultado(suma);

    System.out.println("Resultado de la resta:");
    mostrarResultado(resta);

    System.out.println("Resultado de la multiplicación:");
    mostrarResultado(multiplicacion);
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


public static int[][] sumaMatriz(int[][] A, int[][] B) {
    int[][] resultado = new int[2][3];
    int i, j;
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 3; j++) {
            resultado[i][j] = A[i][j] + B[i][j];
        }
    }
    return resultado;
}

public static int[][] restaMatriz(int[][] A, int[][] B) {
    int[][] resultado = new int[2][3];
    int i, j;
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 3; j++) {
            resultado[i][j] = A[i][j] - B[i][j];
        }
    }
    return resultado;
}

public static int[][] multiplicacionMatriz(int[][] A, int[][] B) {
    int[][] resultado = new int[2][3];
    int i, j;
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 3; j++) {
            resultado[i][j] = A[i][j] * B[i][j];
        }
    }
    return resultado;
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
