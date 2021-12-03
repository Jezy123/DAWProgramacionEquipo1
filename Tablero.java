public class Tablero {
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int [8][8];
        char[] letras = {'A','B','C','D','E','F','G','H'};
        int cont = 0;

        Utilidades.rellenaMatriz(matriz, 0, 3);

        System.out.println("  1 2 3 4 5 6 7 8 ");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0){
                    System.out.print(letras[cont] + " ");
                    cont++;
                }
                System.out.print(matriz[i][j] +  " ");
            }
            System.out.print("\n");
        }

    }
    
}
