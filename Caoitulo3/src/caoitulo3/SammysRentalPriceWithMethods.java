
package caoitulo3;

public class SammysRentalPriceWithMethods {
        private Integer min;
    public static final Integer COST =40;
    public SammysRentalPriceWithMethods(Integer min){
        this.min=min;
    }
    public Integer getMin() {
        return min;
    }
    public void setMin(Integer min) {
        this.min = min;
    }
    public Integer priceTotal(){
        return (((this.getMin()/60)*COST)+(this.getMin()%60));
    }
    @Override
    public String toString(){
        return String.format("Horas de alquiler: %d\nMinutos de alquiler: %d\nPrecio total: %d",this.getMin()/60,this.getMin()%60,this.priceTotal());
    }
    public String lemaS(){
        return "*****************************************\n* Sammy´s lo hace divertido bajo el sol *\n*****************************************";
    }   

    
}
