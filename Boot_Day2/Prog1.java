import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.nextLine();

        System.out.print("Enter age:");
        int age = sc.nextInt();

        System.out.print("Enter Boolean:");
        Boolean boolean1 = sc.nextBoolean();

        System.out.print("Enter Float:");
        float float1 = sc.nextFloat();

        System.out.print("Name: " + name + "\n" + "Age: " + age + "\n" + "Boolean: " + boolean1 + "\n" + "Float: " + float1);
    }
}
