import java.nio.file.attribute.PosixFileAttributeView;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

import javax.sql.rowset.WebRowSet;

public class anup {

    //Creating a method 
    static int sum(int a,int b){
        return a+b;
       }
    

    public static void main(String[] args) {

       
        



       /* for(int i=0 ; i<5; i++){

            System.out.println("Hello World");
        }
         */
        // defining integer and float
        // int a=5;
        // float b=6.5f;
        // System.out.println(a+b);

        //defining string
        // String ap="Anup Kumar Jana";
        // System.out.println(ap);

        // //defining boolean
        // boolean isEmpty= true;
        // System.out.println(isEmpty);

        /* there are two data tyoes in Java
        1. Premitive- 
        byte (1byte), short(2bytes), char(2bytes), int(4bytes), long(8bytes), 
        float(4bytes), double(8bytes), boolean(8bytes)

        2. Non Premitive or Refernce data type-

         
        */
        //Premitive-
        // byte u=56; //byte stores only -180 to 127

        // double d= 45.55656d;
        // System.out.println(d);

        // char grade= 'A';
        // System.out.println(grade);

        /*Operators in Java
         Operand, Operator, Operand = result
         4            +          7      11
         
         
         

         Types of operators in Java
         Arithmatic operator
         Assignment operator
         Logical operator
         Comparison operator
         */
        // int num1=45, num2=78;
        // System.out.print("The value of num1 + num2: ");
        // System.out.println(num1+num2);

        // System.out.print("The value of num1 - num2: ");
        // System.out.println(num1-num2);

        // System.out.print("The value of num1 * num2: ");
        // System.out.println(num1*num2);

        // System.out.print("The value of num1 / num2: ");
        // System.out.println(num1/num2);

        // System.out.print("The value of num1 % num2: ");
        // System.out.println(num1%num2);
        
        // System.out.print("The value of num1: ");
        // System.out.println(num1++);   //here num1 initially 45 so it printed 45 and then did 45+1=46

        // System.out.print("The value of num1: ");
        // System.out.println(++num1); //here from the previous line num1=46 then it'll add 1+46=47

        // System.out.print("The value of num1: ");
        // System.out.println(num1--); // here from the previous line num1=47 it'll print 47 then it'll 47-1=46

        // System.out.print("The value of num1: ");
        // System.out.println(--num1); // here from the privous line num1=46 then 46-1=45, it'll print 45
        
        


        /*
    * Comparison Operators:
    * 1. == : checks for equality of two values
    * 2. != : checks if two values are not equal
    * 3. <
    * 4. >
    * 5. <=
    * 6. >=
    *
    * Logical Operators:
    * 1. && - Logical and operator - returns true only if both conditions are true
    * 2. || - Logical or operator - returns true if any one condition is true
    * 3. ! - Logical not - Reverse the result from true to false and vice versa
    * */

    //Taking User input in Java
    // Scanner scan= new Scanner(System.in); // it means we take a b=ibject from scanner class,and system.in means we want input ftom the keyboard
    // System.out.println("Enter input: "); 
    // String input= scan.nextLine();
    // System.out.println(input);

    // Scanner scan1= new Scanner(System.in); // it means we take a b=ibject from scanner class,and system.in means we want input ftom the keyboard
    // System.out.println("Enter age: "); 
    // int input1= scan1.nextInt();
    // System.out.println(input1);
     
    


    //Strings
    // String name= "Anup";
    // String website="Aux Solutions";
    // System.out.println(name);
    // System.out.println(name.length());
    // System.out.println(name.toUpperCase());
    // System.out.println(name.toLowerCase());

    // System.out.println(name + " from " + website);

    // System.out.println(name + " from \"" + website +"\""); //" \" " is for give quotation, this is called escape sequence

    // System.out.println(name + " from\\ " + website);  // for printing \ we did this. this is called escape sequence

    // System.out.println(name + " from\t " + website); // for tabor big space

    // System.out.println(name + " from\n " + website); // for printing in new line

        // System.out.println(name.contains("An")); // is the name variale contains An? it'll print true
        // System.out.println(name.charAt(2)); // it'll show me the char index at 2
        // System.out.println(name.endsWith("up")); // it'll show me, wheather "up" in the end of name or not
        // System.out.println(name.indexOf("nup")); // this will give me from which index "nup" starts from
        
        // int num1=4, num2=7;
        // System.out.println("max of num1 and num2 is: "+Math.max(num1,num2));
        // System.out.println("min of num1 and num2 is: "+Math.min(num1,num2));
        // System.out.println("Square root of 6 is: "+Math.sqrt(36));
        // System.out.println("Qube root of 6 is: "+Math.round(Math.cbrt(65)));
        // System.out.println("Absolute value of -6 is: "+Math.abs(-6)); //absolute valule of -6
        // System.out.println("Any random value is : "+Math.random()); // it'll print a random number
        // System.out.println("Any random value btwn 4 and 8 is: "+4+(8-4)*Math.random()); // it'll print random number btwn 4-->8


    //Taking User input in Java
        // Scanner scan= new Scanner(System.in); // it means we take a b=ibject from scanner class,and system.in means we want input ftom the keyboard
        // System.out.println("Enter age: "); 
        // int age= scan.nextInt();
        // System.out.println("Your age is: "+age);

        // if else contions
        // if(age<18){
        //     System.out.println("You're underaged.");
        // }

        // else if(age>=18 && age<30){
        //     System.out.println("You're an adult.");
        //     }
        // else if(age>=30 && age<=60){
        //     System.out.println("You're Middle aged.");
        // }
        
        // else{
        //     System.out.println("You're old.");
        // }
        

        //Switch statement in java
            // switch(age){
            //     case 12:
            //     System.out.println("You're 12 years old");
                    // break;
            //     case 60:
            //     System.out.println("You're 60 years old");
            //     break;
            //     case 40:
            //     System.out.println("You're 40years old");
            //     break;
            //     default:
            //     System.out.println("You did not match any of the cases");
            // }


            //You have to write the days name in the range 1 to 7
            // Scanner scan= new Scanner(System.in);
            // System.out.println("Enter the number");
            // int days_number=scan.nextInt();

            // switch(days_number){
            //     case 1:
            //     System.out.println("Sunday");
            //     break;
            //     case 2:
            //     System.out.println("Monday");
            //     break;
            //     case 3:
            //     System.out.println("Tuesday");
            //     break;
            //     case 4:
            //     System.out.println("Wednesday");
            //     break;
            //     case 5:
            //     System.out.println("Thursday");
            //     break;
            //     case 6:
            //     System.out.println("Friday");
            //     break;
            //     case 7:
            //     System.out.println("Saturday");
            //     break;
            //     default:
            //     System.out.println("You've given a wrong input");
            // }


            //Loops in Java

            //while loop

            // int i=0;
            // while (i<=100){
            //     System.out.println(i);
            //     i+=1;
            //}

            //Do- While loop

            // int j=0;
            // do{
            //     System.out.println(j);
            //     j+=1;
            // }
            // while(j<100);

            //for loop
            // for(int i=0; i<10;i++){
            //     System.out.println(i);
            // }

            // for(int i=0; i<10;i++){
            //     if(i>=5){     
            //         break;    //it means that when i is less than or equal to five then break the loop
            //     }
            //     else{
            //         System.out.println(i);
            //     }
            // }

            //  for(int i=0; i<10;i++){
            //     if(i==5){     
            //         continue;    //it means that when i is equal to five then skip the 5 and print the next iteration
            //     }
            //         System.out.println(i);
            // }



            //Java Arrays
            // int [] marks={1,2,5,6,8}; //define a array
            // marks[2]=34; //this will replace marks[2] as 34
            // for(int i=0; i<marks.length;i++){
            //     System.out.println(marks[i]);
            // }

            // int [][] matrix={{1,2,3},{4,5,6}}; // defining a 2d array
            // System.out.println(matrix[0][1]);
            
            // String [] cars={"Maruti", "Hyundai", "Ford", "Toyota"};
            // for (String value:cars){
            //     System.out.println(value);
            // }

            //Try- catch in JAVA
            /*when my any line gives me error and for that my next line
            cxan't be printed then we use try and catch method which try the error wala line
            and then it catches the error and help to print the next line */
            
            // String [] cars={"Maruti", "Hyundai", "Ford", "Toyota"};
            // try{
            //     System.out.println(cars[5]);
            // }
            // catch(Exception e){
            //     System.out.println(e);
            // }
            // System.out.println("Masoom");

           
           //calling sum method here
           // System.out.println(sum(4,7));
            
            
            // Mini Project
            float num1, num2;
            System.out.println("Enter the first number: ");
            Scanner scan= new Scanner(System.in);
            num1 =scan.nextFloat();
            
            System.out.println("Enter the second number: ");
            Scanner scan1= new Scanner(System.in);
            num2 =scan1.nextFloat();
            
            System.out.print("You have entered ");
            System.out.print(num1);
            System.out.print(" and ");
            System.out.println(num2);
            
            String prompt="Enter 0 for addition, enter 1 for substraction, 2 for multiplication, 3 for divison.";
            System.out.println(prompt);

            int input=scan.nextInt();
            switch(input){
                case 0:
                System.out.println("Your addition is: "+ (num1+num2));
                break;

                case 1:
                System.out.println("Your substraction is: "+ (num1-num2));
                break;

                case 2:
                System.out.println("Your multiplication is: "+ (num1*num2));
                break;

                case 3:
                System.out.println("Your division is: "+ (num1/num2));
                break;
                default:
                System.out.println("You've given a wrong input.");
            }
    }
}
