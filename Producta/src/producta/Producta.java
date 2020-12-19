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
public class Producta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chocolate Chock = new Chocolate("Nussknacker",061456, 200, 100);
        Wine Wine1 = new Wine("Sauvignon Blanc",016515,300,1);
       
        
   
         System.out.println(Chock.toString());
         System.out.println(Wine1.toString());
         
    }
    
}
