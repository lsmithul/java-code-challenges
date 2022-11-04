
package Dominio;

import java.awt.Graphics;


public class Tablero {
   
    private Casilla casillas [][];
    private CartaArma cartasArma[][];
    private Jugador jugadores;

    private int tablero [] [] = {
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
    };
    
    
 private void crearTablero(){
        for(int i=0; i<this.tablero.length; i++){
            for(int j=0; j<this.tablero[i].length; j++){
                if(tablero[i][j]==1)
                    this.casillas[i][j]=new Casilla(j*40, i*40, "");
            } // for j
        } // for i
    } // crearTablero
    
    public Tablero(){
        this.casillas=
                new Casilla[this.tablero.length][this.tablero[0].length];
        this.crearTablero();
    } // constructor
    
    public void dibujar(Graphics g){
        for(int i=0; i<this.casillas.length; i++){
            for(int j=0; j<this.casillas[i].length; j++){
                if(this.casillas[i][j]!=null)
                    this.casillas[i][j].dibujar(g);
            } // for j
        } // for i
    } // dibujar

    public Casilla[][] getCasillas() {
        return casillas;
    }
    
}//Fin clase
