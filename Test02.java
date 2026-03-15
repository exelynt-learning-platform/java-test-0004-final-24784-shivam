// This assessment evaluates the candidate’s ability to implement number-based patterns using nested loops in Java. The candidate must create a program that correctly generates the required mirrored number pyramid.

// Program
// Write a Java program to print the following pattern exactly:

//         1
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1

import java.util.Scanner;
class Test02{
    public static void main(String args[]){
        System.out.print("Enter your size :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println();
        int k=1;
        for(int i=0;i<a;i++){
            k=1;
            for(int j=0;j<(2*a);j++){
                 if(j>=a-i-1 && j<=a+i-1){
                    if(j<a)
                  System.out.print(k++);
                  else{
                    if(j==a){
                    k=k-1; } 
                    System.out.print(--k);
                 }
                }else{
                    System.out.print(" ");
                 }
            }
            System.out.println();
        }
        
    }
}