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

    //CREAMOS EL TABLERO
    public static void imprimirTablero(String fila,int columna) {
        
        //Creamos un array donde ponemos las letras a imprimir
        char[] letras = {'A','B','C','D','E','F','G','H'};
        int cont = 0;

        int respuesta;
        switch (fila) {
            case "A":
                respuesta = 0;
                break;
            case "B":
                respuesta = 1;
                break;
            case "C":
                respuesta = 2;
                break;
            case "D":
                respuesta = 3;
                break;
            case "E":
                respuesta = 4;
                break;
            case "F":
                respuesta = 5;
                break;
            case "G":
                respuesta = 6;
                break;
            case "H":
                respuesta = 7;
                break;
        
            default:
                break;
        }
        //imprimo la parte superior de los numeros 
        System.out.println("  1 2 3 4 5 6 7 8");

        //recorremos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //si es el primer valor del array imprimimos la primera letra almacenada en el array 
                if (j == 0){
                    System.out.print(letras[cont] + " ");
                    cont++;
                }
                //se imprimen los valores de la matriz dependiendo del valor se imprimira un caracter o otro
}
}
}
//EL MAIN
    public static void main(String[] args) {
        int[][] plazasBarco=new int[8][8];
        crearBarcos(10, plazasBarco);
        
        System.out.print("Escribe la fila (Letra)= ");
        Scanner sc = new Scanner(System.in);
        String fila = sc.nextLine();

        System.out.print("Escribe la columna (Numero)= ");
        int columna = sc.nextInt();
        sc.close();
        imprimirTablero(fila,columna); 
        
        //creamos el tablero
        int [][] matriz;
        matriz = new int [8][8];
    }
}