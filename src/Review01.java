
public class Review01 {

    public static void main(String[] args) {
        int num1 = 1000;
        int num2 = 10;
        int result;
        result = tax(num1, num2);
        System.out.println(num1 + "円の商品の税込価格は" + (num1 + result) + "円（消費税は" + (num1 / num2) + "円）です。");
    }
    public static int tax(int num1, int num2) {
        int result = num1 / 100 * num2;
        return result;
    }
}