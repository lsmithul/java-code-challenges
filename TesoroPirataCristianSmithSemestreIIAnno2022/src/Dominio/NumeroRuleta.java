package Dominio;

public class NumeroRuleta {

    private int numero;
    private String nombreUsuario;
    
    public NumeroRuleta(){}
    
    public NumeroRuleta(int numero, String nombreUsuario) {
        this.numero = numero;
        this.nombreUsuario = nombreUsuario;
    }//Fin constructor

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String toString() {
        return "NumeroRuleta{" + "numero=" + numero + ", nombreUsuario=" + nombreUsuario + '}';
    }
    
    

}//Fin clase
