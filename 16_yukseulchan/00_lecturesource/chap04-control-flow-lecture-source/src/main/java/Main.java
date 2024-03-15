import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<List<Character>> dial = new ArrayList<>();
        List<Character> temp = Arrays.asList('ㄱ');
        dial.add(temp);
        temp = Arrays.asList(' ');
        dial.add(temp);
        temp = Arrays.asList('A', 'B', 'C');
        dial.add(temp);
        temp = Arrays.asList('D', 'E', 'F');
        dial.add(temp);
        temp = Arrays.asList('G', 'H', 'I');
        dial.add(temp);
        temp = Arrays.asList('J', 'K', 'L');
        dial.add(temp);
        temp = Arrays.asList('M', 'N', 'O');
        dial.add(temp);
        temp = Arrays.asList('P', 'Q', 'R', 'S');
        dial.add(temp);
        temp = Arrays.asList('T', 'U', 'V');
        dial.add(temp);
        temp = Arrays.asList('W', 'X', 'Y', 'Z');
        dial.add(temp);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char c=input.charAt(i);
        }
    }
}
