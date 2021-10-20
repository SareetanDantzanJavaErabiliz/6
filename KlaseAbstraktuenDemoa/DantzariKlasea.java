
/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class DantzariKlasea extends DantzariAbstraktua {
    
    /**
     *
     * @param izena
     * @param adina
     * @param gustukoDantza
     */
    public DantzariKlasea ( String izena, int adina, String gustukoDantza) {
        super (izena, adina, gustukoDantza);
    }

    @Override
    public void dantzariaBistaratu( ) {
        System.out.println( getIzena( )+ " dantzariak "+getAdina( )+" urte ditu eta " +getGustukoDantza( )+" du gustokoa");
    }
    
}
