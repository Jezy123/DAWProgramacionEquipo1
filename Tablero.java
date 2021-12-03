public class Tablero {
    public static void main(String[] args) {
        //Creamos la matriz de 8x8
        int[][] matriz;
        matriz = new int [8][8];
        //Creamos un array donde ponemos las letras a imprimir
        char[] letras = {'A','B','C','D','E','F','G','H'};
        int cont = 0;
        //rellenamos la matriz con valores aleatorios del 0 al 3
        Utilidades.rellenaMatriz(matriz, 0, 3);
        //imprimo la parte superior de los numeros 
        System.out.println("  1 2 3 4 5 6 7 8 ");
        //recorremos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //si es el primer valor del array imprimimos la primera letra almacenada en el array 
                if (j == 0){
                    System.out.print(letras[cont] + " ");
                    cont++;
                }
                //se imprimen los valores de la matriz 
                System.out.print(matriz[i][j] +  " ");
            }
            System.out.print("\n");
        }
    } 
}