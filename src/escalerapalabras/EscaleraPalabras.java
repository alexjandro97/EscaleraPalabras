/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerapalabras;

/**
 *
 * @author alexj
 */
public class EscaleraPalabras {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] prueba1 = {{'P', 'O', 'T', 'A'},
                            {'P', 'A', 'T', 'O'},
                            {'R', 'A', 'T', 'O'},
                            {'G', 'A', 'T', 'O'}};
        

        //checkEscalera(prueba1, diferencia);
       System.out.print("La matriz da " + checkEscalera(prueba1));
        
    }

    static private boolean checkEscalera(char[][] prueba1) {
    int diferencia = 0;

        for (int i = 0; i < prueba1.length; i++) {
            for (int j = 0; j < prueba1[i].length; j++) {
                if (prueba1[i][j] != prueba1[i + 1][j]) {
                    diferencia++;
                    if (diferencia > 2) {
                        return false;
                    }
                    if (diferencia == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
