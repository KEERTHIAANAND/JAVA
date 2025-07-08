import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prog2 {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter String:");
        String str1 = br.readLine();

        System.out.print("Enter number:");
        int num = Integer.parseInt(br.readLine());

        System.out.print("Enter Boolean:");
        Boolean bool1 = Boolean.parseBoolean(br.readLine());

        System.out.print("Enter Float:");
        Float flo = Float.parseFloat(br.readLine());

        System.out.print("String: " + str1 + "\n" + "Num: " + num + "\n" + "Boolean: " + bool1 + "\n" + "Float: " + flo);
    }  
}
