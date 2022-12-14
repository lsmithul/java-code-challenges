package Dominio;

import java.awt.Graphics;
import java.util.LinkedList;

public class Juego {

    private int IdJuego;
    private LinkedList<Jugador> jugadores;
    private LinkedList<Casilla> casillas;
    private CartaArma cartasArma[];
    private Tablero tablero;

    public Juego() {
       
    }//Fin constructor 
    
    public Juego(int idJuego, LinkedList<Jugador> jugadores, LinkedList<Casilla> casillas, CartaArma cartasArma[], Tablero tablero){
        this.IdJuego = idJuego;
        this.jugadores = jugadores;
        this.casillas = casillas;
        this.cartasArma = cartasArma;
        this.tablero = tablero;
    }//fin constructor sobrecargdo

    public void dibujar(Graphics g) {
        this.tablero.dibujar(g);
    }

    public int getIdJuego() {
        return IdJuego;
    }

    public void setIdJuego(int IdJuego) {
        this.IdJuego = IdJuego;
    }

    public LinkedList<Jugador> getJugadores() {
        return jugadores;
    }

    public Jugador getJugadorDeJugadores(String nombreUsuario) {
        Jugador jugadorARecuperar = new Jugador(0, 0);
        for (Jugador jugador : this.jugadores) {
            if (jugador.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                jugadorARecuperar = jugador;
            }
        }
        return jugadorARecuperar;
    }

    public void setJugadores(LinkedList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setJugadorEnJugadores(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public LinkedList<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(LinkedList<Casilla> casillas) {
        this.casillas = casillas;
    }

    public CartaArma[] getCartasArma() {
        return cartasArma;
    }

    public void setCartasArma(CartaArma[] cartasArma) {
        this.cartasArma = cartasArma;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public void actualizar() {

//    public void dibujar(Graphics g) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}//Fin clase
