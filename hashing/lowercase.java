import java.util.Scanner;

public class lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int hash[] = new int[26];
        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i)-'a']++;
        }
        String c = sc.nextLine();
        char ch = c.charAt(0);
        System.out.println(hash[ch-'a']);
    }
}
