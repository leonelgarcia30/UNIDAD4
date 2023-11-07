package arreglosbidimencionales;

/**
 *
 * @author Leonel Garcia
 */
public class ArreglosBidimencionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[][] vocales = new char[3][5];
        char letra = 'A';

        for (char i = 0; i < 3; i++) {
            for (char j = 0; j < 5; j++) {
                vocales[i][j] = letra;
                letra++;

            }

        }
        for (char i = 0; i < 3; i++) {
            for (char j = 0; j < 5; j++) {
                System.out.print(vocales[i][j] + " ");

            }
            System.out.println();
        }
        // TODO code application logic here
    }

}
