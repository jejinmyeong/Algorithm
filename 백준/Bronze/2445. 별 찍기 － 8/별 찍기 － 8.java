import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1 ; i <= N ; i++) {
            for (int j = 1 ; j <= i ; j++) sb.append("*");
            for (int j = 1 ; j <= 2 * (N - i) ; j++) sb.append(" ");
            for (int j = 1 ; j <= i ; j++) sb.append("*");

            sb.append("\n");
        }

        for (int i = N - 1 ; i > 0 ; i--) {
            for (int j = 1 ; j <= i ; j++) sb.append("*");
            for (int j = 1 ; j <= 2 * (N - i) ; j++) sb.append(" ");
            for (int j = 1 ; j <= i ; j++) sb.append("*");

            sb.append("\n");
        }

        System.out.println(sb);

    }
}