import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        for(int i = 1;i <= n;i++) {
            for(int j = 1;j <= i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}