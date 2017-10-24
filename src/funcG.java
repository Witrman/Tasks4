import java.util.Scanner;

public class funcG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] x = sc.nextLine().toCharArray();
        for (int i = x.length-1; i >=0 ; i--) {
            System.out.print(x[i]);
        }
    }
}
