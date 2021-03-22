import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("第一問");
        System.out.println("アメリカの首都はどこでしょうか？");
        System.out.println("[1] 1: ニューヨーク");
        System.out.println("[2] 2: ワシントン");
        System.out.println("[3] 3: ロサンジェルス");
        System.out.println("答えを番号で入力し、[Enter]を押してください！");

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        int answer = 0;
        String message = "不正解です。";
        try {
            String buf = bufferedReader.readLine();
            answer = Integer.parseInt(buf);
        } catch (Exception exception) {
            answer = 0;
            message = "答えを番号で入力してください。";
        }
        if (answer == 2) {
            message = "正解です。";
        }
        System.out.println(message);
        
    }
}