import jdk.swing.interop.SwingInterOpUtils;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

////1. Using switch statement Write a JAVA program to input marks of five subjects Physics,
////Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
////following:
////Percentage >= 90% : Grade A
////Percentage >= 80% : Grade B
////Percentage >= 70% : Grade C
////Percentage >= 60% : Grade D
////Percentage >= 40% : Grade E
////Percentage < 40% : Grade F
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.println("Enter Chemistry marks: ");
        int Chemistry = sc.nextInt();
        System.out.println("Enter Bio marks: ");
        int Bio = sc.nextInt();
        System.out.println("Enter Maths marks: ");
        int Maths = sc.nextInt();
        System.out.println("Enter Computer marks: ");
        int computer= sc.nextInt();
        int sum=physics+Chemistry+Bio+Maths+computer;
        int per=(sum*100)/500;

        switch ((per>=90&&per<=100)?0:(per>=80&&per<90)?1:(per>=70&&per<80)?2:(per>=60&&per<70)?3:(per>=40&&per<60)?4:(per<40)?5:6) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("D");
                break;
            case 4:
                System.out.println("E");
                break;
            case 5:
                System.out.println("F");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}


//2. JAVA Program to find the maximum between two numbers. Using the switch statement.

class maxi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.println("Enter a number:");
        int b=sc.nextInt();
        switch ((a>b)?0:(b>a)?1:2) {
            case 0:
                System.out.println(a+ " is greater.");
                break;
            case 1:
                System.out.println(b+ " is  greater");
                break;
            default:
                System.out.println("Both are equal");
                break;
        }
    }
}


//3. JAVA Program to find the maximum between three numbers. Using the switch statement.
class three{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.println("Enter a number: ");
        int b=sc.nextInt();
        System.out.println("Enter a number: ");
        int c=sc.nextInt();
        switch ((a>b)?0:(b>c)?1:(c>a)?2:3){
            case 0:
                System.out.println(a+" is greatest.");
                break;
            case 1:
                System.out.println(b+ " is greatest.");
                break;
            case 2:
                System.out.println(c+ " is greatest.");
                break;
            default:
                System.out.println("All are equal.");
                break;
        }
    }
}

//4. JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
//statement.
class Divisible{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int a=num%11;
        int b=num%5;
        switch(num%11){
            case 0:
                switch (num%5){
                    case 0:
                        System.out.println("Divisible by 5 and 11");
                        break;
                    default:
                        System.out.println("Not Divisible");
                        break;
                }break;
            default:
                System.out.println("Not divisible");
                break;

        }
    }
}

//5. JAVA Program to check whether a year is a leap year or not. Using switch statement
class Year{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Year:" );
        int year=sc.nextInt();
        boolean leap=false;
        switch (year%4){
            case 0:
                switch(year%100){
                    case 0:
                        switch (year%400){
                            case 0:
                                leap=true;
                                break;
                            default:
                                leap=false;
                        }break;
                    default:
                        leap=true;
                        break;
                }break;
            default:
                leap=false;
                break;
        }
//        switch (leap){
//            case 0:
//                System.out.println("Leap year");
//                break;
//            case 1:
//                System.out.println("NO year leap");
//                break;
//        }break
        if (leap) {
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");

        }
    }
}


//6. JAVA Program to check whether a character is an alphabet or not. Using the switch statement.
class word{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word: ");
        char word=sc.next().charAt(0);
        switch ((word>='a'&& word<='z')?0:1){
            case 0:
                System.out.println(word+ " is character.");
                break;
            case 1:
                System.out.println(word+ " is not a character.");
                break;

        }
    }
}
//7. JAVA Program to take the value from the user as input any alphabet and check whether it is
//vowel or consonant. Using the switch statement.
class lphabet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word :");
        char a=sc.next().charAt(0);
        switch(a){
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.println(a+" is vowel.");
                break;
            default:
                System.out.println(a+ " is consonant.");
                break;
        }

    }
}

//8. JAVA Program to take the value from the user as input any character and check whether it is
//the alphabet, digit or special character. Using the switch statement.
class checkk{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Character: ");
        char a=sc.next().charAt(0);
        switch((a>='a'&&a<='z')?0:1){
            case 0:
                System.out.println(a+ " is alphabet.");
                break;
            case 1:
                switch((a>='0'&&a<='9')?0:1){
                    case 0:
                        System.out.println(a+ " is Number.");
                        break;
                    default:
                        System.out.println(a+" is special number.");
                        break;

                }
        }
    }
}

//9. JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the
//switch statement.
class upperlower{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word: ");
        char a=sc.next().charAt(0);
        switch((a>='a'&&a<='z')?0:1){
            case 0:
                System.out.println(a+ " is lowercase.");
                break;
            case 1:
                switch ((a>='A'&&a<='Z')?0:1){
                    case 0:
                        System.out.println(a+ " is uppercase.");
                        break;
                    case 1:
                        System.out.println(a+ " is not alphabet.");
                        break;
                }
        }
    }
}
//10. JAVA Program to take the value from the user as an input week number and print weekday by
//using the switch statement.
class weekk{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Week Number(1-7): ");
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Error number");
                break;

        }
    }
}

//11. JAVA Program to take the value from the user as input the month number and print number of
// days in that month. Using switch statement.
class mobnth{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Month number(1-12): ");
        int a=sc.nextInt();
        switch (a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days.");
                break;
            case 2:
                System.out.println("Year:");
                int year=sc.nextInt();
                boolean leap=false;
                switch (year%4){
                    case 0:
                        switch(year%100){
                            case 0:
                                switch(year%400){
                                    case 0:
                                        leap=true;
                                        break;
                                    case 1:
                                        leap=false;
                                        break;
                                }break;
                            case 1:
                                leap=true;
                                break;
                        }break;
                    case 1:
                        leap=false;
                        break;
                }
                if (leap) {
                    System.out.println("28 Days");
                }else{
                    System.out.println("29 Days");
                }
        }
    }
}

//12. JAVA Program to count the total number of notes in a given amount. Using the switch
//statement.

//13. JAVA Program to take the value from the user as input all sides of a triangle and check whether
//   the triangle is valid or not. Using switch statement

class trianglee{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first side: ");
        int a=sc.nextInt();
        System.out.println("Enter second side: ");
        int b=sc.nextInt();
        System.out.println("Enter third side: ");
        int c=sc.nextInt();
        switch (((a+b+c)!=180)?0:1){
            case 0:
                System.out.println("Not Valid");
                break;
            case 1:
                System.out.println("Valid");
                break;
        }
    }
}

//14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
//Using switch statement.
class tri{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first side: ");
        int a=sc.nextInt();
        System.out.println("Enter second side: ");
        int b=sc.nextInt();
        System.out.println("Enter third side: ");
        int c=sc.nextInt();
        switch(((a+b+c)==180)?0:1){
            case 0:
                switch((a==b&&b==c)?0:1){
                    case 0:
                        System.out.println("It is equilateral.");
                        break;
                    case 1:
                        switch ((a==b ||b==c||c==a)?0:1){
                            case 0:
                                System.out.println("It is isosceles.");
                                break;
                            case 1:
                                System.out.println("It is Scalene triangle.");
                        }break;
                }break;
            case 1:
                System.out.println("Invalid number.");
        }
    }
}