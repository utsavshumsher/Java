import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter the first number A:");
        int a = check.nextInt();
        System.out.println("Enter the second number B:");
        int b = check.nextInt();
        if (a>b){
            System.out.println("A is greater");

        }
        else{
            System.out.println("B is greater");
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