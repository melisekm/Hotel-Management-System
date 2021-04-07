package sk.stu.fiit.model;

/**
 *
 * @author Martin Melisek
 */
public class Zlava {

    private String nazov;
    private String popis;
    private double percento;

    public Zlava(String nazov, String popis, double percento) {
        this.nazov = nazov;
        this.popis = popis;
        this.percento = percento;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public double getPercento() {
        return percento;
    }

    public void setPercento(double percento) {
        this.percento = percento;
    }

}
