/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg6.poo.Pra6_2;

/**
 *
 * @author aeld
 */
public class PagoAlContado extends Pago{
    
    public PagoAlContado(Integer id, Double p){
        super(id, p);
    }
    
    public void pagar(){
        System.out.println("Cantidad a Pagar: $" + this.getPago().toString() + "\n**El cliente pagó al contado**");
    }
}
