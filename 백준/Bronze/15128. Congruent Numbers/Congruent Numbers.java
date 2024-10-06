import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double p1 = Double.parseDouble(st.nextToken());
        double q1 = Double.parseDouble(st.nextToken());
        double p2 = Double.parseDouble(st.nextToken());
        double q2 = Double.parseDouble(st.nextToken());

        if((p1 * p2) % (q1 * q2 * 2) == 0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
