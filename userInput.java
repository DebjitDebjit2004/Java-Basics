import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        int roll_no = sc.nextInt();

        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll_no);
    }
}
