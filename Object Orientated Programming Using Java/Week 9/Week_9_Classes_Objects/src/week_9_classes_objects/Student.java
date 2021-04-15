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
public class Student {
    int studNo;
    String studname;
    String sType;
    Student (){
        studNo=1;
        studname="aa";
    }
    Student(int sno, String sname){
        studNo=sno;
        studname=sname;
    }
    Student(int sNo,String sname,String type){
        studNo =sNo;
        studname=sname;
        sType=type;
    }
    public void printInfo(){
        System.out.println("Student no is :" +studNo);
        System.out.println("Student name is :" +studname);
        System.out.println("Student type is :" +sType);
    }
}
