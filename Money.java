import java.util.Scanner;
public class Money {
    public static void main (String[] args){ 
        int n, x, money;
        Scanner sc = new Scanner(System.in);
        System.out.print("金額xを入力してください>>");
        x= sc.nextInt();
        System.out.print("支払い金額nを入力してください>>");
        n= sc.nextInt();

        money= n- x;  
        System.out.println("おつりは"+ money+ "円です");

        System.out.println("500円玉の枚数は"+  money/ 500+ "枚です");
        System.out.println("100円玉の枚数は"+ (money% 500)/ 100+ "枚です");
        System.out.println(" 50円玉の枚数は"+ (money% 500 % 100)/ 50+ "枚です");
        System.out.println(" 10円玉の枚数は"+ (money% 500 % 100%  10)/ 10+ "枚です");
    }
}
