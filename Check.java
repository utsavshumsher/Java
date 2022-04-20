import javax.swing.*;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {


        int a= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number A: "));
        int b =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number B:"));
        if (a > b) {
            JOptionPane.showMessageDialog(null,"A is greater");
        }
        else{
            JOptionPane.showMessageDialog(null,"B is greater");
        }
    }
}
class check2{
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter first number a:");
        int a = check.nextInt();
        System.out.println("Enter second number b:");
        int b = check.nextInt();
        System.out.println("Enter third number c:");
        int c = check.nextInt();
        if(a>b && a>c){
            System.out.println("A is greater");

        }
        else if(b>c && b>a) {
            System.out.println("B is greater");


        }
        else{
            System.out.println("C is greater");
        }
    }
}


class check3{
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = check.nextInt();
        if (num>0){
            System.out.println("Number is positive");
        }
        else if(num<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}


class check4 {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = check.nextInt();
        if ((num % 5 == 0) && (num % 11 == 0)) {
            System.out.println("\n Given number is Divisible by 5 and 11");
        }
        else {
            System.out.println("Given number is  not Divisible by 5 and 11 ");
        }
    }
}



//5. Write a JAVA program to check whether a number is even or odd.
class Check5{
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=num.nextInt();

        if (a % 2 == 0) {
            System.out.println("Can be divisible by 2");
        }else{
            System.out.println("Cannot be divisible by 2");
        }
    }
}

//6. Write a JAVA program to check whether a year is leap year or not.
class Check6{
    public static void main(String[] args) {
        Scanner date=new Scanner(System.in);
        System.out.print("Year:");
        int year=date.nextInt();
        boolean leap=false;

        if (year % 4 == 0) {
            if (year % 100 ==0) {
                if (year % 100 == 0) {
                    leap=true;
                }else{
                    leap=false;
                }
            }else{
                leap=true;
            }
        }else{
            leap=false;
        }
        if (leap) {
            System.out.println(year+ " is a leap year.");
        }else{
            System.out.println(year+ " is not a leap year.");
        }
    }
}

//7. Write a JAVA program to check whether a character is alphabet or not.
class Check7{
    public static void main(String[] args) {
        Scanner any=new Scanner(System.in);
        System.out.println("Alphabet? :");
        char insert=any.next().charAt(0);

        if ((insert>='A')&&(insert<='Z')||((insert>='a')&&(insert<='z'))){
            System.out.println(insert+ " is an Alphabet");
        }else{
            System.out.println(insert+" is not an Alphabet");
        }
    }
}
//8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
class Check8{
    public static void main(String[] args) {
        Scanner consonant= new Scanner(System.in);
        System.out.print("Enter a word: ");
        char word=consonant.next().charAt(0);
        if (word=='a'||word=='e'||word=='i'||word=='o'||word=='u'){
            System.out.println(word+ " is vowel");
        }else{
            System.out.println(word+ " is consonant");
        }
    }
}

//9. Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.
class Check9{
    public static void main(String[] args) {
        Scanner character=new Scanner(System.in);
        System.out.println("Input a character: ");
        char insert=character.next().charAt(0);
        if ((insert>='a'&& insert<='z')||(insert>='A'&&insert<='Z')){
            System.out.println(insert+ " is alphabet");
        }else if((insert>='0'&&insert<='9')){
            System.out.println(insert+ " is a Number");
        }else{
            System.out.println(insert+ " is a special character");
        }
    }
}

//10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
class Check10{
    public static void main(String[] args) {
        Scanner word= new Scanner(System.in);
        System.out.println("Enter a word: ");
        char alphebt= word.next().charAt(0);
        if (alphebt>='a'&&alphebt<='z'){
            System.out.println(alphebt+ " is a lowercase alphabet");
        }else{
            System.out.println(alphebt+ " is a uppercase alphabet");
        }
    }
}

//11. Write a JAVA program to input week number and print weekday.
class Check11{
    public static void main(String[] args) {
        Scanner day=new Scanner(System.in);
        System.out.println("Enter week number: ");
        int daynum= day.nextInt();

        if (daynum==1){
            System.out.println("Sunday");
        } else if (daynum==2) {
            System.out.println("Monday");
        } else if (daynum==3) {
            System.out.println("Tuesday");
        } else if (daynum==4) {
            System.out.println("Wednesday");
        } else if (daynum==5) {
            System.out.println("Thursday");
        } else if (daynum==6) {
            System.out.println("Friday");
        } else if (daynum==7) {
            System.out.println("Saturday");
        }else {
            System.out.println("A week has only 7 days.");
        }
    }
}

//12. Write a JAVA program to input month number and print number of days in that month.
class Check12{
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter Month number: ");
        int monthn= number.nextInt();

        if (monthn==1){
            System.out.println(monthn+ " is January and has 31 days a month");
        } else if (monthn==2) {
            System.out.println(monthn+ " is February and has 28 days a month");
        } else if (monthn==3) {
            System.out.println(monthn+ " is March and has 31 days a month");
        } else if (monthn==4) {
            System.out.println(monthn+ " is April and has 30 days a month");
        } else if (monthn==5) {
            System.out.println(monthn+ " is May and has 31 days a month");
        } else if (monthn==6) {
            System.out.println(monthn+ " is June and has 30 days a month");
        } else if (monthn==7) {
            System.out.println(monthn+ " is July and has 31 days a month");
        }else if (monthn==8) {
            System.out.println(monthn+ " is August and has 31 days a month");
        } else if (monthn==9) {
            System.out.println(monthn+ " is September and has 30 days a month");
        } else if (monthn==10) {
            System.out.println(monthn+ " is October and has 31 days a month");
        } else if (monthn==11) {
            System.out.println(monthn+ " is November and has 30 days a month");
        } else if (monthn==12) {
            System.out.println(monthn+ " is December and has 31 days a month");
        } else {
            System.out.println("A year has only 12 months.");
        }
    }
}


//13. Write a JAVA program to count total number of notes in given amount.
class Check13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Denomination");
//        int Denomination=sc.nextInt();
        System.out.print("Amount:");
        int amount=sc.nextInt();

        while(amount>0){
            if (amount >= 1000) {
                System.out.println("No. of 1000 notes:" +amount/1000);
                amount=amount%1000;

            }else if(amount>=500){
                System.out.println("No.of 500 notes: "+amount/500);
                amount=amount%500;

            }else if (amount>=100){
                System.out.println("No. of 100 notes: "+amount/100);
                amount=amount/100;

            }else if (amount>50){
                System.out.println("No. of 50 notes: "+amount/50);
                amount=amount/50;

            }else if (amount>20){
                System.out.println("No, of 20 notes:" +amount/20);
                amount=amount/20;

            }else if (amount>10){
                System.out.println("No. of 10 notes:"+amount/10);
                amount=amount/10;

            }else if (amount>5){
                System.out.println("No. of 5 notes:"+amount/5);
                amount=amount/5;

            } else if (amount > 2) {
                System.out.println("No. of 2 notes:"+amount/2);
                amount=amount/2;

            }else {
                System.out.println("No.of 1 notes: " + amount / 1);
                amount = amount % 1;
            }
        }
    }
}

class Triangle{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the first angle: ");
        float f=scanner.nextFloat();
        System.out.println("Enter the second angle: ");
        float s=scanner.nextFloat();
        System.out.println("Enter the third angle: ");
        float t=scanner.nextFloat();

        float sum=f+s+t;

        if (sum==180){
            System.out.println("The triangle is valid");
        }
        else {
            System.out.println("The triangle is not valid");
        }
    }
}
class Side{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the first side: ");
        float f_side=scanner.nextFloat();
        System.out.println("Enter the second side: ");
        float s_side=scanner.nextFloat();
        System.out.println("Enter the third side : ");
        float t_side=scanner.nextFloat();

        if((f_side+s_side>t_side) &&
                (t_side+s_side>f_side)&&
                (f_side+t_side>s_side)){
            System.out.println("it is a valid triangle.");
        }
        else{
            System.out.println("it is not valid triangle");
        }
    }
}
class Check16{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amount = myobj.nextInt();
        int note1000,note500, note100, note50, note20, note10, note5, note2, note1;
        note1000 = note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;
        if(amount >= 1000)
        {
            note1000 = amount/1000;
            amount -= note1000 * 1000;
        }
        if(amount >= 500)
        {
            note500 = amount/500;
            amount -= note500 * 500;
        }
        if(amount >= 100)
        {
            note100 = amount/100;
            amount -= note100 * 100;
        }
        if(amount >= 50)
        {
            note50 = amount/50;
            amount -= note50 * 50;
        }
        if(amount >= 20)
        {
            note20 = amount/20;
            amount -= note20 * 20;
        }
        if(amount >= 10)
        {
            note10 = amount/10;
            amount -= note10 * 10;
        }
        if(amount >= 5)
        {
            note5 = amount/5;
            amount -= note5 * 5;
        }
        if(amount >= 2)
        {
            note2 = amount /2;
            amount -= note2 * 2;
        }
        if(amount >= 1)
        {
            note1 = amount;
        }

        System.out.println("Total number of notes = \n");
        System.out.println("1000 = "+note1000+"\n");
        System.out.println("500 = "+note500+"\n");
        System.out.println("100 = "+note100+"\n");
        System.out.println("50 = "+note50+"\n");
        System.out.println("20 = "+note20+"\n");
        System.out.println("10 = "+note10+"\n");
        System.out.println("5 = "+note5+"\n");
        System.out.println("2 = "+note2+"\n");
        System.out.println("1 = "+note1+"\n");
    }
}

/*16. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
 */

class Determine_triangle1{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the first side: ");
        float f_side=scanner.nextFloat();
        System.out.println("Enter the second side: ");
        float s_side=scanner.nextFloat();
        System.out.println("Enter the third side : ");
        float t_side=scanner.nextFloat();

        if(f_side==s_side &&f_side==t_side){
            System.out.println("it is a equilateral triangle.");
        }
        else if(f_side==s_side ||f_side==t_side){
            System.out.println("it is a isosceles triangle.");
        }
        else{
            System.out.println("it is a scalene triangle");
        }
    }
}
//17.
class RootsOfQuadratic {
    public static void main(String args[]) {
        double secondRoot , firstRoot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b :");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c :");
        double c = sc.nextDouble();

        double determinant = (b * b) - (4 * a * c);
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            firstRoot = (-b + sqrt) / (2 * a);
            secondRoot = (-b - sqrt) / (2 * a);
            System.out.println("Roots are :: " + firstRoot + " and " + secondRoot);
        } else if (determinant == 0) {
            System.out.println("Root is :: " + (-b + sqrt) / (2 * a));
        }
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}


//18. Write a JAVA program to calculate profit or loss.
class Profit_loss{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the cost price");
        double cp=scanner.nextDouble();
        System.out.println("Enter the selling price");
        double sp=scanner.nextDouble();

        if (cp>sp){
            double loss=cp-sp;
            System.out.println("The loss amount is\t"+loss);
        }
        else{
            double profit=sp-cp;
            System.out.println("The profit amount is\t"+profit);
        }
    }
}
/*19. Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,
Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/
class Marks{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the marks of Physics sub ");
        double f=scanner.nextDouble();
        System.out.println("Enter the marks of Chemistry sub ");
        double s=scanner.nextDouble();
        System.out.println("Enter the marks of math sub ");
        double t=scanner.nextDouble();
        System.out.println("Enter the marks of social sub ");
        double four=scanner.nextDouble();
        System.out.println("Enter the marks of Biology sub ");
        double five=scanner.nextDouble();

        double t_marks=f+s+t+four+five;
        double percent=(t_marks)/5;

        System.out.println("you total marks is "+ t_marks);
        System.out.println("you total percent is "+ percent);

        if (percent>=90){
            System.out.println("Grade A");
        }
        else if (percent>=80 && percent<=90){
            System.out.println("Grade B");
        }
        else if(percent>=70 && percent<=80){
            System.out.println("Grade C");
        }
        else if (percent>=60 && percent<=70){
            System.out.println("Grade D");
        }
        else if (percent>=50 && percent<=60){
            System.out.println("Grade E");
        }
        else if (percent>=40 && percent<=50){
            System.out.println("Grade F");
        }
        else{
            System.out.println("fail");
        }
    }
}
/*20. Write a JAVA program to input basic salary of an employee and calculate its Gross salary
according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%*/
class Salary{
    public static void main(String[] args) {
        double b_salary, hra, da, gross;
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the basic salary");
        b_salary=scanner.nextDouble();

        if (b_salary <= 10000 ){
            hra=b_salary*0.2;
            da=b_salary*0.8;
        }
        else if (b_salary <= 20000 ){
            hra=b_salary*0.25;
            da=b_salary*0.90;
        }
        else {
            hra=b_salary*0.3;
            da=b_salary*0.95;
        }
        gross=b_salary+hra+da;
        System.out.println("Gross salary is "+gross);

    }
}
/*21. Write a JAVA program to input electricity unit charges and calculate total electricity bill
according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill*/
class Electricity{
    public static void main(String[] args) {
        double units, bill_amount;
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the total units consumed");
        units=scanner.nextDouble();

        if (units<=50){
            bill_amount=units*0.5;
        }
        if (units>50 && units<=100){
            bill_amount=units*0.75;
        }
        if (units>100 && units<=250){
            bill_amount=units*1.20;
        }
        else {
            bill_amount=units*1.50;
        }
        System.out.println("The total bill amount is "+ bill_amount);
    }
}