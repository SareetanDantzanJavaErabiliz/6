

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */

public abstract class DantzariAbstraktua {
 
    private String izena;
    private int adina;
    private String gustukoDantza;
    
    // Dantzari klasearen eraikitzailea
    public DantzariAbstraktua( String izena, int adina, String gustukoDantza ) {
        this.izena = izena;
        this.adina = adina;
        this.gustukoDantza = gustukoDantza;
    }
    
    // Dantzaiaren adina zehaztu
    public void setAdina( int urteak ) {
        adina = urteak;
    }
    
    // Dantzaiaren gustuko dantza
    public void setGustokoDantza( String dantza ) {
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
    public abstract void dantzariaBistaratu( );
    
}
