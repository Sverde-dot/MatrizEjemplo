/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol19;

/**
 *
 * @author sverdecadilla
 */
public class metodos {
    
    
}
        public int [][] matriz(int [][]tabla){
        for (int f =0;f<tabla.length;f++)
            for (int c =0;c<tabla[f].length;c++){
                tabla[f][c]= Pedir.PedirInt();
            }
        return tabla;
    }
    public void mostra(int[][]tabla){
        for(int f =0;f<tabla.length;f++ ){
            System.out.println("\n");
            for (int c =0;c<tabla[f].length;c++)
                System.out.print(tabla [f][c]+" ");
    }
}
