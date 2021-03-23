import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Judgment {
    
    public void jug() {
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
            message = "正解です!";
        }
        System.out.println(message);
        
    }
}
