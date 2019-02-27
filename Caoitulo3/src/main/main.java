
package main;

import caoitulo3.ArithmeticMethods;
import caoitulo3.ArithmeticMethods2;
import caoitulo3.BankAccount;
import caoitulo3.CarlysEventPriceWithMethods;
import caoitulo3.Ejercicio1;
import caoitulo3.Event;
import caoitulo3.EventDemo;
import caoitulo3.GasPrices;
import caoitulo3.Insurance;
import caoitulo3.Interest;
import caoitulo3.MetricConversion;
import caoitulo3.PaintCalculator;
import caoitulo3.Painting;
import caoitulo3.Percentages;
import caoitulo3.Percenteges2;
import caoitulo3.Rental;
import caoitulo3.Salary;
import caoitulo3.SammysRentalPriceWithMethods;
import caoitulo3.Sandwich;
import caoitulo3.ShowStudent;
import caoitulo3.ShowStudent2;
import caoitulo3.Student;
import caoitulo3.TestPainting;


public class main {
    public static void main(String[]args){
     
        System.out.println("Ejercicio 1\n");
        Ejercicio1 ejer=new Ejercicio1();
        System.out.println(ejer.calcula(4,2.2));
        System.out.println("\nEjercicio 2");
        System.out.println("obA.c=5; es permitido por el metodo set porque no es privado\nobA.d=23; pasa lo mismo");
        System.out.println("ClassA.c=33; es permitido con el metodo set\nClassA.d=99; es permitido si se usa el metodo set");
        System.out.println("\nEjercicio 3");
        System.out.println("A)");
        ArithmeticMethods am=new ArithmeticMethods();
        System.out.println(am.displayNumberPlus10());
        System.out.println(am.displayNumberPlus100());
        System.out.println(am.displayNumberPlus1000());
        System.out.println("B)");
        ArithmeticMethods2 am2=new ArithmeticMethods2(1,2);
        System.out.println(am2.displayNumberPlus10());
        System.out.println(am2.displayNumberPlus100());
        System.out.println(am2.displayNumberPlus1000());
System.out.println("\nEjercicio 4");
Percentages pr = new Percentages(2.0,5.0);
        System.out.println(pr.toString());
        Percentages pr2 = new Percentages(5.0,2.0);
        System.out.println(pr2.toString());
Percenteges2 p2 = new Percenteges2(3.0,5.0);
        System.out.println(p2.toString());
System.out.println("\nEjercicio 5");
GasPrices gp=new GasPrices(120);
        System.out.println(gp.Gasolina()); 


System.out.println("\nEjercicio 6");
MetricConversion mt = new MetricConversion(100);
        System.out.println(mt);
System.out.println("\nEjercicio 7");
 PaintCalculator pc=new PaintCalculator(15,10,20);
        System.out.println(pc.toString());


System.out.println("\nEjercicio 8");
Insurance ins = new Insurance(1997,2019);
        System.out.println(ins);




System.out.println("\nEjercicio 9");
Salary s=new Salary(2,8,8);
        System.out.println(s.toString());


System.out.println("\nEjercicio 10");
Interest inter = new Interest(30000);
        System.out.println(inter);




System.out.println("\nEjercicio 11");
Sandwich sa=new Sandwich("cecina","blanco");
        System.out.println(sa.toString());


System.out.println("\nEjercicio 12");
Student sn=new Student(23,2,20);
        ShowStudent std = new ShowStudent(sn);
        System.out.println(std.getStud());


Student sn2 = new Student();
        ShowStudent2 std2=new ShowStudent2(sn2);
        System.out.println(std2.getShow2());




System.out.println("\nEjercicio 13");
BankAccount ba=new BankAccount();
        System.out.println(ba.toString());


System.out.println("\nEjercicio 14");
Painting paint1 = new Painting("Techo Blanco","Sosa","Acuarela",30.0);
       Painting paint2 = new Painting("Oaxaca","Claudia","Agua",60.0);
       Painting paint3 = new Painting();
       TestPainting tpaint1 = new TestPainting(paint1);
       TestPainting tpaint2 = new TestPainting(paint2);
       TestPainting tpaint3 = new TestPainting(paint3);
       System.out.println(tpaint1);
       System.out.println(tpaint2);
       System.out.println(tpaint3);
  

System.out.println("\nEjercicio 1");
       System.out.println(CarlysEventPriceWithMethods.mensaje());
       System.out.println(CarlysEventPriceWithMethods.calculate());
       Integer b;
       b=CarlysEventPriceWithMethods.invitados();
       String str,srtt;
       str=CarlysEventPriceWithMethods.num_Event();
       Event ev = new Event(str,b);
       srtt=CarlysEventPriceWithMethods.mensaje();
       EventDemo evd = new EventDemo(ev,srtt);
       System.out.println(evd);
System.out.println("\nEjercicio 2");
SammysRentalPriceWithMethods samys = new SammysRentalPriceWithMethods(120);
       Rental rent = new Rental(samys);
       System.out.println(rent);




    } 
    
}
