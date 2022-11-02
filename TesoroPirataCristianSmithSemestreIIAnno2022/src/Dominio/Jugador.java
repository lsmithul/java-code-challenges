package Dominio;

import java.awt.Graphics;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Jugador extends Sprite{

    private String nombreUsuario;
    private int turno;
    private int numeroRuleta;
    private boolean Activo;
    private LinkedList<Moneda> monedero;
    private Avatar avatar;

    
    public Jugador(){
    
    }
    
    public Jugador(int posX, int posY){
        super(posX, posY);
    }
    
    public Jugador(int posX, int posY,String nombreUsuario, int turno, boolean Activo, LinkedList<Moneda> monedero, Avatar avatar, int numeroRuleta) {
        super(posX, posY);
        try {
            this.imagen=ImageIO.read(getClass().getResourceAsStream(""));
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.nombreUsuario = nombreUsuario;
        this.turno = turno;
        this.Activo = Activo;
        this.monedero = monedero;
        this.avatar = avatar;
        this.numeroRuleta = numeroRuleta;
    }//Fin constructor
    
    public String getNombreUsuario() {
        
        //JPanel 
        
        
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public LinkedList<Moneda> getMonedero() {
        return monedero;
    }

    public void setMonedero(LinkedList<Moneda> monedero) {
        this.monedero = monedero;
    }
    
    public void setMonedaInMonedero(Moneda moneda){
        this.monedero.add(moneda);
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    @Override
    public void dibujar(Graphics g) {
        
    }

    public int getNumeroRuleta() {
        return numeroRuleta;
    }

    public void setNumeroRuleta(int numeroRuleta) {
        this.numeroRuleta = numeroRuleta;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombreUsuario=" + nombreUsuario + ", turno=" + turno + ", numeroRuleta=" + numeroRuleta + ", Activo=" + Activo + ", monedero=" + monedero + ", avatar=" + avatar.toString() + '}';
    }
 
}//Fin clase
