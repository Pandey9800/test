//import java.util.Scanner;
//class Source {
//    public static void main(String[] args) {
//        int a,b,c;
//        Scanner ip = new Scanner(System.in);
//        System.out.println("Enter the Value of A");
//        a = ip.nextInt();
//        System.out.println("Enter the Value of B");
//        b = ip.nextInt();
//        System.out.println("Enter the Value of C");
//        c = ip.nextInt();
//        System.out.println(a*b+c);
//    }
//}

//********************************************************************

//import java.util.*;
// class Source {
//
//    public static void main(String[] args) {
//        int f,c;
//        Scanner ip = new Scanner(System.in);
//        System.out.println("Enter the Temperature in Celsius");
//        c = ip.nextInt();
//        f=(9*c)/5+32;
//        System.out.println(f + " Is your Temperature in Fahrenheit");
//    }
//}

//*************************************************************************

//import java.util.*;
//class Source {
//
//    public static void main(String[] args) {
//        double c,f;
//        Scanner ip = new Scanner(System.in);
//        c = ip.nextInt();
//        f=9*c/5+32;
//        System.out.println(f);
//    }
//}
//****************************************************
//import java.util.*;
//class Source {
//
//    public static void main(String[] args) {
//
//        Scanner input= new Scanner(System.in);
//        int a=input.nextInt();
//        float f=input.nextFloat();
//        double d=input.nextDouble();
//
//        float x = (float)a;
//        int y = (int)f;
//        float z = (float)d;
//        System.out.print("x=" +x);
//        System.out.print(" y=" +y);
//        System.out.print(" z=" +z);
//    }
//}
//        ****************************************************
//***************************************************

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        int c;
//        double f;
//        Scanner ip = new Scanner(System.in);
//        c = ip.nextInt();
//        f=9*(double)c/5+32;
//        System.out.println(f);
//    }
//}

//***************************************************

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        char a=56;
//        System.out.println(a);
//    }
//}

//***************************************************

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        String name;
//        int year;
//        Scanner input= new Scanner(System.in);
//        name=input.nextLine();
//        year=input.nextInt();
//        year = year+4;
//        System.out.println("Hello " +name);
//        System.out.println("Free Services Till: " +year);
//    }
//}

//***************************************************

//import java.util.*;
// class Source {
//    public static void main(String[] args) {
//        Scanner ip = new Scanner(System.in);
//        int num[];
//        num = new int[5];
//        num[0]=ip.nextInt();
//        num[1]=ip.nextInt();
//        num[2]=ip.nextInt();
//        num[3]=ip.nextInt();
//        num[4]=ip.nextInt();
//        System.out.println(num[4]);
//    }
//}

//***************************************************

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        int marks[], rollNumber;
//        marks= new int[5];
//        Scanner input= new Scanner(System.in);
//        marks[0]=input.nextInt();
//        marks[1]=input.nextInt();
//        marks[2]=input.nextInt();
//        marks[3]=input.nextInt();
//        marks[4]=input.nextInt();
//        rollNumber=input.nextInt();
//        System.out.println("The student with roll number " +rollNumber +" has scored " +marks[rollNumber] + " marks");
//    }
//}

//***************************************************


//class Source {
//    public static void main(String[] args) {
//
//        boolean a = true;
//        boolean b =false;
//        boolean c =true;
//        boolean res;
//        res = a||b&&!c;
//        System.out.println(res);
//    }
//}

//***************************************************

//import java.util.*;
//class Source {
//
//    public static void main(String[] args) {
//    int x,y;
//    boolean res;
//    Scanner in = new Scanner(System.in);
//    x = in.nextInt();
//    y = in.nextInt();
//    res = (x+y) > 30;
//       System.out.println("The statement said by the person is " + res);
//    }
//}

//***************************************************

//import java.util.*;
//class Source {
//
//    public static void main(String[] args) {
//
//        int X,Y;
//        Scanner input= new Scanner(System.in);
//        X=input.nextInt();
//        Y=input.nextInt();
//        boolean test;
//        test=(X+Y)>30;
//        System.out.println("The statement said by the person is "+test);
//    }
//}
//



//***************************************************

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        int x,y,a,b,hr;
//        boolean res;
//        Scanner in = new Scanner(System.in);
//        x = in.nextInt();
//        y = in.nextInt();
//        a = in.nextInt();
//        b = in.nextInt();
//        hr = in.nextInt();
//        res = ((x+y) > 30 && (a>3) || (b<6) && (hr==70));
//        System.out.println("The statement said by the person is " + res);
//    }
//}


//***************************************************

//Practice Question Num. 2). 1st one was MSQ....

//import java.util.Scanner;
//class Source {
//    public static void main(String[] args) {
//        //Create new Scanner
//        Scanner input = new Scanner(System.in);
//        //Values of each digit
//        int tenThousands, thousands, hundreds, tens, ones;
//        //Prompt user to input 5-digit number
//        int number = input.nextInt();
//        if (number > 99999) {
//            System.out.println("\nError! Number more than 5 digits.");
//        }
//        else if (number < 10000) {
//            System.out.println("Error! Number less than 5 digits.");
//        }
//        else if (10000<=number&&number<=99999){
//            tenThousands =(number/10000)%10;
//            System.out.println(+tenThousands);
//            thousands =(number/1000)%10;
//            System.out.println(+thousands);
//            hundreds =(number/100)%10;
//            System.out.println(+hundreds);
//            tens = (number/10)%10;
//            System.out.println(+tens);
//            ones = number%10;
//            System.out.println(+ones);
//        }
//    }
//}


//***************************************************

//Practice Question Num. 3).

//class Source {
//    public static void main(String[] args) {
//        int a=6,sum;
//        double b=5.5;
//        sum = (int)b+a;
//        System.out.println(sum);
//    }
//}


//***************************************************

//Practice Question Num. 4).

//class Source {
//    public static void main(String[] args) {
//        String names[];
//        names = new String[4];
//        names[0] = "Henry";
//        names[1] = "Shane";
//        names[2] = "Sharma";
//        names[3] = "Watson";
//        System.out.println(names[0] + " "  + names[2]);
//        System.out.println(names[1] + " " + names[3]);
//    }
//}

//***************************************************

//Practice Question Num. 5).

//import java.util.Scanner;
//class Source {
//    public static void main(String[] args) {
//        int myAge, ageOfBrother;
//        boolean check;
//        Scanner ip = new Scanner(System.in);
//        myAge = ip.nextInt();;
//        ageOfBrother = ip.nextInt();
//        check = (myAge<25)&&(ageOfBrother<25);
//        System.out.println(check);
//    }
//}

// Practice Question num. 5).
// UpGrad's Answer

//import java.util.Scanner;
// class No {
//    public static void main(String[] args) {
//        Scanner ip = new Scanner(System.in);
//        int a,b,c;
//        System.out.println("enter two numbers");
//        a = ip.nextInt();
//        b = ip.nextInt();
//        c = a*b;
//        System.out.println(c);
//    }
//}

//***************************************************

//Palindrom Code
//
//import java.util.*;
//class PalindromeExample
//{
//    public static void main(String args[])
//    {
//        int r,sum=0,temp;
//        int n;
//        Scanner ip = new Scanner(System.in);
//        n = ip.nextInt();
//        temp=n;
//        while(n>0){
//            r=n%10;
//            sum=(sum*10)+r;
//            n=n/10;
//        }
//        if(temp==sum)
//            System.out.println("palindrome number ");
//        else
//            System.out.println("not palindrome");
//    }
//}
//******************************************************************


//*******************************************************************

// Program to find if a number is positive or negative

//import java.util.*;
//class source
//{
//    public static void main(String args[])
//    {
//        int num;
//        Scanner ip = new Scanner(System.in);
//        num = ip.nextInt();
//        if(num>=0)
//        {
//            System.out.println("The number entered is positive");
//        }
//        else {
//            System.out.println("The number entered is negative");
//        }
//    }
//}

//*******************************************************************

// Program to find if a number odd or even

//import java.util.*;
// class Source {
//    public static void main(String[] args) {
//        int n;
//        Scanner ip = new Scanner(System.in);
//        n = ip.nextInt();
//        int m = n%2;
//        if (m==0)
//        {
//            System.out.println("The number entered is even");
//        }
//        else {
//            System.out.println("The number entered is odd");
//        }
//    }
//}

//*******************************************************************

//increasing order or decreasing order

//import java.util.*;
// class Source {
//     public static void main(String[] args)
//     {
//         int a,b,c;
//         Scanner ip = new Scanner(System.in);
//         a = ip.nextInt();
//         b = ip.nextInt();
//         c = ip.nextInt();
//         if (a<b && b<c && a<c) {
//             System.out.println("The numbers entered are in increasing order");
//         } else if (c>a && b>a && c>b) {
//             System.out.println("The numbers entered are in decreasing order");
//         }
//         else {
//             System.out.println("The number are in neither in increasing order nor in decreasing order");
//         }
//     }
//     }

//*******************************************************************

//Grading System Code

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        String name;
//        int marks;
//        Scanner input = new Scanner(System.in);
//        name = input.nextLine();
//        marks = input.nextInt();
//        if(marks==100)
//        {
//            System.out.println("The grade scored by " +name +" is A");
//        } else if (marks>=80 && marks<=100) {
//            System.out.println("The grade scored by " +name +" is B");
//        } else if (marks>=60 && marks<=80) {
//            System.out.println("The grade scored by " +name +" is C");
//        } else if (marks>=40 && marks<=60) {
//            System.out.println("The grade scored by " +name +" is D");
//        }else {
//            System.out.println("The grade scored by " +name +" is E");
//                }
//    }
//}

//*************************************************************************
//Truth or Falls Statement

//import java.util.*;
//class Source
//{
//    public static void main(String args[])
//    {
//        int a,b,x,y,heartRate;
//        Scanner ip = new Scanner(System.in);
//        a = ip.nextInt();
//        b = ip.nextInt();
//        x = ip.nextInt();
//        y = ip.nextInt();
//        heartRate = ip.nextInt();
//        if (x+y > 30 || a>3 || b<6 && heartRate == 70 || x>3)
//        {
//            System.out.println("The person is telling the truth");
//        }
//        else {
//            System.out.println("The person is lying");
//        }
//    }
//}

//*******************************************************************
//Smallest Number Among the 3 Enterd Numbers Using another variable...
//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//      Scanner ip = new Scanner(System.in);
//      int a,b,c,sml;
//      a =ip.nextInt();
//      b =ip.nextInt();
//      c =ip.nextInt();
//      if(a<b)
//      {
//          if (c<a) {
//              sml = c;
//          } else {
//              sml = a;
//          }
//      }else {
//          if(b<c) {
//              sml = b;
//          } else {
//              sml = c;
//          }
//      }
//      System.out.println(+sml +" is the smallest");
//        }
//    }

//*******************************************************************
//Smallest Number Among the 3 Entered Numbers without Using another variable...

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        Scanner ip = new Scanner(System.in);
//        int n1,n2,n3;
//        n1 =ip.nextInt();
//        n2 =ip.nextInt();
//        n3 =ip.nextInt();
//        if(n1<n2)
//        {
//            if (n3<n1) {
//                System.out.println("The smallest number entered is " +n3);
//            } else {
//                System.out.println("The smallest number entered is " +n1);
//            }
//        }else {
//            if(n2<n3) {
//                System.out.println("The smallest number entered is " +n2);
//            } else {
//                System.out.println("The smallest number entered is " +n3);
//            }
//        }
//    }


//*******************************************************************
// Coffee Machine Using Switch case
//import java.util.*;
//class Source
//{
//    public static void main (String[] args) {
//        Scanner ip = new Scanner(System.in);
//        int num;
//        num = ip.nextInt();
//        switch(num) {
//            case 1: {
//                System.out.println("Preparing Cappuccino");
//                break;
//            }
//            case 2: {
//                System.out.println("Preparing Espresso");
//                break;
//            }
//            case 3: {
//                System.out.println("Preparing Latte");
//                break;
//            }
//            case 4: {
//                System.out.println("Preparing Milk");
//                break;
//            }
//            default :
//            {
//               System.out.println("Drink not available");
//                break;
//            }
//            }
//        }
//   }


//*******************************************************************

//House Selector

//   import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        int n;
//        Scanner input= new Scanner(System.in);
//        n=input.nextInt();
//        switch (n) {
//            case 1:{
//                System.out.println(" Hufflepuff");
//                break;}
//            case 2:{
//                System.out.println(" Gryffindor");
//                break;}
//            case 3:{
//                System.out.println(" Slytherin");
//                break;}
//            case 4:{
//                System.out.println(" Ravenclaw");
//                break;}
//            default:{
//                System.out.println(" Enter a number from 1 to 4");}}}}

//*******************************************************************

//Find the Largest Number Among the 3 digits.

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        Scanner ip = new Scanner(System.in);
//        double n1, n2, n3;
//        n1 = ip.nextDouble();
//        n2 = ip.nextDouble();
//        n3 = ip.nextDouble();
//        if (n1 > n2) {
//            if (n1 > n3) {
//                System.out.println("The largest number entered is " + n1);
//            } else {
//                System.out.println("The largest number entered is " + n3);
//            }
//        } else {
//            if (n2 > n3) {
//                System.out.println("The largest number entered is " + n2);
//            } else {
//                System.out.println("The largest number entered is " + n3);
//            }
//        }
//    }
//}

//*******************************************************************

//import java.util.*;
//class Source
//{
//    public static void main(String[] args) {
//    int a =-12,b=2;
//    System.out.println((a/b)>0 && (b>0));
//    }
//}


//import java.util.*;
//class Source
//{
//    public static void main(String[] args) {
//
//        int length,breadth;
//        Scanner ip = new Scanner(System.in);
//        length = ip.nextInt();
//       breadth = ip.nextInt();
//       if (length == breadth) {
//           System.out.println("Square");
//       }
//       else {
//           System.out.println("Rectangle");
//       }
//    }
//}
//**********************************************************************************
//Vote System

//import java.util.*;
// class Source {
//    public static void main(String[] args) {
//        int age, vote;
//        Scanner input= new Scanner(System.in);
//        age=input.nextInt();
//        if (age >= 18){
//            vote=input.nextInt();
//            switch (vote) {
//                case 1: {
//                    System.out.println("You have voted for Ram");
//                }
//                break;
//                case 2: {
//                    System.out.println("You have voted for Shyam");
//                }
//                break;
//                case 3: {
//                    System.out.println("You have voted for Ghanshyam");
//                }
//                break;
//            }
//        } else{
//            System.out.println("You are not eligible");
//        }
//    }
//}

//**********************************************************************************

//Code for checking working day or sunday

//import java.util.*;
//class Source {
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        String month = scan.next();
//        int date = scan.nextInt();
//
//        int day = 0;
//        switch (month) {
//            case "January":
//                day = date;
//                break;
//            case "February":
//                day = 31 + date;
//                break;
//            case "March":
//                day = 31 + 28 + date;
//                break;
//            case "April":
//                day = 31 + 28 + 31 + date;
//                break;
//            case "May":
//                day = 31 + 28 + 31 + 30 + date;
//                break;
//            case "June":
//                day = 31 + 28 + 31 + 30 + 31 + date;
//                break;
//            case "July":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + date;
//                break;
//            case "August":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + date;
//                break;
//            case "September":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date;
//                break;
//            case "October":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
//                break;
//            case "November":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
//                break;
//            case "December":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
//                break;
//            default:
//                System.out.println("Invalid input");
//        }
//        int dayNumber = day % 7;
//        // since day 1 is Monday
//        if (dayNumber == 0 || dayNumber == 6) {
//            System.out.print("Hurray!");
//        } else {
//            System.out.print("Ohhh! It's a work day :|");
//        }
//        scan.close();
//    }
//}

//**********************************************************************************

//tax payment code

//Code to calculate tax

//import java.util.Scanner;
//class Source {
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        // Enter annual income
//        double income = scan.nextDouble();
//        // Enter age
//        int age = scan.nextInt();
//        double minimumAllowedIncome;
//        if ((age > 60) && (age <= 80)) {
//            minimumAllowedIncome = 300000;
//        } else if (age > 80) {
//            minimumAllowedIncome = 500000;
//        } else {
//            minimumAllowedIncome = 250000;
//        }
//        double tax = 0.0;
//        if (income > minimumAllowedIncome && income <= 500000.00) {
//            tax = 0.1 * (income - minimumAllowedIncome);
//        } else if (income > 500000.00 && income <= 1000000.00) {
//            tax = 0.1 * (500000 - minimumAllowedIncome) + 0.2 * (income - 500000);
//        } else if (income > 1000000.00) {
//            tax = 0.1 * (500000 - minimumAllowedIncome) + 0.2 * (1000000 - 500000) + 0.3 * (income - 1000000);
//        }
//        System.out.print(tax);
//        scan.close();
//    }
//}

//**********************************************************************************

//Prctice Question..

//import java.util.*;
//class Source {
//    public static void main(String[] args){
//        Scanner ip = new Scanner(System.in);
//        int scores = ip.nextInt();
//        String nationality = ip.next();
//        boolean a = (scores > 90);
//        boolean b = (nationality.equals("Indian"));
//        boolean c = scores > 95;
//        if (scores <= 100) {
//            if (!((a && b) || (!b && c))) {
//                System.out.println("Output 1");
//            } else {
//                System.out.println("Output 2");
//            }
//        } else {
//            System.out.println("Invalid Score");
//        }
//    }
//}

//**********************************************************************************

//Code to Write Odd Numbers in Reverse Order from 25

//class Source {
//    public static void main(String[] args) {
//        int num = 25;
//        while (num >= 0) {
//            System.out.print(num + " ");
//            num = num-2;
//        }
//    }
//}

//**********************************************************************************
//Code to Write number till the given number

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        int n;
//        Scanner input= new Scanner(System.in);
//        n=input.nextInt();
//        int m=1;
//        while (m<=n) {
//            System.out.println(m);
//            m++;
//        }
//    }
//}

//**********************************************************************************
//Code to Write Multiplication of num1 till num2

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        int x,n;
//        Scanner input= new Scanner(System.in);
//        x=input.nextInt();
//        n=input.nextInt();
//        int i=1;
//        while(i<=n) {
//            System.out.println(x*i);
//            i++;
//        }
//    }
//}

//**********************************************************************************
//Code to print alphabet from Numbers ASCII values...

import java.util.*;
//class Source {
//
//    public static void main(String[] args) {
//        int i=97;
//        while (i<=122) {
//            System.out.print((char)i +" ");
//            i++;
//        }
//    }
//}

//********************************************************

//class Source {
//public static void main(String[] args) {
//        int n=2;
//        for (int i=12-n; i>2;i=i-n){
//        System.out.println(i);
//        }
//        }
//}

//********************************************************

//class Source {
//    public static void main(String args[]) {
//        for (int number = 1; number <= 100; number++) {
//            System.out.print(number+ " ");
//            number++;
//        }
//    }
//}

//********************************************************
//Code for divisible numbers by 8 but not 6 b/w 2000 & 3000

//class Source {
//    public static void main(String[] args) {
//        int i;
//        for (i=2000;i<=3000;i++) {
//            if (i%8==0 && i%6!=0) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//}

//********************************************************

//import java.util.Scanner;
//
//class Source {
//    public static void main(String arg[]) {
//        int sum = 0;
//        Scanner scan = new Scanner(System.in);
//        //Enter the number upto which you wish to find the sum, in the input console
//        int number = scan.nextInt();
//
//        for (int i = 1; i <= number; i++) {
//            sum = sum + i;
//        }
//
//        System.out.print(sum);
//    }
//}

//********************************************************
//Print n number in reverse till 0

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        int n;
//        Scanner input= new Scanner(System.in);
//        n=input.nextInt();
//        for (int i=n;i>=0;i--){
//            System.out.println(i);
//        }
//    }
//}

//********************************************************
//Int type average calculator by taking n number of values from the user

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        int n=input.nextInt();
//        int sum=0,number;
//        for (int i=0;i<n;i++){
//            number=input.nextInt();
//            sum=sum+number;
//        }
//        int average=sum/n;
//        System.out.print(average);
//    }
//}

//********************************************************

// Test Questions....

//class Source {
//        public static void main(String[] args) {
//            int counter=0;
//            do{
//                counter=counter+1;
//                System.out.println(counter);
//            }while (counter<12);
//        }
//    }

//    class Source {
//    public static void main(String[] args) {
//        boolean test = false;
//        do {
//            System.out.println("Hello world");
//        } while (test);
//    }
//    }

//class Source {
//    public static void main(String[] args) {
//        int i = 0;
//        do {
//            i++;
//            System.out.println(i);
//        } while (i<99);
//    }
//}

//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        int n;
//        Scanner input= new Scanner(System.in);
//        n=input.nextInt();
//        int counter=n;
//        do {
//            System.out.println(counter);
//            counter--;
//        } while (counter>=0);
//    }
//}

//Code to find the total numbers in a digit
//import java.util.*;
//class Source {
//    public static void main(String[] args) {
//        int n,c=0;
//        Scanner input= new Scanner(System.in);
//        n=input.nextInt();
//        do {
//            n = n/10;
//            c++;
//        }while(n>0);
//        System.out.println(c);
//    }
//}

//class Source {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 12; i++) {
//            System.out.println(i);
//
//            if (i > 4 && i < 8) {
//                continue;
//            } else if (i == 5) {
//                break;
//            }
//        }
//    }
//}


//********************************************************
//code to find hcf

import java.util.*;
class Source {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter number 1 in the Input Console
        int num1 = scan.nextInt();
        // Enter number 2 in the Input Console
        int num2 = scan.nextInt();
        int a = num1;
        int b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int hcf = a;
        System.out.print(hcf);
    }
}


