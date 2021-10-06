// Opcijom -ea pri poretanju JVM se omogucuju izuzetci
package rs.math.oop1.z110201.tvrdnje.z01.povrsina;

import java.util.Scanner;

public class PokretanjePovrsine {

   private static double PovrsineKruga(double poluprecnik)
   {
      assert poluprecnik > 0 : "Negativan poluprecnik";
      return poluprecnik * poluprecnik * Math.PI;
   }

   // program pokrenuti sa opcijom virtulene masine: –ea
   public static void main( String args[] )
   {
      System.out.print("Poluprecnik kruga: " );
      Scanner citac = new Scanner(System.in);
      double r = citac.nextDouble();
      citac.close();
      System.out.println("Povrsina kruga: " + PovrsineKruga(r));
   }

}
