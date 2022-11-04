package Dominio;

import java.awt.Graphics;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Casilla extends Sprite {

    public Casilla(int posX, int posY, String rutaImagen) {
        super(posX, posY);
        try {
            this.imagen = ImageIO.read(getClass().getResourceAsStream(rutaImagen.replace(".jpg", ".png"))); //"/img/circulo.jpg" 
        } catch (IOException ex) {
            Logger.getLogger(Casilla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin constructor

    @Override
    public void dibujar(Graphics g) {
        g.drawImage(this.imagen, (int) this.posX, (int) this.posY, null);
    }

}//Fin clase
