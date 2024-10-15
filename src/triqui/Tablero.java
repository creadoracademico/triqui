/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triqui;

/**
 *
 * @author ESTUDIANTE
 */
public class Tablero {
    private char[][] fichas; // Declaración del arreglo

    public Tablero() {
        fichas = new char[3][3];
    }

    // limpiar tablero
    public void limpiar() {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                fichas[f][c] = ' ';
            }
        }
    }

    // Método para mostrar el tablero
    public void mostrar() {
        
        for (int f = 0; f < fichas.length; f++) {
            for (int c = 0; c < fichas[0].length; c++) {
                System.out.print(fichas[f][c] );
                if(c < 2)
                    System.out.print(" | ");
            }
            System.out.println();
            if(f < 2)
              {for(int k = 0;k < 10;k++)
                    System.out.print('-');
               System.out.println(); 
              }
                
            
        }
    }    
}
