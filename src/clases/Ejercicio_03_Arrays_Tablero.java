/*
DECLARAR UN ARRAY PARA GUARDAR UN TABLERO DE AJEDREZ

T C A K Q A C T
P P P P P P P P
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
P P P P P P P P
T C A K Q A C T
 */
package clases;

public class Ejercicio_03_Arrays_Tablero {
    public static void main(String[] args){

        // DECLARAR
        char[][] tablero = new char[8][8];
        char vacio = '0';

        // VACIAR EL TABLERO
        for (int fila = 0; fila < 8; fila++){
            for (int columna = 0; columna < 8; columna++){
                tablero[fila][columna] = vacio;
            }
        }

        // ASIGNAR VALORES
        for (int fila = 0; fila < 8; fila++){
            if (fila == 0 || fila == 7){
                    tablero[fila][0] = 'T';
                    tablero[fila][1] = 'C';
                    tablero[fila][2] = 'A';
                    tablero[fila][3] = 'K';
                    tablero[fila][4] = 'Q';
                    tablero[fila][5] = 'A';
                    tablero[fila][6] = 'C';
                    tablero[fila][7] = 'T';
            }
            else if (fila == 1 || fila == 6){
                for (int columna = 0; columna < 8; columna++){
                    tablero[fila][columna] = 'P';
                }
            }
        }
        for (int fila = 0; fila < 8; fila++){
            for (int columna = 0; columna < 8; columna++){
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}