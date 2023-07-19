import java.util.Scanner;

public class ToggleCase {
    static String toggleCase(String string){
        char[] S = string.toCharArray();
        String str = "";
        for(int i = 0; i < S.length; i++){
            S[i] = (char)(S[i] ^ (1 << 5));
            str = str+S[i];
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(toggleCase(string));
    }
}
