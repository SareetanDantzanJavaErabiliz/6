

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU
 */

public class Kalkuluak {
   public int z = 40;
	
   public void gehikuntza ( int x ) {
      z += x;
      System.out.println( "Z zenbakiaren balioa + "+x+" gehitu dugu, Z = "+z );
   }
	
   public void txikitzea ( int x ) {
      z -= x;
      System.out.println( "Z zenbakiaren balioa -"+x+" txikitu dugu, Z = "+z );
   }

}
