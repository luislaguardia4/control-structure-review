import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
      
      //switch case

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter row coordinates: ");
        int x = sc.nextInt();

        System.out.print("Enter column coordinates: ");
        char y = sc.next().charAt(0);

        int ascii = (int) y;
        int mod_x = x % 2;
        int mod_y = ascii % 2;

        switch (mod_x) {

            case 0:
                switch (mod_y) {
                    case 0:
                        System.out.println(x + "" + y + " is a BLACK BLOCK");
                        break;
                    case 1:
                        System.out.println(x + "" + y + " is a WHITE BLOCK");
                        break;
                }
                break;
            case 1:
                switch (mod_y) {
                    case 0:
                        System.out.println(x + "" + y + " is a WHITE BLOCK");
                        break;
                    case 1:
                        System.out.println(x + "" + y + " is a BLACK BLOCK");
                        break;
                }
                break;
        }

    }
}
