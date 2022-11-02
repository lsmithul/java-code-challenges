package Dominio;

public class Moneda {

    private String idMoneda;

    public Moneda() {
    }

    public Moneda(String idMoneda) {
        this.idMoneda = idMoneda;
    }

    @Override
    public String toString() {
        return "Moneda{" + "idMoneda=" + idMoneda + '}';
    }

    public String getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(String idMoneda) {
        this.idMoneda = idMoneda;
    }

}//Fin clase
