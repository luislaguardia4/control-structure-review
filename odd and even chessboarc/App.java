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

        int mod_x = x % 2;
        int mod_y = ascii % 2;

        if (mod_x == 0 && mod_y == 0) {
        System.out.println(x + "" + y + " is Black block");
        } else if (mod_x == 0 && mod_y == 1) {
        System.out.println(x + "" + y + " is White block");
        } else if (mod_x == 1 && mod_y == 1) {
        System.out.println(x + "" + y + " is Black block");
        } else if (mod_x == 1 && mod_y == 0) {
        System.out.println(x + "" + y + " is White block");
        }
