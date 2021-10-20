
package objectklasea;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class Dantzaria {
    
    private String izena;
    private int adina;
    private String gustukoDantza;
    
    // Dantzari klasearen eraikitzailea
    public Dantzaria( String izena, int adina, String gustukoDantza ) {
        this.izena = izena;
        this.adina = adina;
        this.gustukoDantza = gustukoDantza;
    }
    
    // Dantzaiaren adina zehaztu
    public void setAdina( int urteak ) {
        adina = urteak;
    }
    
    // Dantzaiaren gustoko dantza
    public void setGustukoDantza( String dantza ) {
        gustukoDantza = dantza;
    }
    
    // Dantzariaren datuak irakurtzeko metodoak    
    public String getGustukoDantza( ) {
        return gustukoDantza;
    }
    
    public int getAdina( ) {
        return adina;
    }
    
    public String getIzena( ) {
        return izena;
    }

    // Dantzarien informazioa bistaratu metodo abstraktua erabiliz
    public void dantzariaBistaratu( ) {
        System.out.println( getIzena ()+ " dantzariak "+getAdina( )+" urte ditu eta " +getGustukoDantza( )+" du gustokoa" );
    }
}
