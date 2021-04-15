/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_9_classes_objects;

import week_9_classes_objects.Student;

/**
 *
 * @author Ronak
 */
public class TestStudent {

   
    public static void main(String[] args) {
       Student s1 =new Student();//default constructor
       Student s2 = new Student(1234,"Ronak");
       Student s3 = new Student(1232,"xyz","PT");
       
       s1.printInfo();
       s2.printInfo();
       s3.printInfo();
    }
    
}
