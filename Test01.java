// This assessment evaluates the candidate’s understanding of Java nested loops,
//  spacing control, and pattern construction. 
// Candidates are required to develop a Java program that generates the
//  specified pattern exactly as shown.

// The solution should demonstrate proper use of loop structures, 
// logical problem-solving, and output formatting. 
// The output must match the required pattern precisely, including spaces and alignment.
// Program

// Write a Java program to print the following pattern exactly:

//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *
import java.util.Scanner;
class Test01{
    public static void main(String args[]){
        System.out.print("Enter your size :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println();
        for(int i=0;i<a;i++){
            for(int j=0;j<(2*a);j++){
                 if(j>=a-i-1 && j<=a+i-1){
                      if(j==a-i-1 || j==a+i-1){
                  System.out.print("*");}
                   else{
                     System.out.print(" ");}
                 }else{
                    System.out.print(" ");
                 }
            }
            System.out.println();
        }
        a=a-1;
        for(int i=0;i<a;i++){
            for(int j=0;j<(2*(a));j++){
                 if(j>=i && j<=(2*a)-1-i){
                      if(j==i ){
                  System.out.print(" *");}
                  if(j==(2*a)-3-i)
                    System.out.print("*");
                   else{
                     System.out.print(" ");}
                 }else{
                    System.out.print(" ");
                 }
            }
            System.out.println();
        }
    }
}