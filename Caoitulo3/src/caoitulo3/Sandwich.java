
package caoitulo3;
public class Sandwich {
    private String ingrediente;
    private String pan;
    private double  precio;
    
    public Sandwich(String x,String y){
        this.ingrediente=x;
        this.pan=y;
        this.precio=15.39;
    }


    @Override
    public String toString(){
        return String.format("El ingrediente que eligio es %s, el pan es %s siendo un total de $%.2f",this.getIngrediente(),this.getPan(),this.getPrecio());
    }
    public String getIngrediente() {
        return ingrediente;
    }
    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public double getPrecio() {
        return precio;
    }
   public void setPrecio(double precio) {
        this.precio = precio;
    }
    

}
