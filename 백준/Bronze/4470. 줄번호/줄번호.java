import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1 ; i <= N ; i++) {
            sb.append(i).append(". ").append(br.readLine()).append("\n");
        }

        System.out.print(sb);
    }
}