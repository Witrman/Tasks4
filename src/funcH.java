import java.util.Scanner;

public class funcH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
        System.out.println(IsPalindrome(x) );
}
 private static int IsPalindrome(int x)
 {
     int sum =0;
     for (int i = 1; i <= x; i++) {
         if (i==sdf(i))
         {
             sum++;
         }
     }
     return sum;
 }
 private  static int sdf(int v)
 {
     char[] g = Integer.toString(v).toCharArray();
     v=0;
     for (int i = g.length-1; i >=0 ; i--) {
         v+=(g[i]-48)*Math.pow(10,i);
     }
     return v;
 }
}
