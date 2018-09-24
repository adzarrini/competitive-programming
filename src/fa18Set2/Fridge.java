import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class Fridge {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double num;
        for(int i = 0; i <9; i++) {
            num = Math.pow(2,i)*Math.pow(2,16)/(16000);
            System.out.println("1:" + i + "\t" + num);
        }
    }
}