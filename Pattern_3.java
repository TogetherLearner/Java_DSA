import java.util.Scanner;
public class Pattern_3 {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int star=n;
 for(int r=1;r<=n;r++){
        for(int cst=1;cst<=star;cst++){
            System.out.print("* ");
        }
        star--;
        System.out.println();
    }
    }
}
