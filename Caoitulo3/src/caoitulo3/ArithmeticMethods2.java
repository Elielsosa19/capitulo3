
package caoitulo3;
public class ArithmeticMethods2 {

    private Integer v1;
    private Integer v2;
    
    public ArithmeticMethods2(Integer v1,Integer v2){
        this.v1=v1;
        this.v2=v2;
    }


    public String displayNumberPlus10(){
        return String.format("%d %d",this.getV1()+10,this.getV2()+10);
    }
    public String displayNumberPlus100(){
        return String.format("%d %d",this.getV1()+100,this.getV2()+100);
    }
    public String displayNumberPlus1000(){
        return String.format("%d %d",this.getV1()+1000,this.getV2()+1000);
    }
   
    public Integer getV1() {
        return v1;
    }


   
    public void setV1(Integer v1) {
        this.v1 = v1;
    }


  
    public Integer getV2() {
        return v2;
    }


    
    public void setV2(Integer v2) {
        this.v2 = v2;
    }
    
    
}
    

