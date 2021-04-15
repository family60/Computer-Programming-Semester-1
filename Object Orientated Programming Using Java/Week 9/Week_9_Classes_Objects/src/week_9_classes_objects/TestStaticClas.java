/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9_classes_objects;

/**
 *
 * @author Ronak
 */
public class TestStaticClas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StaticExample s1 = new StaticExample();
       System.out.println("The value of count after creating s1 " +StaticExample.count);
       StaticExample s2 = new StaticExample();
       System.out.println("The value of count after creating s2 " +s2.count);
        System.out.println("The value of count using class name  " +StaticExample.count);
                System.out.println("The value of count using static method  " +StaticExample.getValueOfCount());
    }
    
}
