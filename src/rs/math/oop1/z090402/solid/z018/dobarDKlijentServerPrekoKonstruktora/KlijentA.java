package rs.math.oop1.z090402.solid.z018.dobarDKlijentServerPrekoKonstruktora;

import static java.lang.System.out;

public class KlijentA implements Klijent {
   private Servis servis;

   public KlijentA(Servis servis) {
      this.servis = servis;
   }

   @Override
   public void uradiNesto() {
      String info = servis.getInfo();
      out.println("KlijentA - " + info);
   }
}
