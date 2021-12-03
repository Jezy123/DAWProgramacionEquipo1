public class HundirLaFlota {
    public static void createShips(int numShips, int[][] shipPlaces) {
        int r1, r2;
        int cont = 0;
    
        while (cont < numShips) {
            r1 = (int) (Math.random()*8); 
            r2 = (int) (Math.random()*8);
            if (shipPlaces[r1][r2] != 1) {
                shipPlaces[r1][r2]=1;
                cont++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] shipPlaces=new int[8][8];
        createShips(10, shipPlaces);    
    }
}