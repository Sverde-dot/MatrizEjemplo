/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author sverdecadilla
 */
public class Ejemplomatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = new int [3][4];
        String[]alumnos={"alum1","alum2","alum3"};
        String[]modulos={"Modulo1  Modulo2  Modulo3  Modulo4  Media"};
        //int[]mModulos= new mModulos[4];
        //int[]mAlum = new mAlum[3];
        int option;
        Metodos obx = new Metodos();
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("\n 1 --> crear Matriz\n 2 --> muestra todo \n 3 --> muestra media \n 4 --> salir \n La opcion"));
            switch(option){
                case 1: matriz=obx.matriz(matriz);
                break;
                case 2: obx.mostratodo(matriz, alumnos, modulos);
                break;
                case 3: obx.mediaModulos(matriz, mModulos)
                break;
                case 4: obx.qitar();
                break;
            }
                    
        }while(option<3);
    }
    
}
