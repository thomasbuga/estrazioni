/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estrazioni;

/**
 *
 * @author Tiziano Toffenetti
 */
public class Operazioni {
    int insiemeValori[] = new int [100];
    public void genera(){
        for (int i = 0; i < 100; i++) {
            insiemeValori[i] = (int)(Math.random()*100 + 1);
        }
    }
    public void numMax(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 100; i++) {
            if (insiemeValori[i]>max) {
                max = insiemeValori[i];
            }
        }
        System.out.println("Il numero piu' alto e': " + max);
    }
    public void numMin(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 100; i++) {
            if (min > insiemeValori[i]) {
                min = insiemeValori[i];
            }
        }
        System.out.println("Il numero piu' piccolo e': " + min);
    }
    public void media(){
        int media = 0;
        for (int i = 0; i < 100; i++) {
            media = insiemeValori[i] + media;
        }
        media = media/100;
        System.out.println("La media e': " + media);
    }
    public void percentuali(){
        int pari = 0;
        int dispari = 0;
        for (int i = 0; i < 100; i++) {
            if (insiemeValori[i]%2==0) {
                pari++;
            }else{
                dispari++;
            }
        }
        System.out.println("La percentuale di numeri pari e': " + ((pari*100)/insiemeValori.length) + "%");
        System.out.println("La percentuale di numeri dispari e': " + ((dispari*100)/insiemeValori.length) + "%");
    }
 
    }
    


