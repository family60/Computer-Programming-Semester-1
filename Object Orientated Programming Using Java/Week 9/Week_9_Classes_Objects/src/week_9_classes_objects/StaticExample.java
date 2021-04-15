/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9_classes_objects;


public class StaticExample {
     
     static int count=0;
    
    StaticExample(){
        count++;
    }
    public static int getValueOfCount(){
        return count;
    }
}
