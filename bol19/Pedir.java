package bol19;
import java.util.Scanner;

/**
 *
 * @author sverdecadilla
 */
public class Pedir {
 
    public static int PedirInt(){
        Scanner sc = new Scanner(System.in);    
        int a;
        System.out.println("Introduce un numero");
        a = sc.nextInt();
        return a;   
} 
    public static float pedirFloat(){
        Scanner sc = new Scanner(System.in);    
        float b;
        System.out.println("Introduce un numero");
        b = sc.nextFloat();
        return b;
} 
        public static String pedirString(){
        Scanner sc = new Scanner(System.in);    
        String c;
        System.out.println("Introduce un String");
        c = sc.next();
        return c;
} 
    
}

