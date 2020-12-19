/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producta;

/**
 *
 * @author Stefan
 */
public class Chocolate  extends Product{
    
    double weight;
    public Chocolate(String name, int barcode, double baseprice, double weight)
    {
   super(name, barcode, baseprice);
   this.weight = weight;

    
   
    
    }
   
    
    
    @Override
    public double price(){
    
    return super.price();
    }
     @Override
    public String toString()
    {
        return super.toString() + "Weight" + weight;
      
    }
    
}
