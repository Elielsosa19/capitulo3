
package caoitulo3;
public class MetricConversion {
     private Integer number;
    public static final Double PULGADA_EN_CM= 2.54;
    public static final Double LTS_EN_GALON=3.7854;
    public MetricConversion(Integer number){
        this.number=number;
    }
    public Integer getNumber(){
        return this.number;
    }
    public void setNumber(Integer number){
        this.number=number;
    }
    public Double convertsInches(){
        return this.getNumber()*PULGADA_EN_CM;
    }
    public Double convertsLiters(){
        return this.getNumber()*LTS_EN_GALON;
    }
    @Override
    public String toString(){
        return String.format("Conversión de pulgadas a centímetros es: %.4f\nConversion de Galones a litros es: %.4f",this.convertsInches(),this.convertsLiters());
    }

}
