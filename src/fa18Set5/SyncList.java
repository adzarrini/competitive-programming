import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SyncList {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        while((N = Integer.parseInt(br.readLine())) != 0) {
            Map<Integer, Integer> map = new HashMap<>();
            int list1[] = new int[N];
            int list2[] = new int[N];
            int list1cp[] = new int[N];
            for(int i = 0; i < N; i++) {
                list1[i] = Integer.parseInt(br.readLine());
                list1cp[i] = list1[i];
            }
            for(int i = 0; i < N; i++) {
                list2[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(list1);
            Arrays.sort(list2);
            for(int i = 0; i < N; i++) {
                map.put(list1[i],list2[i]);
            }
            for(int i = 0; i < N; i++) {
                System.out.println(map.get(list1cp[i]));
            }
            System.out.println();
        }
    }
}
