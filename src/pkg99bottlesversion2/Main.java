/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg99bottlesversion2;

/**
 *
 * @author N1CO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int x = 99; x >= 0; x--) {
            switch (x) {
                case 2:

                    singFirstVerse(x);
                    System.out.println("One more bottle of beer");
                    System.out.println();
                    break;
                case 1:

                    System.out.println(x + " bottle of beer on the wall");
                    System.out.println(x + " bottle of beer");
                    System.out.println("Take one down, pass it around");
                    System.out.println("No more bottles of beer on the wall");
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Better go to the store and buy some more.");
                    break;
                default:
                    singFirstVerse(x);
                    System.out.println((x - 1) + " bottles of beer on the wall");
                    System.out.println();
                    break;
            }

        }

    }

    static void singFirstVerse(int a) {

        System.out.println(a + " bottles of beer on the wall");
        System.out.println(a + " bottles of beer");
        System.out.println("Take one down, pass it around");

    }
}
