import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(n);
for(int i=1;i<=n;i++){
    String k = "*";
    System.out.println(k.repeat(i));
}
        
    }
}