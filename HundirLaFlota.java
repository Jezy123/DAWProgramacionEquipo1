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

    //CREAMOS EL TABLERO
    public static void crearTablero() {
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
                //se imprimen los valores de la matriz dependiendo del valor se imprimira un caracter o otro
                if (matriz[i][j]== 0){
                    System.out.print("O ");
                }else if (matriz[i][j]== 1){
                    System.out.print("X ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
    } 
}
//EL MAIN
    public static void main(String[] args) {
        int[][] plazasBarco=new int[8][8];
        crearBarcos(10, plazasBarco);
        crearTablero();    
    }
}