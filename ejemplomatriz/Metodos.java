/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatriz;
import Pedir;
import java.util.Scanner;

/**
 *
 * @author sverdecadilla
 */
public class Metodos {
    
    Scanner sc=new Scanner(System.in);
    private int num;
    
    public int [][] matriz(int [][]tabla){
        for (int f =0;f<tabla.length;f++)
            for (int c =0;c<tabla[f].length;c++){
                tabla[f][c]= num;
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
    public void mostratodo(int[][]tabla,String[]alumnos,String[]modulos){
        for(int m =0;m<modulos.length;m++ )
            System.out.println(" "+modulos[m]+" ");
        for(int f =0;f<tabla.length;f++ ){
            System.out.println("\n "+alumnos[f]);
            for (int c =0;c<tabla[f].length;c++)
                System.out.print(tabla [f][c]+" ");
    }
    }
    public void qitar(){
        System.exit(0);
    }
    public String[] arrayFila(int [][]tabla){
        String[]filas = new String [tabla.length];
        for(int i=0;i< filas.length;i++)
            System.out.println("Introduce el numero");
            filas=sc.nextInt();
        return filas;

    }
    public String[] arrayColumnas(int [][]tabla){
        String[]columnas = new String [tabla[0].length];
        for(int i=0;i< columnas.length;i++)
            System.out.println("Introduce el numero");
            columnas=sc.nextInt();
        //columnas[i]=PedirDatos.
        return columnas;
    }
}

            
