
package caoitulo3;
public class Insurance {
 private Integer actual;
    private Integer nacimiento;
    public Insurance(Integer actual,Integer nacimiento){
        this.actual=actual;
        this.nacimiento=nacimiento;
    }
    public Integer getActual() {
        return actual;
    }
    public void setActual(Integer actual) {
        this.actual = actual;
    }
    public Integer getNacimiento() {
        return nacimiento;
    }
    public void setNacimiento(Integer nacimiento) {
        this.nacimiento = nacimiento;
    }
    public Integer getAge(){
        return this.getActual()-this.getNacimiento();
    }
    public Integer annualPolicyPremiums(){
        return (this.getAge()+15)*20;
    }
    @Override
    public String toString(){
        return String.format("La compañía de seguros de vida Harrison Group calculó su prima anual de la póliza, la cual es: $%d",this.annualPolicyPremiums());
    }
    
   
}
