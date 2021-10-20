
package objectklasea;
import java.util.GregorianCalendar;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU.
 */
public class ObjectKlasea {


    public static void main( String[ ] parametroak ) {
        
      // egutegia objketua sortu GregorianCalendar klasekoa
      GregorianCalendar egutegia = new GregorianCalendar( );

      // ordua idatzi
      System.out.println( "" + egutegia.getTime( ) );

      // egutegi objektuaren klasea bistaratu
      System.out.println( "" + egutegia.getClass( ) );

      // Dantzari bat sortu
      Dantzaria dantzariBat = new Dantzaria( "Manex", 16, "Bizkaiko Dantzari Dantza" );
      Dantzaria dantzariBi = new Dantzaria( "Txabi", 14, "Zuberoko Godalet Dantza" );


      // dantzariBat objketua bistaratu
      dantzariBat.dantzariaBistaratu( );
      dantzariBi.dantzariaBistaratu( );

      // dantzariBat objketuaren klasea bistaratu
      System.out.println( dantzariBat.getClass( ) );
      System.out.println( dantzariBat.hashCode( ) );
      System.out.println( dantzariBat.toString( ) );
      System.out.println( dantzariBat.equals( egutegia ) );
      System.out.println( dantzariBat.equals( dantzariBi ));
      System.out.println( dantzariBat.equals( dantzariBat ) );
    }
    
}
