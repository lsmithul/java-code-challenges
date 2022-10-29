
package Domain;

import java.awt.image.BufferedImage;


public class Avatar {
 
  private String Idavatar;
  private BufferedImage img;

    public Avatar(String Idavatar) {
        this.Idavatar = Idavatar;
    }//Fin constructor

  
  
    public String getIdavatar() {
        return Idavatar;
    }

    public void setIdavatar(String Idavatar) {
        this.Idavatar = Idavatar;
    }

    
}//Fin clase
