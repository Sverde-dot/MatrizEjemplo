/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatriz;
import ejemplomatriz.Pedir.*;
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
    public void mostratodo(int[][]tabla,String[]alumnos,String[]modulos,String[]media){

        for(int m =0;m<modulos.length;m++ )
            System.out.println(" "+modulos[m]+"   ");
        for(int f =0;f<tabla.length;f++ ){
            System.out.println("\n "+alumnos[f]);
        for (int c =0;c<tabla[f].length;c++)
            System.out.print(tabla [f][c]+"  ");
    }
    }
    public void qitar(){
        System.exit(0);
    }
    public String[] arrayFila(int [][]tabla){
        String[]filas = new String [tabla.length];
        for(int i=0;i< filas.length;i++)
            filas[i]=Pedir.pedirString();
        return filas;

    }
    public String[] arrayColumnas(int [][]tabla){
        String[]columnas = new String [tabla[0].length];
        for(int i=0;i< columnas.length;i++)
            columnas[i]=Pedir.pedirString();
        return columnas;
    }
    public int[] media(int[][]tabla){
        int[]media = new int[3];
        for(int f=0;f< tabla.length;f++){
            for(int y=0;y< tabla.length;y++)
            media[f]=media[f]+media[y];
            media[f]=media[f]/3;
        }
        return media;
    }
}

            
