
package caoitulo3;
import java.util.Scanner;
public class CarlysEventPriceWithMethods {
    public static final Integer PERSONA=35;
    public static Integer invitados(){
       Scanner ent = new Scanner(System.in);
       Integer a;
       System.out.print("Ingrese el numero de invitados: ");
       a=ent.nextInt();
       return a;
    }
    public static String mensaje(){
       return "*******************************************************\n* Carly hace la comida que lo convierte en una fiesta *\n*******************************************************";
    }
    public static String calculate(){
        Integer a;
        a=invitados()*PERSONA;
        return String.format("%s",a>=1750?"Evento grande":"Evento normal");
    }
    public static String num_Event(){
        return String.format("M%d",(int)(Math.random()*100)+1);
    }

    
}
