public class Tablero {
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int [10][10];

        Utilidades.rellenaMatriz(matriz, 0, 1);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] +  " ");
            }
            System.out.print("\n");
        }

    }
    
}
