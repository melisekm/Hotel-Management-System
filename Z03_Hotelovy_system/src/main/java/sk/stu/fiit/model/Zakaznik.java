package sk.stu.fiit.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Martin Melisek
 */
public class Zakaznik implements Serializable{

    private ArrayList<Ubytovanie> historiaUbytovani;
    private Pohlavie pohlavie;
    private String meno;
    private String narodnost;
    private String telCislo;
    private String cisloOP;
    private String adresa;

    public Zakaznik(Pohlavie pohlavie, String meno, String narodnost, String telCislo, String cisloOP, String adresa) {
        this.pohlavie = pohlavie;
        this.meno = meno;
        this.narodnost = narodnost;
        this.telCislo = telCislo;
        this.cisloOP = cisloOP;
        this.adresa = adresa;
        this.historiaUbytovani = new ArrayList<>();
    }

    public void updateDetails(Pohlavie pohlavie, String meno, String narodnost, String cisloOP, String telCislo, String adresa) {
        this.pohlavie = pohlavie;
        this.meno = meno;
        this.narodnost = narodnost;
        this.telCislo = telCislo;
        this.cisloOP = cisloOP;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return meno + " - " + cisloOP;
    }
    
    

    public ArrayList<Ubytovanie> getHistoriaUbytovani() {
        return historiaUbytovani;
    }

    public void setHistoriaUbytovani(ArrayList<Ubytovanie> historiaUbytovani) {
        this.historiaUbytovani = historiaUbytovani;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getNarodnost() {
        return narodnost;
    }

    public void setNarodnost(String narodnost) {
        this.narodnost = narodnost;
    }

    public String getTelCislo() {
        return telCislo;
    }

    public void setTelCislo(String telCislo) {
        this.telCislo = telCislo;
    }

    public Pohlavie getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(Pohlavie pohlavie) {
        this.pohlavie = pohlavie;
    }

    public String getCisloOP() {
        return cisloOP;
    }

    public void setCisloOP(String cisloOP) {
        this.cisloOP = cisloOP;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

}
