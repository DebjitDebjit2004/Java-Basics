public class simple_Interest {
    public static void main(String[] args) {
        double principle = 15000;
        double rate = 5.5;
        double time = 3.5;

        double si = (principle * rate * time)/100;
        System.out.println("Simple Interest is "+si);
    }
}
