import java.util.*;

import javax.sound.midi.Soundbank;
class Pattern_1{
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] adgd){
      System.out.println("Enter the Value of n ");
         int n= sc.nextInt();
      int   nsp=n-1;
      int  nst=1;

      // main loop
      for(int r=1;r<=n;r++){
    //   for Space printing 
      

      for(int csp=1;csp<=nsp;csp++){
        System.out.print("  ");
      }

      // for Star printing 
       for(int cst=1;cst<=nst;cst++){
        System.out.print("* ");
       }
       nst++;
       nsp--;
       System.out.println();
      }

    }

}