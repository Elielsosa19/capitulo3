
package caoitulo3;
public class PaintCalculator {
    private static Integer PRICE=32;
    private static Integer COVER=350;
    private Integer l;
    private Integer a;
    private Integer al;
    public Integer calculadoraArea(){
        return (getL()*getAl())*2+(getA()*getAl())*2;
    }
    
    public Integer numgal(){
        return calculadoraArea()/getCOVER();
    }
    public Integer costo(){
        return numgal()*getPRICE();
    }
    @Override
    public String toString(){
        return String.format("El costo de pintar una sala de %d x %d x %d es de $%d",this.l,this.a,this.al,this.costo());
    }
    
    public PaintCalculator(Integer l,Integer al,Integer a){
        this.a=a;
        this.al=al;
        this.l=l;
               
    }
    public static Integer getPRICE() {
        return PRICE;
    }
    public static void setPRICE(Integer aPRICE) {
        PRICE = aPRICE;
    }
    public static Integer getCOVER() {
        return COVER;
    }
    public static void setCOVER(Integer aCOVER) {
        COVER = aCOVER;
    }

    public Integer getL() {
        return l;
    }

    public void setL(Integer l) {
        this.l = l;
    }
    public Integer getA() {
        return a;
    }
    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getAl() {
        return al;
    }
   
    public void setAl(Integer al) {
        this.al = al;
    }
    
}

 

