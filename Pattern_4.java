import java.util.Scanner;

public class Pattern_4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int star = n;
        int space = 0;
for(int r= 1;r<=n;r++){
        for (int csp = 1; csp <= space; csp++) {
            System.out.print("  ");
        }
        for (int cst = 1; cst <= star; cst++) {
            System.out.print("* ");
        }
        space++;
        star--;
        System.out.println();
    }

    }
}
