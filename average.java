import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of Mathematics: ");
        double math = sc.nextDouble();

        System.out.print("Enter Marks of Cpmputer Science: ");
        double compSC = sc.nextDouble();

        System.out.print("Enter Marks of Physics: ");
        double phys = sc.nextDouble();

        double avg = (math + compSC + phys) / 3;

        System.out.println("Average Marks is: "+avg);
    }
}
