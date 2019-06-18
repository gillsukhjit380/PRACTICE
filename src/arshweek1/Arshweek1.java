/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arshweek1;

import java.util.Scanner;

/**klmikjmuijnujuiiu
 *
 * @author Ankush
 */
public class Arshweek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] str = new String[5];
        System.out.println("enter the 5 elements");
        for(int i=str.length-1;i>=0;i--)
        {
            Scanner sc = new Scanner(System.in);
            str[i]=sc.next();
            
        }
        for(String e: str )
        {
            System.out.println("The elements are:"+e);
                
        }
        
    }
    
}
