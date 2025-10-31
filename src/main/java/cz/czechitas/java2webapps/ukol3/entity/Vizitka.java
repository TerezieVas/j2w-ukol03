package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {
    private String jmeno;
    private String firma;
    private String ulice;
    private String obecPsc;
    private String email;
    private String telefon;
    private String web;
   // private String celaAdresa;

    public Vizitka(String jmeno, String firma, String ulice, String obecPsc, String email, String telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obecPsc = obecPsc;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
       // this.celaAdresa = ulice + ", " + obecPsc;
    }

    public String getCelaAdresa() {
        String celaAdresa = getUlice() + ", " + getObecPsc();
        return celaAdresa;
    }

    public String getWeb() {
        if (web == null) {
            return "";
        } else {
            return web;
        }

    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getTelefon() {
        if (telefon == null) {
            return "";
        } else {
            return telefon;
        }

    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        if (email == null) {
            return "";
        } else {
            return email;
        }

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObecPsc() {
        if (obecPsc == null) {
            return "";
        } else {
            return obecPsc;
        }

    }

    public void setObecPsc(String obecPsc) {
        this.obecPsc = obecPsc;
    }

    public String getUlice() {
        if (ulice == null) {
            return "";
        } else {
            return ulice;
        }

    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getFirma() {
        if (firma == null) {
            return "";
        } else {
            return firma;
        }
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
}