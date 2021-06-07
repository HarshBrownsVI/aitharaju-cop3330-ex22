/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;
public class Ex22
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter the first number: ");
        num1 = kb.nextInt();
        System.out.print("Enter the second number: ");
        num2 = kb.nextInt();
        System.out.print("Enter the third number: ");
        num3 = kb.nextInt();
        int max = num1;
        if(num2 > max && num2 > num3)
            max = num2;
        else if(num3 > max && num3 > num2)
            max = num3;
        System.out.print("The largest number is " + max);
    }
}
