
public class HundirLaFlota {

    public static void crearBarcos(int numBarcos, int[][] numPlazas) {
        //CREAMOS LOS 1 DE FORMA ALEATORIA PARA INDICAR LAS POSICIONES DE LOS BARCOS.
        int r1, r2;
        int cont = 0;
        //Transformamos posiciones aleatoria en el tablero, en 1 para indicar que hay un barco.
        while (cont < numBarcos) {
            r1 = (int) (Math.random()*8); 
            r2 = (int) (Math.random()*8);
            if (numPlazas[r1][r2] != 1) {
                numPlazas[r1][r2]=1;
                cont++;
            }
        }
        
    }
    // creamos un metodo para imprimir el tablero
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
                        System.out.print("  ");
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
    public static void main(String[] args) {
        // creamos nuestro tablero
        int[][] tablero;
        tablero = new int[8][8];
        // llenamos el tablero con los barcos y lo imprimimos
        crearBarcos(10, tablero);

        imprimirTablero(tablero);
        int numBarcos = 0;
        // Pedimos las posiciones al usuario y comprobamos si hay barco o no y repetimos hasta que undamos los 10 barcos.
        do{
            char fila = Utilidades.leerCaracter("Escoge una fila (Letra Mayuscula): ");
            int numColumna = Utilidades.leerEntero("Escoge una columna(Numero): ");
            int numFila = fila - 'A';
            numColumna--;

            if (tablero[numFila][numColumna] == 0 || tablero[numFila][numColumna] == 1){
                tablero[numFila][numColumna] += 2;
            }
            if(tablero[numFila][numColumna] == 3){
                numBarcos++;
            }
        
         imprimirTablero(tablero);
        }while(numBarcos != 10);
    }    
}


