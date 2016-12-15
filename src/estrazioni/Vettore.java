/*
 * Vettore: una classe che wrappa un array unidimensionale e
 * esegue operazioni standard su questo array.
 */
package estrazioni;

/**
 *
 * @author Docente
 */
public class Vettore {
    
    private int[] a;

    public Vettore(int[] a) {
        this.a = a;
    }

    public int[] get() {
        return a;
    }
    
    public int getLength() {
        return a.length;
    }
    
    public void carica() {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*100) + 1;
        }
    }
    
    public int getMax() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < getLength(); i++) {
            if (a[i]>max) max=a[i];
        }
        return max;
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < getLength(); i++) {
            if (a[i]<min) min=a[i];
        }
        return min;
    }
    
    public int getElement(int index) {
        if (index<0 || index>=a.length) return 0;
        return a[index];
    }

    public int getAverage() {
        int somma=0;
        for (int i = 0; i < a.length; i++) {
            somma += a[i];
        }
        return somma/a.length;
    }
    
    public int getCountPari() {
        int npari = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) npari++;
        }
        return (npari*100)/a.length;
    }

    @Override
    public String toString() {
        String s = "Elementi [" + a.length + "]: ";
        for (int i = 0; i < a.length; i++) {
            s += a[i] + " ";
        }
        return s;
    }
    
      public void bubbleSort() {
        for(int i=0; i<a.length; i++) {
            for (int j=0; j<a.length-1; j++){
                if(a[j]>a[j+1]) {
                    int k= a[j];
                    a[j] = a[j+1];
                    a[j+1] = k;
                }
            }
       }
    }

    
}
