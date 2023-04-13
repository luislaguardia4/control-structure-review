import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        // control sructure

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter row coordinates: ");
        int x = sc.nextInt();

        System.out.print("Enter column coordinates: ");
        char y = sc.next().charAt(0);

        int ascii = (int) y;
        int sum = x + ascii;
        int BlockColor = sum % 2;

        switch (BlockColor) {
            case 0:
                System.out.println(x + "" + y + " is a BLACK BLOCK");
                break;
            case 1:
                System.out.println(x + "" + y + " is a WHITE BLOCK");
                break;
        }

    }
}
