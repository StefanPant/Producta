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
public class Wine extends Product{
    
    double unitofmessure;
    
    final double alctax = 1.1;
    
    public Wine (String name,int barcode, double baseprice, double unitofmessure)
    {
    super(name,barcode,baseprice);
    this.unitofmessure = unitofmessure;
    
    }
    
      @Override
    public double price(){
    
  return  super.price()*alctax;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "Unit of messure" + unitofmessure;
      
    }
}
