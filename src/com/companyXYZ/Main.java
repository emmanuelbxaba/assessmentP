package com.companyXYZ;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Collection<Student> c = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in); // for integer
        Scanner s1 = new Scanner(System.in); // for String



        int option;
       do{
           System.out.println("1.Insert");
           System.out.println("2.Display");
           System.out.println("3.Search");
           System.out.println("4.Delete");
           System.out.println("5.Update");
           System.out.print("Enter your choice : ");
           option = sc.nextInt();

           switch(option){
               case 1:
                   System.out.print("Enter your student Id :");
                   int sno = sc.nextInt();
                   System.out.print("Enter your name : ");
                   String name = s1.nextLine();
                   System.out.print("Enter your surname : ");
                   String surname = s1.nextLine();
                   System.out.print("Enter your age : ");
                   int sage = sc.nextInt();
                   System.out.print("Enter your curruculum : ");
                   String course = s1.nextLine();

                   c.add (new Student(sno,name,surname,sage,course));
                   break;
                   case 2:
                   System.out.println("------------------------------");
                   //break;
                   Iterator<Student> i = c.iterator();

                   while (i.hasNext()) {
                      Student s = i.next();
                       System.out.println(s);
           }
                   System.out.println("--------------------------");
                   break;
               case 3:
                   Boolean found = false;
                   System.out.println("Please enter studentID to search ");
                   sno = sc.nextInt();
                   System.out.println("----------------------");
                   i = c.iterator();
                   while (i.hasNext()){
                       Student s = i.next();
                       if(s.getStudentId() == sno) {
                           System.out.println(s);
                           found = true;
                       }
                   }
                   if (!found){
                       System.out.println("Record not found");
                   }
                   System.out.println("--------------------");
                   break;

               case 4:
                   found = false;
                   System.out.print("Enter studentID to delete : ");
                   sno = sc.nextInt();
                   System.out.print("------------------");
                   i = c.iterator();
                   while (i.hasNext()){
                       Student s = i.next();
                       if(s.getStudentId() == sno){
                           i.remove();
                           found = true;
                       }
                   }
                   if (!found){
                       System.out.println("record not found");
                   } else {
                       System.out.println("record deleted successfully");
                   }
                   System.out.println("----------------------------");
                   break;

               case 5:
                   found = false;
                   System.out.print("Enter studentID to upodate : ");
                   sno = s1.nextInt();
                  // System.out.println("-------------------------");

                  ListIterator<Student> li = ((ArrayList<Student>) c).listIterator();
                   while (li.hasNext()){
                       Student s = li.next();
                       if(s.getStudentId() == sno){

                           System.out.print("Enter your new name : ");
                           name = s1.nextLine();

                           System.out.print("Enter your new surname : ");
                           surname = s1.nextLine();
                           System.out.print("Enter your recent age : ");
                           sage = sc.nextInt();
                           System.out.print("Enter your new curruculum : ");
                           course = s1.nextLine();

                           li.set(new Student(sno, name, surname, sage, course));
                           found = true;
                       }
                   }
                   if (!found){
                       System.out.println("recrd not found");
                   } else {
                       System.out.println("record has been updated successfully!");
                   }

                   break;
           }

       } while (option !=0);
    }
}

