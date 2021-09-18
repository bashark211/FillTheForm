package fillform;

import java.util.Scanner; //dependencies

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //syntax for inputting text
        System.out.print("enter first name:");
        String first= sc.nextLine(); //start with "String" for text and "int" for numbers, stores the value

        System.out.print("enter last name:");
        String last= sc.nextLine();

        System.out.print("enter your age:");
        int age= sc.nextInt();

        System.out.print("your full name is " +first +" " +last +" and you are " +age +" years old!");
    }
}
