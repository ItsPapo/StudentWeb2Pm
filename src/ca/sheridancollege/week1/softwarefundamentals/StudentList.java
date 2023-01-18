/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A class that creates an Array of Students and populates it
 * with 5 students from the current section and then iterates over the
 * list to print each name.
 * @author castr 
 */
public class StudentList {
    
    public static void main(String[] args)
    {
       Student [] studentList = new Student[1];//change size before running
       Student s1 = new Student();
       Student s2 = new Student();
       Student s3 = new Student();
       Student s4 = new Student();
       Student s5 = new Student();
       s1.setName("Carlos Castro");
       s1.setName("Carlos Castro 2");
       s1.setName("Carlos Castro 3");
       s1.setName("Carlos Castro 4");       
       s1.setName("Carlos Castro 5");
                            
       studentList[0]=s1;
       studentList[1]=s2;
       studentList[2]=s3;
       studentList[3]=s4;
       studentList[4]=s5;
       //fill in 4 student names before running
       for(Student s: studentList)
       {
           System.out.println(s.getName());
       }
        
    }
    
}
