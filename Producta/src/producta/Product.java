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
public abstract class  Product {
    
    String name;
    int barcode;
    double baseprice;
    final double tax = 1.2;
    
    public Product (String name, int barcode, double baseprice)
    {
    this.name = name;
    this.barcode = barcode;
    this.baseprice = baseprice;
    
    }
    
    
    
      @Override
    public String toString()
    {
        return "Product " + name + "Barcode" + barcode + "Price" + price();
    }
    
    public double price()
            
    {
    return this.baseprice * tax;
    
    }
    
    
   
    
    
    
    
}
