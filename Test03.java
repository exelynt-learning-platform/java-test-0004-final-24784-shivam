// This test evaluates the candidate’s understanding of conditional logic and alternating value patterns in Java.

// The candidate must implement a Java program that prints the required binary triangle pattern using nested loops and logical conditions. The output must strictly follow the pattern structure provided.

// Program

// Write a Java program to print the following pattern:

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// 0 1 0 1 0 1

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        System.out.print("Enter your size :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println();
        int t=1;
        for(int i=0;i<a;i++){
            if(i%2==0)
                t=1;
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
              System.out.print(t);
              t--;
                }else{
                   System.out.print(t);
                    t++;
                }
            }
            System.out.println();
        }
    }
}
