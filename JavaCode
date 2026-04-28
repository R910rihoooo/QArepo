import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Java簡易電卓 ---");

        // 数値の入力
        System.out.print("1つ目の数値を入力してください: ");
        double num1 = scanner.nextDouble();

        System.out.print("演算子を選択してください (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("2つ目の数値を入力してください: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean success = true;

        // 計算処理
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("エラー: 0で割ることはできません。");
                    success = false;
                }
                break;
            default:
                System.out.println("エラー: 無効な演算子です。");
                success = false;
        }

        // 結果の表示
        if (success) {
            System.out.println("計算結果: " + num1 + " " + operator + " " + num2 + " = " + result);
        }

        scanner.close();
    }
}
