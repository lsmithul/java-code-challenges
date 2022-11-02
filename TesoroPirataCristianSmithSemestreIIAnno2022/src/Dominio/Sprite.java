package Dominio;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Sprite {

    protected double posX;
    protected double posY;
    protected BufferedImage imagen;

    public Sprite(){}
    
    public Sprite(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }//Fin constructor

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public abstract void dibujar(Graphics g);

}//Fin clase
