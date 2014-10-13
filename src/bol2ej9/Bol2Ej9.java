
package bol2ej9;

import java.util.Scanner;

public class Bol2Ej9 {

    public static void main(String[] args) {
        
        int bi100 = 0;
        int bi20 = 0;
        int bi5 = 0;
        int mon1 = 0;
        
        System.out.println("Introduzca el numnero de billetes de 100 euros que tiene:");
        Scanner bill100 = new Scanner (System.in);
        bi100 = bill100.nextInt();
        System.out.println("Introduzca el numnero de billetes de 20 euros que tiene:");
        Scanner bill20 = new Scanner (System.in);
        bi20 = bill20.nextInt();
        System.out.println("Introduzca el numnero de billetes de 5 euros que tiene:");
        Scanner bill5 = new Scanner (System.in);
        bi5 = bill5.nextInt();
        System.out.println("Introduzca el numnero de monedas de 1 euro que tiene:");
        Scanner mone1 = new Scanner (System.in);
        mon1 = mone1.nextInt();
        
        
        System.out.println("Tiene " + ((bi100*100)+(bi20 *20)+(bi5 *5)+mon1));
    
    }
    
}
