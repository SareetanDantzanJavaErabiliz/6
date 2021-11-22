/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte. UPV/EHU
 */

public class Motorra extends Ibilgailua {

  //Ibilgailua klaseren proietate guztiak jaraunsten ditu (Is-A)
  // konposizioa erabiltzen da martxanIpini metodoa erabiltzeko (Has-A)

  public void setHasiera( ) {

    MotorElektrikoa motorElektrikoa = new MotorElektrikoa( );
    motorElektrikoa.martxanIpini( );
  }

}
