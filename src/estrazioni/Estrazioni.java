/*
 * Estrazioni con controllo versione.
 */
package estrazioni;

/**
 *
 * @author 3Ai
 */
public class Estrazioni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] pippicalzelunghe = new int[10];
        Vettore v = new Vettore(pippicalzelunghe);
        
        v.carica();
        System.out.println(v);
        System.out.println("Il min e': " + v.getMin());
        System.out.println("Il max e': " + v.getMax());
        System.out.println("Il med e': " + v.getAverage());
        System.out.println("La percentuale di PARI e': " + v.getCountPari());
        v.bubbleSort();
        System.out.println(v);
    }
}
