import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        
        System.out.println("input the marks of 5 subjects");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st mark:");
        int a =sc.nextInt();
        System.out.println("Enter 2nd mark:");
        int b =sc.nextInt();
        System.out.println("Enter 3rd mark:");
        int c =sc.nextInt();
        System.out.println("Enter 4th mark:");
        int d =sc.nextInt();
        System.out.println("Enter 5th mark:");
        int e =sc.nextInt();

        int total =a + b + c + d + e;
        System.out.print("total number is:=");
        System.out.println(total);

        double gross = total/5;
        System.out.print("average mark= ");
        System.out.println(gross);
    
    }
}
