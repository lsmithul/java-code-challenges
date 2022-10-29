
package Domain;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class Casilla extends Sprite{
    
    private int idCasilla; 
    private int idImagen; 
    private BufferedImage img;

    public Casilla (int posX, int posY){
        super(posX, posY);
        try {
            this.imagen=ImageIO.read(getClass().getResourceAsStream("/img/circulo.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Casilla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin constructor


    
    public int getIdCasilla() {
        return idCasilla;
    }

    public void setIdCasilla(int idCasilla) {
        this.idCasilla = idCasilla;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    @Override
    public void dibujar(Graphics g) {
       g.drawImage(this.imagen, (int)this.posX, (int)this.posY, null);
    }
    
    
}//Fin clase
