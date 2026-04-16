import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Min {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = br.readLine();
            int num = Integer.parseInt(s);
            if(s.equals("0")) break;
            
            int cnt = 0;
            while (!check(s)) {
                num += 1;
                cnt += 1;
                s = convertToString(num, s.length());
            }
            System.out.println(cnt);
        }
    } 
    
    private static boolean check(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left += 1;
            right -= 1;
        }
        return true;
    }

    private static String convertToString(int num, int len) {
        String numString = Integer.toString(num);
        String s = "";

        for(int i = 0; i < len - numString.length(); i++) {
            s += "0";
        }

        return s + numString;
    }
}
