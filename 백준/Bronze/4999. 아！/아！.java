import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        if (!a.contains(b)) {
            System.out.println("no");
        }
        else{
            System.out.println("go");
        }
    }
}