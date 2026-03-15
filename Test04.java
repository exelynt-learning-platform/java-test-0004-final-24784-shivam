// This assessment evaluates the candidate’s understanding of matrix-style pattern generation and layered number logic using Java loops.

// Candidates are required to develop a Java program that prints a concentric number square pattern. The solution must demonstrate the ability to handle multi-level loop control and number placement logic.

// Program

// Write a Java program to print the following pattern:

// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
         System.out.print("Enter your size :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println();
        int k=a;
        int count=0;
        int revcount=0;
        for(int i=0;i<2*a-1;i++){
            k=a;
            count=0;
            revcount=0;
            for(int j=0;j<2*a-1;j++){
                if(i<a){
                  if(j<a){
                  System.out.print(k);
                  if(count<i){
                    k=k-1;
                    count++;
                  }
                }else{
                  if(revcount<i && j>(2*a)-2-i){
                    k=k+1;
                    revcount++;
                  }  
                System.out.print(k);               
            }
        }else{
            if(j<a){
                  System.out.print(k);
                  if(count<2*a-2-i){
                    k=k-1;
                    count++;
                  }
                  
                }else{

                       System.out.print(k);
                  if(revcount<(2*a-2-i) && j>=i){
                    k=k+1;
                    revcount++;
                  }
                  
                            
            }

        }
                  
            }
            System.out.println(" ");
        }

    }
}
