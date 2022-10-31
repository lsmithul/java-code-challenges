package Dominio;

import java.awt.image.BufferedImage;

public class Avatar {

    private String IdAvatar;
    private BufferedImage img;
    
    public Avatar(){
        this.IdAvatar = "";
    }

    @Override
    public String toString() {
        return "Avatar{" + "Idavatar=" + IdAvatar + '}';
    }

    public Avatar(String Idavatar) {
        this.IdAvatar = Idavatar;
    }//Fin constructor

    public String getIdAvatar() {
        return IdAvatar;
    }

    public void setIdAvatar(String IdAvatar) {
        this.IdAvatar = IdAvatar;
    }

}//Fin clase
