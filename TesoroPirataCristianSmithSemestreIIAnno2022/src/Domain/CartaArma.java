
package Domain;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class CartaArma extends Sprite{
    
    private int numCarta;
    private BufferedImage img;
    private int idImagen;

    public CartaArma (int posX, int posY){
        super(posX, posY);
        try {
            this.imagen=ImageIO.read(getClass().getResourceAsStream(""));
        } catch (IOException ex) {
            Logger.getLogger(CartaArma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin constructor
    
    public static boolean voltear(){
        
        
        
        
    return true;
    }
    
    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    @Override
    public void dibujar(Graphics g) {
  
    }
    
    
    
    
}//Fin clase
