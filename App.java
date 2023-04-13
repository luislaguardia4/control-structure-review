import java.util.Scanner;

// equilateral has 3 equal sides
// isoceles has two equal sides
// scalene has no equal sides

public class App {

    public static void main(String[] args) throws Exception {
        // control sructure

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter lenght of side [1]: ");
        int s1 = sc.nextInt();

        System.out.print("Enter lenght of side [2]: ");
        int s2 = sc.nextInt();

        System.out.print("Enter lenght of side [3]: ");
        int s3 = sc.nextInt();

        if ((s1 == s2 && s2 == s3))
            System.out.print("this is equilateral");
        else if ((s1 != s2) && (s2 != s3) && (s1 != s3))
            System.out.println("this is scalene");
        else
            System.out.println("this is isosceles");
            
    }
}
