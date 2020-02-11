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
    public void mostratodo(int[][]tabla,String[]alumnos,String[]modulos){

        for(int m =0;m<modulos.length;m++ )
            System.out.println(""+modulos[m]+"  ");
        for(int f =0;f<tabla.length;f++ ){
            System.out.println("\n"+alumnos[f]);
        for (int c =0;c<tabla[f].length;c++)
            System.out.print(tabla [f][c]+"         ");
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
    public int[] mediaAlum(int[][]tabla,int[]mAlum){
        int acu=0;
        for(int c=0;c<mAlum.length;c++){
            acu=0;
        for(int f=0;f<tabla.length;f++)
            acu=acu+tabla[f][c];
            System.out.println("-"+acu);
            mAlum[c]=acu/mAlum.length;
        }
        return mAlum;
    }
    
    public int[] mediaModulos(int[][]tabla,int[]mModulos){
        int acu=0;
        for(int c=0;c<mModulos.length;c++){
            acu=0;
        for(int f=0;f<tabla.length;f++)
            acu=acu+tabla[f][c];
            System.out.println("-"+acu);
            mModulos[c]=acu/mModulos.length;
        }
        return mModulos;
    }
}

            
