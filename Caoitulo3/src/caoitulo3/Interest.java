
package caoitulo3;
public class Interest {
     private Integer money;
    public Interest(Integer money){
        this.money=money;
    }
    public Integer getMoney(){
        return this.money;
    }
    public void setMoney(Integer money){
        this.money=money;
    }
    public Double interes(){
        return this.getMoney()*0.05;
    }
    public Double inversion(){
        return this.getMoney()+this.interes();
    }
    @Override
    public String toString(){
        return String.format("La cantidad de inversion tras un años es de: %.2f",this.inversion());
    }

    
}
