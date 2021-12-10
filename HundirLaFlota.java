import java.util.Scanner;

public class HundirLaFlota {

    //CREAMOS LOS 1 DE FORMA ALEATORIA PARA INDICAR LAS POSICIONES DE LOS BARCOS.
    public static void crearBarcos(int numBarcos, int[][] plazasBarco) {
        int r1, r2;
        int cont = 0;
        //Transformamos posiciones aleatoria en el tablero, en 1 para indicar que hay un barco.
        while (cont < numBarcos) {
            r1 = (int) (Math.random()*8); 
            r2 = (int) (Math.random()*8);
            if (plazasBarco[r1][r2] != 1) {
                plazasBarco[r1][r2]=1;
                cont++;
            }
        }
    }

    public static void imprimirTablero(int[][] tablero) {
        char letra = 'A';
        System.out.println("  1 2 3 4 5 6 7 8");

        for (int i = 0; i < tablero.length; i++) {
            System.out.print(letra + " ");
            letra++;
            for (int j = 0; j < tablero.length; j++) {
                switch (tablero[i][j]) {
                    case 0:
                    case 1:
                        System.out.print(" ");
                        break;
                    case 2:
                        System.out.print("O ");
                        break;
                    case 3:
                        System.out.print("X ");
                        break;
                    default:
                        break;
                }
            }

            System.out.println();
        }
    }


//EL MAIN
    public static void main(String[] args) {
        //cremamos el tablero vacio de 8x8
        int[][] tablero;
        tablero = new int [8][8];
        //Rellenamos el tablero con los barcos aleatorios
        crearBarcos(10, tablero);
        int numsBarcos = 0;
        //pedimos al usuario la fila y la columna que quiere ver
        Scanner sc = new Scanner(System.in);
        char fila = Utilidades.leerCaracter("Escribe la fila (Letra en Mayus)= ");
        int columna = Utilidades.leerEntero("Escribe la columna (Numero)= ");
        sc.close(); 
        //creamos el FORMATO DE LA TABLA (A - H) (1 - 8)
        int numFila = fila - 'A';
        columna--;

        if (tablero[numFila][columna] == 0 || tablero[numFila][columna] == 1){
            tablero[numFila][columna] += 2;
        }
            imprimirTablero(tablero);
    }
}