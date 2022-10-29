
package Domain;

import java.awt.Graphics;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Jugador extends Sprite{

    private String nombreUsuario;
    private int turno;
    private boolean Activo;
    private Moneda[] monedero;
    private Avatar avatar;

    
    public Jugador(int posX, int posY){
        super(posX, posY);
    }
    
    public Jugador(int posX, int posY,String nombreUsuario, int turno, boolean Activo, Moneda[] monedero, Avatar avatar) {
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

    public Moneda[] getMonedero() {
        return monedero;
    }

    public void setMonedero(Moneda[] monedero) {
        this.monedero = monedero;
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

    @Override
    public String toString() {
        return "Jugador{" + "nombreUsuario=" + nombreUsuario + ", turno=" + turno + ", Activo=" + Activo + ", monedero=" + monedero + ", avatar=" + avatar + '}';
    }
    
    
    
}//Fin clase
