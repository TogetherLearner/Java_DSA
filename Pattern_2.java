import java.util.Scanner;

class Pattern_2{
  public static  Scanner sc= new Scanner(System.in);
   public static void main(String[] args) {
    int n = sc.nextInt();
    int star= 1;
    for(int r=1;r<=n;r++){
            for(int i=0;i<star;i++){
                System.out.print("* ");
            }
            star++;
            System.out.println();
        }
   }
}