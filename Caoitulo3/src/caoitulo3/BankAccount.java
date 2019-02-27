
package caoitulo3;
public class BankAccount {
    private Integer id;
    private String nombre;
    private Integer saldo;
    
    public BankAccount(){
        this.id=333;
        this.nombre="Bruce Juan Lopez";
        this.saldo=133;
    }


     public Integer BankAccount(){
        return this.getSaldo()-4;
    }
    
    public static String ExplayAccountPolicy(){
        return "La tarifa de si servicio se reducira $4 al mes";
    }
    
    public String toString(){
        return String.format("ID:%d\nNombre:%s\nSaldo:%d\n%s\nSaldo:%d",this.getId(),this.getNombre(),this.getSaldo(),ExplayAccountPolicy(),this.BankAccount());
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    

    
}
