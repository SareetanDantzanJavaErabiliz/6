

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class KlaseAbstraktuenDemoa {
    public static void main( String [ ] parametroak ) {
        // Hau posible da? DantzariAbrstraktua abstract da beraz ezin da objekturik sortu
        // DantzariKlasea DantzariBat = new DantzariAbstraktua ( "Maialen", 29, "ArkupekoDantza");
        // Eta hau? honek eskatzen du eraikitzailearen definizioa DantzariKlasean
        DantzariKlasea dantzariBat = new DantzariKlasea( "Maialen", 29, "Arkupeko Dantza" );
        
        dantzariBat.dantzariaBistaratu( );
    }
            
}
