

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class DantzariakEgiaztatu {
    public static void main( String [ ] parametroak ) {
        
        IzakiBizidunak katua = new IzakiBizidunak( );
        IzakiBizidunak dantzariBat =  new Dantzari( );
       
        //Dantzari dantzariBat = new Dantzari ( );
        // honek IzakiBizidunak klasearen errerferentzia du
        // IzakiBizidunak klasean dagoen metodoa exekutatzen du    
        katua.mugitu( );
        
        // honek Dantzari klasearen errerferentzia du
        // Dantzari klasean dagoen metodoa exekutatzen du
        dantzariBat.mugitu( );
        
        //dantzariBat.dantzariKlasikoak( );
        //Hau ez du onartzen
        //IzakiBizidunak klasean metodo hori sortzea eskatzen du
        //Bestela Dantzari klaseko objektu bat sortu behar dugu
        Dantzari besteDantzariBat = new Dantzari ( );
        besteDantzariBat.dantzariKlasikoak( );
    }
                
}
