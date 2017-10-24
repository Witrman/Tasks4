import java.util.Scanner;

public class funcF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(SumOfDigits(x));
    }
    private  static int   SumOfDigits(int x)
    {
        int sum = 0;
       while(x>0)
       {
           sum+=x%10;
           x/=10;
       }
       return  sum;

    }
}
