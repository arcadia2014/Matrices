public class Matrices {
    public static void imprimirMatriz(int[][] m) {  //todo lo que se coloque adentro del parentesis se llama parametro o argumeto
        for (int i = 0; i < m.length; i ++){
            for (int j = 0; j < m[1].length; j++ ){
                System.out.print(m [i] [j] + "  ");
            }
            System.err.println("");
        }

    }

    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int numero = 1;

        for (int i = 0; i < matriz1.length; i++){
            //numero++;
            for ( int j = 0; j < matriz1[1].length; j++){
                matriz1[i][j] = numero;
                numero++;
            }
        }

        System.err.println("Los valores de matriz son:");
        imprimirMatriz(matriz1); //llamado con argumento


     }
}
