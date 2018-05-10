/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples.of.three;

/**
 *
 * @author Abdullahi Abdulkabir
 */
public class MultiplesOfThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 1;
        while(count<100){
            if(count %3 == 0){
                  System.out.println("This is a multiple of three");
             }
            else{
             System.out.println(count);   
            }
            count++;
        }
         
    }
    
}
